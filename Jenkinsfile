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
                  
                  echo 'Tests Executed'
              }

                }
			stage ('Deploy') {
                    
              steps {
                  
                  echo 'Started running the eurekaclient jar'
                  sh 'java -jar ./target/eurekaclient-0.0.1-SNAPSHOT.jar'
              }

                }

      }

}