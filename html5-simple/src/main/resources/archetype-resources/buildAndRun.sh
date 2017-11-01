#!/bin/sh
yarn install
cp node_modules/normalize.css src/normalize.css

docker build -t ${groupId}/${artifactId} .
docker rm -f ${artifactId} || true
docker run -d -p 80:80 -p 443:443 --name ${artifactId} ${groupId}/${artifactId}
