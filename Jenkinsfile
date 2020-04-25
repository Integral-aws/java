def MAVEN_M2
def DIR_PIPELINE
pipeline {
  agent any
  stages {
    stage('Initializing variables') {
      steps {
        script {
          echo "########################"
          echo "*** Inicializando Variables ***"
          echo "########################"
          MAVEN_M2="//c/Users/Mou/Docker/maven/.m2"
          // DIR_PIPELINE="//c/Users/Mou/Docker/jenkins/jenkins_home/workspace/Pipeline_Integral_Java1"
          DIR_PIPELINE="./"
          echo "${MAVEN_M2}"
        }
      }
    }
    stage('Build'){
      steps {
        sh """
        echo "########################"
        echo "*** Construyendo JAR ***"
        echo "########################"
        docker run --rm -v ${MAVEN_M2}:/root/.m2 -v ${DIR_PIPELINE}:/app -w /app maven:3-alpine mvn -B -DskipTests clean package
        """
      }
    }/*
    stage('Test'){
      steps {
        sh '''
        echo "####################################"
        echo "*** Realizando pruebas unitarias ***"
        echo "####################################"
        MAVEN_M2=//c/Users/Mou/Docker/maven/.m2
        DIR_PIPELINE=//c/Users/Mou/Docker/jenkins/jenkins_home/workspace/Pipeline_Integral_Java1
        docker run --rm -v ${MAVEN_M2}:/root/.m2 -v ${DIR_PIPELINE}:/app -w /app maven:3-alpine mvn test
        '''
      }
    } */
    stage('Create Image'){
      steps {
        sh """
        echo "########################"
        echo "*** Construyendo Imagen Docker ***"
        echo "########################"
        DIR_JAR="${DIR_PIPELINE}target"
        echo "${DIR_JAR}"
        docker build -t test-integral1 .
        """
      }
    }
  }
}
