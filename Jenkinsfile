pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean package -pl ums -am'
      }
    }

    stage('deploy') {
      steps {
        sh 'pwd'
      }
    }

  }
}