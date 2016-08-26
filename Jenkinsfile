node {
	stage 'Checkout'
	echo 'Checkout from GitHub'
	git url: 'https://github.com/ElbertvanDijk/HelloWorld.git'
	
	stage 'Build'
	echo 'Build with maven'
	sh "mvn clean package -Dmaven.test.skip=true"
   
	stage 'Unit Test'
	echo 'Run the JUnit unit tests'
	sh 'mvn test'
	junit '**/target/surefire-reports/*.xml'
   
	stage 'Archive Artifact'
	echo 'Archive the jar and the test results'
	archiveArtifacts artifacts: '**/target/*.jar, **/target/surefire-reports/*.xml', fingerprint: true
	
	stage 'Static Code Analisys'
	echo 'Run SonarQube'
	sh "mvn sonar:sonar"
}