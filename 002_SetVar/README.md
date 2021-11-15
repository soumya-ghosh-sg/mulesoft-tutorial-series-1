<b># Step-by-step</b><br/>

1. Create a new Mule Project

 ![images](/002_SetVar/images/1-open-new-project.png)
 
2. Create the below flow by dragging one HTTP Listener, 2 Loggers and Set variable component from the Mule palette:

 ![images](/002_SetVar/images/2-create-flow.png)
 
3. HTTP Listener Configuration:

 ![images](/002_SetVar/images/3-http-config.png)
 
 ![images](/002_SetVar/images/4-http-listener-config.png)
 
4. Initial Logger Configuration:

 ![images](/002_SetVar/images/5-initial-logger-config.png)
 
5. Set Variable Configuration:

 ![images](/002_SetVar/images/6-set-var-config.png
 
6. End Logger Configuration:

 ![images](/002_SetVar/images/7-end-logger-config.png)
 
7. Run your Mule Application in Anypoint Studio using integrated Mule Runtime:

 
 
8. Wait until your application gets deployed:

 ![images](/002_SetVar/images/8-run-app.png)
 

9. Open ARC or POSTMAN or any Rest Client and invoke the below URL using GET

 ![images](/002_SetVar/images/9-test-apps.png)
 
10. Check the console logs for the result

 ![images](/002_SetVar/images/10-check-console-logs.png)
 
