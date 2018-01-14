FROM node:6.11.1


ENV NPM_CONFIG_LOGLEVEL warn

RUN npm install -g serve
CMD serve -s build
EXPOSE 3000

# Install all dependencies of the current project.
COPY package.json package.json
RUN npm install

# Copy all local files into the image.
COPY . .

RUN npm run build --production