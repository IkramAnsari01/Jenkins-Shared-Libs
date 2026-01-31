def call(String image, String tag){
  echo 'Building the code'
  echo 'Creating Image'
  sh "docker build -t ${image}:${tag} ."
  echo 'Image Built'
}
