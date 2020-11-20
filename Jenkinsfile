pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''mvn clean package -pl gateway -am
cd gateway
docker build -t gateway:1.0.0 .'''
      }
    }

    stage('deploy') {
      steps {
        sh '''docker stop gateway || true
echo "container stoped"
docker run --rm -d --name gateway -p 8500:8500 -v ~/logback-spring.xml:/root/logback-spring.xml gateway:1.0.0 || true
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