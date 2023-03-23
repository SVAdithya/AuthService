FROM gradle:7.4-jdk18
RUN mkdir /project
COPY . /project
WORKDIR /project
RUN gradle build
