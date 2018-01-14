FROM openjdk:8
ADD target/CryptoAPI-1.0.0.jar CryptoAPI.jar
EXPOSE 80 9200 9300
ENTRYPOINT ["java", "-jar", "CryptoAPI.jar"]