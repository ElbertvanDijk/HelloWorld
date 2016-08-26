node {
	stage'Checkout'
	git url: 'https://github.com/ElbertvanDijk/HelloWorld.git'
	
	stage 'Build'
	sh "mvn clean package"
   
	stage 'Archive Artifact'
	archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
	
	stage 'Static Code Analisys'
	sh "mvn sonar:sonar"
}