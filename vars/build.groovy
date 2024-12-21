def call(String Project, String ImageTag, String dockerHubUser){
  sh "docker build -t ${dockerHubUser}/${Project}:${ImageTag} ."
}
