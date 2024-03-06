# Imagem base do open jdk 17
FROM openjdk:17-jdk-slim
# Local para persistir os dados
VOLUME /tmp
# Criando o jar da aplicacao e copiando para a imagem
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
# Executa o app
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]