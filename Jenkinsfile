pipeline {
  agent any
  tools {
    nodejs 'NodeJS16.5'
  }

  options {
    timeout(time: 2, unit: 'MINUTES')
  }

  stages {
    stage('Install dependencies') {
      steps {
        sh 'cd pipelines/jenkins-tests && npm i'
      }
    }
    stage('Run tests') {
      steps {
        sh 'cd pipelines/jenkins-tests && npm t'
      }
    }
  }
}
