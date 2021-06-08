pipeline {

      agent any 
      
      triggers {
          pollSCM '* * * * *'
      }
      
      stages {
          
          stage ('Build'){
              
              steps {
                  
                  echo 'Build Completed'
              }

          }
          
          stage ('Test') {
                    
              steps {
                  
                  echo 'Tests Executed'
              }

                }


      }

}