def call(String url, String branch){
  echo 'Code Cloning From Git'
  git url:url,branch:branch
  echo 'Code Cloning Successful'
}
