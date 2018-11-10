properties([pipelineTriggers([githubPush()])])

node {
    stage('checkout') {
        git url: 'https://github.com/macysre/simple-java-maven-app.git', branch: 'master'
    }

    stage('Build') {
        withMaven() {
            mavenLocalRepo: '.repository') {
                sh 'mvn clean install'
            }
        }
    }
}