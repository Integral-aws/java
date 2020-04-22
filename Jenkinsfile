pipeline {
  agent any
  stages {
    stage('Build'){
      steps {
        sh '''
        echo "########################"
        echo "*** Construyendo JAR ***"
        echo "########################"
        MAVEN_M2=//c/Users/Mou/Docker/maven/.m2
        DIR_PIPELINE=//c/Users/Mou/Docker/jenkins/jenkins_home/workspace/Pipeline_Integral_Java1
        docker run --rm -v ${MAVEN_M2}:/root/.m2 -v ${DIR_PIPELINE}:/app -w /app maven:3-alpine mvn -B -DskipTests clean package
        '''
      }
    }
  }
}
