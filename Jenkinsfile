node {
	stage'Checkout'
	git url: 'https://github.com/ElbertvanDijk/HelloWorld.git'
	
	stage 'Build'
	sh "mvn clean package"
   
   stage ' Unit Test'
   junit '**/target/surefire-reports/*.xml'
   
	stage 'Archive Artifact'
	archiveArtifacts artifacts: '**/target/*.jar, **/target/surefire-reports/*.xml', fingerprint: true
	
	stage 'Static Code Analisys'
	sh "mvn sonar:sonar"
}