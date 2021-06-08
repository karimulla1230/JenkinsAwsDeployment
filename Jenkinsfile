pipeline {

      agent any 
      
      triggers {
          pollSCM '* * * * *'
      }
      
      stages {
          
          stage ('Build'){
              
              steps {
                  
                  sh 'Build Completed'
              }

          }
          
          stage ('Test') {
                    
              steps {
                  
                  echo 'Tests Executed'
              }

                }


      }

}