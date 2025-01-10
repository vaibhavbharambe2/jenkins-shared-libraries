def call(String ImageName, String ImageTag, String dockerHubUser){
  sh "docker build -t ${dockerHubUser}/${ImageName}:${ImageTag} ."
}
