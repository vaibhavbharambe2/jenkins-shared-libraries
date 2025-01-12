def call(String ImageName, String ImageTag, String dockerHubUser){
  echo "Pushing image to DockerHub"
  withCredentials([usernamePassword("credentialsId":"DockerHubCredentials",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")])
  {
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }
  
  sh "docker image tag ${ImageName}:${ImageTag} ${dockerHubUser}/${ImageName}:${ImageTag}"
  sh "docker push ${dockerHubUser}/${ImageName}:${ImageTag}"
}
