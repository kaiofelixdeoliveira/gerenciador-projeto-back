
	node("master") {

	try {	         


	stage('SCM') {

	git branch: 'master', 
	credentialsId: 'bitbucket', 
	url: 'https://kaiofelixdeoliveira@bitbucket.org/kaiofelixdeoliveira/gerenciadorprojeto-back.git'
	}

	stage('Mvn Package'){

	sh 'mvn clean package'
	}

	stage('SonarQube analysis') {

	withSonarQubeEnv('sonarqube') {

	sh 'mvn sonar:sonar -Dsonar.projectKey=gerenciadorprojeto-back -Dsonar.host.url=http://127.0.0.1:9000 -Dsonar.login=9e25125cd2c7897ba6ced991e52cc606f90cbe32'

	}

	}
	stage('Test') { 

	sh 'mvn test' 

	}

	stage('Publish test junit results') {

	junit 'target/surefire-reports/*.xml'


	} 
	stage('Publish test jacoco results') {

	junit 'target/surefire-reports/*.xml'

	step([$class: 'JacocoPublisher', 
	execPattern: 'target/*.exec',
	classPattern: 'target/classes',
	sourcePattern: 'src/main/java',
	exclusionPattern: 'src/test*'
	])

	} 

	//stage('Email Sucess')
	//{

	//emailext (
	//	to: 'kaio.felix.oliveira.mail@gmail.com',
	//	subject: "Sucess Pipeline: ${currentBuild.fullDisplayName}",
	//	body: "Sucess with ${env.BUILD_URL}"
	//	)	 
	//}




	}catch (e) {

	stage('Email Failed')
	{

	emailext (
	to: 'kaio.oliveira@gmail.com.br',
	subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
	body: "Something is wrong with ${env.BUILD_URL}"
	)	 
	}


	throw e
	}


	}

