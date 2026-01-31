def call(String docUser, String docPass, String image, String tag){
 
    sh "docker login -u ${env.docUser} -p ${env.docPass}" 
    sh " docker image tag ${image}:${tag} ${env.docUser}/${image}:${tag}"
    sh "docker push ${env.docUser}/notes-app:latest"
}
