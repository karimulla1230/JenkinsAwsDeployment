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


      }

}