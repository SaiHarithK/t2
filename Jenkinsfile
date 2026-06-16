pipeline {
  agent any

  tools {
    maven 'Maven'
  }
  stages {
    stage('checkout'){
      steps {        
        git branch:'main', url:'https://github.com/SaiHarithK/t2.git'
      }
    }

    stage('Build') {
      steps{
        sh 'mvn clean package'
      }
    }

    stage('test') {
      steps {
        sh 'mvn test'
      }
    }

    stage('check taget folder') {
      steps {
        sh 'ls -l target'
      }
    }

    stage('run') {
      steps{
        sh 'java -jar target/T2-1.0-SNAPSHOT.jar'
      }
    }
  }

  post {
    success {echo "build success"}
    failure {echo 'fail'}
  }
}
      
    
