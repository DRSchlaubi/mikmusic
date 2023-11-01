FROM eclipse-temurin:21-jre-alpine

WORKDIR /usr/app
COPY runtime/build/install/mikmusic ./

LABEL org.opencontainers.image.source = "https://github.com/DRSchlaubi/mikbot"

ENTRYPOINT ["bin/mikmusic"]
