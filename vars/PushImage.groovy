def call(String Project, String ImageTag, String dockerHubUser){
  echo "Pushing image to DockerHub"
  withCredentials([usernamePassword("credentialsId":"DockerHubCredentials",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")])
  {
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }
  sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
}
