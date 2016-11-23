package hello;

import io.swagger.annotations.ApiOperation;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @ApiOperation(value = "name", nickname = "Greeting", tags = {"Greeting", "Get"})
    @RequestMapping(method = RequestMethod.GET, path = "/greeting", produces = {"application/json"})
    public Greeting greeting(@RequestParam(value="name", defaultValue="Wereld") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
