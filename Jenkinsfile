
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
				sh './gradlew clean build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
				sh './gradlew clean check'
            }
			
        }
        stage('Pachage') {
            steps {
                echo 'Deploying....'
				sh './gradlew clean war'
            }
			
        }
		stage('CodeQuality') {
            steps {
                echo 'Sonar....'
				sh './gradlew sonarqube -Dsonar.host.url=http://10.28.133.26:9000'
            }
        }
    }
}
