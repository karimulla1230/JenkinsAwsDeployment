pipeline {
     agent any

     environment {
        AWS_ACCESS_KEY_ID     = credentials('jenkins-aws-secret-key-id')
        AWS_SECRET_ACCESS_KEY = credentials('jenkins-aws-secret-access-key')
    }      

    stages {
        stage('Build') {
         steps {
            echo 'Inside Build'
         }
        }
        stage('Test') {
            steps{
             echo  'Inside Test'
            }
        }
        stage('Publish') {
            steps {
                sh './mvnw package'
                // bat '.\mvnw package'
            }
        }
    }
}