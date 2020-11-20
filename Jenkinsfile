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
        sh '''echo "kill ums.jar server"

ps -ef | grep ums.jar | grep -v grep | awk \'{print $2}\' | xargs kill -9

nohup java -jar ./ums/target/ums.jar > /dev/null &

echo "ums.jar server starting...."'''
      }
    }

  }
}