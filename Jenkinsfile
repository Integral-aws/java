def MAVEN_M2
def DIR_PIPELINE
def DOCKER_MAVEN_CONTAINER
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
          DIR_PIPELINE="//c/Users/Mou/Docker/jenkins/jenkins_home/workspace/Pipeline_Integral_Java1"
          DOCKER_MAVEN_CONTAINER="docker run --rm -v ${MAVEN_M2}:/root/.m2 -v ${DIR_PIPELINE}:/app -w /app maven:3-alpine"
        }
      }
    }
    stage('Build'){
      steps {
        sh """
        echo "########################"
        echo "*** Construyendo JAR ***"
        echo "########################"
        ${DOCKER_MAVEN_CONTAINER} mvn -B -DskipTests clean package
        """
      }
    }
    stage('Test'){
      steps {
        sh """
        echo "####################################"
        echo "*** Realizando pruebas unitarias ***"
        echo "####################################"
        ${DOCKER_MAVEN_CONTAINER} mvn test
        """
      }
    } 
    stage('Create Image'){
      steps {
        sh """
        echo "########################"
        echo "*** Construyendo Imagen Docker ***"
        echo "########################"
        DIR_JAR="${DIR_PIPELINE}/target"
        docker build -t integral/java1:V1.0.0 .
        """
      }
    }
  }
}
