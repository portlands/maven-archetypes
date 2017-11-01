# README
This app was created using the portlands html5-simple maven archetype.
You can run it straight away with docker, or deploy it locally to the app server of your taste.

This app uses yarn to import normalize.css, the build script copies the file
to the app's root folder before docker deployment, instead of introducing
a more complex tool like webpack.

If you don't have yarn installed, then please install it like this:

  * `$ npm install -g yarn`

## Build & Run

  * First time only: `$ chmod u+x buildAndRun.sh`
  * Run the project: `$ ./buildAndRun.sh `
  * Visit: `https://localhost/` with your browser
