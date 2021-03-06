def call(body) {

        def config = [:]
        body.resolveStrategy = Closure.DELEGATE_FIRST
        body.delegate = config
        body()

        node {
            // Clean workspace before doing anything
            deleteDir()

            try {
                stage ('Clone') {
                    checkout scm
                }
                stage ('Install-go') {
                    sh "apt-get update"
                    sh "apt-get install go"
                }
                
            } catch (err) {
                currentBuild.result = 'FAILED'
                throw err
            }
        }
    }
