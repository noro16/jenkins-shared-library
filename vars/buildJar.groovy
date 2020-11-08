#!/usr/bin/env groovy

def call() {
    node {
        echo "building the application..."
        sh 'mvn package'
    }
}
