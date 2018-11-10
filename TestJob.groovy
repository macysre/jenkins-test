properties([pipelineTriggers([githubPush()])])

node {
    stage('checkout') {
        git url: 'https://github.com/macysre/jenkins-test.git', branch: 'master'
    }
    stage('Test') {
        sh "echo 'Hello Mani!!'"
    }
    stage('Promote') {
        sh 'echo "Prmoting..."'
    }
}