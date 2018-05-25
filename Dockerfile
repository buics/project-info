FROM java:8
VOLUME /tmp
ADD target/project*.jar project-track-spring-boot.jar
RUN sh -c 'touch /project-track-spring-boot.jar'
ENV JAVA_OPTS="-Xmx256m -Xms128m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /project-track-spring-boot.jar"]
