pipeline {
  agent any
  stages {
stage('Unit Test') {
  steps {
      bat label: 'Test running', script: '''mvn test'''
      echo 'Hello Testing done'
       }
    }
    stage('SonarQube'){
       steps{
           bat label: '', script: '''mvn sonar:sonar \
		 -Dsonar.host.url=http://localhost:9000 \
 		-Dsonar.login=5270602eb05e8c89cf289724879002e97f51c3ff'''
       }
   }
}
}
