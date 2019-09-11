pipeline {
  agent any
  stages {
stage('Unit Test') {
  steps {
      bat label: 'Test running', script: '''mvn test'''
      echo 'Hello Testing done'
       }
    }
}
}
