pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build & Test') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("quote-generator:")
                }
            }
        }
    }
    post {
        success {
            echo 'Pipeline completed successfully! Java app built and containerized.'
        }
        failure {
            echo 'Pipeline failed. Please check the logs.'
        }
    }
}
