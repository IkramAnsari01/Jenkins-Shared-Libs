def call(String docCred, String image, String tag){
  echo ' Pushing build Image to Docker Hub'
  withCredentials([usernamePassword(
          'credentialsId':${docCred},
          passwordVariable: "docPass",
          usernameVariable: "docUser")]){
              sh "docker login -u ${env.docUser} -p ${env.docPass}" 
              sh " docker image tag ${image}:${tag} ${env.docUser}/${image}:${tag}"
              sh "docker push ${env.docUser}/notes-app:latest"
          }
}
