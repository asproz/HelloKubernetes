# HelloKubernetes


- For JAR generation: ./mvnw clean package -DskipTests
- Certify to install minikube before, and then CLI: minikube start
- Define minikube env, in windows CLI: minikube docker-env | Invoke-Expression
- docker build -t <image_name>:<image_tag>, in our case was: docker build -t ajunior/hello-kubernetes:latest .
- To set the application inside the minikube use helm CLI: helm upgrade --install hello-kubernetes charts --values charts/values.yaml
- After all, check it with kubectl get pods
- To tunnel your application and provide a URL, just: minikube service hello-kubernetes --url



# LONG LIVE DOCKERFILE

