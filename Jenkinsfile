
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
        stage('Deploy') {
            steps {
                echo 'Deploying....'
				sh './gradlew clean war'
            }
        }
		stage('CodeQuality') {
            steps {
                echo 'Sonar....'
				sh './gradlew sonarqube -Dsonar.host.url=http://sonarqube:9000'
            }
        }
    }
}
