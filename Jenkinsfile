pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''mvn clean package -pl ums -am
cd ums
docker build -t ums:1.0.0 .'''
      }
    }

    stage('deploy') {
      steps {
        sh '''pwd
docker stop ums || true
echo "container stoped"
docker run --rm -d --name ums -p 8200:8200 -v ~/logback-spring.xml:/root/logback-spring.xml ums:1.0.0 || true
echo "container starting"'''
      }
    }

    stage('clear none images') {
      steps {
        sh 'docker rmi $(docker images | grep "none" | awk \'{print $3}\')'
      }
    }

  }
}