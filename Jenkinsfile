@Library("testing-library") _
    Install_go {
        projectName = "Project1"
        serverDomain = "Project1 Server Domain"
    }
pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Build stage executing'
      }
    }
    stage('Test') {
      steps {
        echo 'Test stage is executing'
      }
    }
    stage('Verify') {
      steps {
        echo 'Verify stage is executing'
      }
    }
  }
}
