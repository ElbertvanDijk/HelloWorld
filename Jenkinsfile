node {
	stage'Checkout'
	git url: 'https://github.com/ElbertvanDijk/HelloWorld.git'
	
	stage 'Build'
	sh "mvn clean package"
	
	stage 'Dummy'
}