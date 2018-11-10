properties([pipelineTriggers([githubPush()])])

node {
    stage('checkout') {
        git url: 'https://github.com/macysre/jenkins-test.git', branch: 'master'
    }
    stage('Test') {
        sh 'ls -lrt'
        sh "echo 'Hello Mani!!'"
    }
    stage('Promote') {
        sh 'echo "Prmoting... "'
    }
}