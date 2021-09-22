FROM adoptopenjdk/openjdk16:alpine-jre

WORKDIR /usr/app
COPY build/libs/install ./

LABEL org.opencontainers.image.source = "https://github.com/DRSchlaubi/mikmusic"

ENTRYPOINT ["bin/mikmusic"]
