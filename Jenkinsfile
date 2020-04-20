pipeline {
  agent any
  stages {
    stage('Build'){
      steps {
        sh '''
        echo "########################"
        echo "*** Construyendo JAR ***"
        echo "########################"
        MAVEN_M2=//c/users/mou/docker/maven/.m2
        DIR_PIPELINE=//c/users/mou/docker/jenkins/jenkins_home/workspace/pipeline_integral_java1
        docker run --rm -v ${MAVEN_M2}:/root/.m2 -v ${DIR_PIPELINE}:/app -w /app maven:3-alpine mvn -B -DskipTests clean package
        '''
      }
    }
  }
}
