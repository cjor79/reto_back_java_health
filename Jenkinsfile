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
        sh 'npm install'
      }
    }
    stage('Run tests') {
      steps {
        sh 'ng serve'
      }
    }
  }
}
