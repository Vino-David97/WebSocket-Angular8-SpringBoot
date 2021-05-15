# WebSocket-Angular8-SpringBoot
WebSocket Communication using SpringBoot and Angular

Client side
1.Create Angular project

ng new angluar-websocket
cd angular-websocket

– Install @stomp/stompjs and socksjs:(latest version)
npm i @stomp/stompjs
npm i sockjs-client


– Add this code in the first line of polyfills.ts file:
(window as any).global = window;


if found this error
Error: ./src/polyfills.ts
Module not found: Error: Can't resolve 'core-js/es7/reflect' in 'E:\Pando\Angular-Websock\angular-websocket\src'

npm install --save core-js@^2.5.0


Run and check results
– SpringBoot project with command-lines: mvn clean install and mvn spring-boot:run.
– Angular project: npm install and npm start.

Open browser with url http://localhost:4200/.
Click on Connect button and send User’s Name.
Then click on Disconnect button.
