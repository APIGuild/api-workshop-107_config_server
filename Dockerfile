FROM jeanblanchard/java:8
ENV JAVA_OPTS -Xmx256M
ADD build/libs/*.jar /app.jar

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]