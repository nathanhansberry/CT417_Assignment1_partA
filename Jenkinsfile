pipeline {
  
  agent any
 
  stages{
    
    stage("Compile Stage"){
      
      steps {
        echo 'Compiling and building the project.'
        bat "gradlew compileJava"
      }
    }
    
    stage("Testing Stage"){
      
      steps {
        echo 'Testing the project.'
        bat "gradlew test" //--tests SampleTest"
      }
    }
    
    stage("Deployment Stage"){
      
      steps {
        echo 'Deploying the project.'
        bat "gradle war"
      }
    }
  }
}