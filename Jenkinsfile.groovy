node{
    stage ('Build'){
        echo 'Hello World building'
    }
    stage('Deploy'){
        echo 'Deploying '
    }
}
