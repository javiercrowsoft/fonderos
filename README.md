# Fonderos.com

### Docker

docker build . -t crowsoft:fonderos_site

docker run --publish=8082:8080 crowsoft:fonderos_site -d

### To publish in Docker Hub

docker login --username=javier2018

docker tag {{IMAGE_ID}} javier2018/akkachinchon:{{semantic version}}

ex: docker tag da813e91d4d1 javier2018/fonderos:0.1.0

docker push {{tag you just created}}

ex: docker push javier2018/fonderos

###To deploy in AWS

ssh_cairo_amazon

docker run --publish 8082:8080 --detach --name fonderos javier2018/fonderos:0.1.0