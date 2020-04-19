pipeline: {
  agent any
  stages: {
    stage('Build'){
      steps {
        sh '''
        echo "########################"
        echo "*** Construyendo JAR ***"
        echo "########################"
        docker run --rm -v //c/root/.m2:/root/.m2 -v //c/root/pipelines/integral/java1:/app -w /app maven:3-alpine mvn -B -DskipTests clean package
        '''
      }
    }
  }
}
