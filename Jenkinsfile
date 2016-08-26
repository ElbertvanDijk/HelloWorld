node {
	stage'Checkout'
	git url: 'https://github.com/ElbertvanDijk/HelloWorld.git'
	
	stage 'Build'
	sh "mvn clean package"
	
	stage 'Archive Artifacts'
	archiveArtifacts 'gs-actuator-service-0.1.0.jar'
	
	stage 'Static Code Analisys'
	sh "mvn sonar:sonar"
}