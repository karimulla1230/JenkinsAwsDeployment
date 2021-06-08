pipeline {

      agent any 
      
      triggers {
          pollSCM '* * * * *'
      }
      
      stages {
          
          stage ('Build'){
              
              steps {
                  
                  echo 'mvn clean install'
              }

          }
          
          stage ('Test') {
                    
              steps {
                  
                  echo 'Tests Executed'
              }

                }


      }

}