# Step-by-step

1. Create a new Mule Project

 
2. Create the below flow by dragging one HTTP listener, logger and set payload component from the Mule palette:

  ![images](/003_GETPOST/images/1-create-flow.png) 
  
3. Create another flow in the same mule configuration file by dragging one HTTP listener, logger and set payload component from the Mule palette:

  ![images](/003_GETPOST/images/2-create-flow.png) 

4. HTTP Listener Configuration for /GET urltest:

  ![images](/003_GETPOST/images/3-http-listener-config.png) 

  ![images](/003_GETPOST/images/4-http-listener-config.png) 
  
5. HTTP Listener Configuration for /POST urltest:

  ![images](/003_GETPOST/images/5-http-listener-config.png) 

  ![images](/003_GETPOST/images/6-http-listener-config.png) 

5. Set Payload configuration (similar configuration is used in both the flows):

  ![images](/003_GETPOST/images/7-set-payload-config.png) 

5.Logger Configuration (similar configuration is used in both the flows):

  ![images](/003_GETPOST/images/8-logger-config.png) 
  
6. Run your Mule Application in Anypoint Studio using integrated Mule Runtime:

7. Wait until your application gets deployed:

8. Open ARC or POSTMAN or any Rest Client and invoke the below URL using GET and then POST method and observe the log in your console

  ![images](/003_GETPOST/images/9-arc-test.png)
  ![images](/003_GETPOST/images/10-arc-test.png)
 