pipeline {

      agent any 
      
      triggers {
          pollSCM '* * * * *'
      }
      
      stages {
          
          stage ('Build'){
              
              steps {
                  sh 'mvn install'
              }
          }
          
          stage ('Test') {
                    
              steps {
                  
                  echo 'Test completed'
              }

                }
			stage ('Build Docker Image') {
                    
              steps {
                  
                  sh 'docker build -t karimulla1230/jenkins-aws-deployment .'
              }

                }
                
            stage ('Push Docker Image') {
                environment {
                DOCKER_HUB_LOGIN = credentials('docker-hub')
            }
              steps {
                  sh 'docker login --username=$DOCKER_HUB_LOGIN_USR --password=$DOCKER_HUB_LOGIN_PSW'
                  sh 'docker push karimulla1230/jenkins-aws-deployment'
                  echo 'Pushed the docker image successfully'
              }

                }	
                
                     
            stage ('Running Docker Image In AWS EC2 Instance') {
              steps {
                  sh'docker run -p 80:8080  karimulla1230/jenkins-aws-deployment'
                  echo 'Running the docker image in ec2 instance successfully'
              }

                }

      }

}