@Library("testing-library") _
    Install_dependencies {
        projectName = "Project1"
        serverDomain = "Project1 Server Domain"
    }
pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'build stage is executing'
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
