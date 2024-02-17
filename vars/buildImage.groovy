#!/usr/bin/env groovy

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'dockers', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t noro16/my-repo:jma-2.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push noro16/my-repo:jma-2.0'
    }
}
