def call(String Project, String dockerHubUser){
  sh "docker build -t ${dockerHubUser}/${Project}:${ImageTag} ."
}
