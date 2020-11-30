pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''mvn clean package -pl auth-server -am
cd auth-server
docker build -t auth:1.0.0 .'''
      }
    }

    stage('deploy') {
      steps {
        sh '''pwd
docker stop auth|| true
echo "container stoped"
docker run --rm -d --name auth -p 8400:8400 -v ~/logback-spring.xml:/root/logback-spring.xml auth:1.0.0
echo "container starting"'''
      }
    }

    stage('clear none images') {
      steps {
        sh 'docker rmi $(docker images | grep "none" | awk \'{print $3}\') || true'
      }
    }

  }
}