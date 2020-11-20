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
        sh '''pwd
docker stop gateway
echo "container stoped"
docker run --rm -d --name gateway -p 8200:8200 -v ~/logback-spring.xml:/root/logback-spring.xml gateway:1.0.0 || true
echo "container starting"'''
      }
    }

  }
}