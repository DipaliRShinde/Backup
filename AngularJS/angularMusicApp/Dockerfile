FROM node:12
ADD /dist  /usr/src/app/dist
WORKDIR /usr/src/app/dist/angularMusicApp
RUN npm install
RUN npm install http-server -g
CMD ["http-server"]