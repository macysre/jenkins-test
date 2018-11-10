node {
    stage('Test') {
        sh "echo 'Hello Mani!!'"
    }
    stage('Promote') {
        sh 'echo "Prmoting..."'
    }
}