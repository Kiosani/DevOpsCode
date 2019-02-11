Spring technologies examples:

Modules: 

**common-model**

    Example of common module for a few applications
    Example of POJO with One-to-many JPA configuration
    Used by other modules for DB storage
    Have DB data from import.sql. Other SpringBoot applications detect it automatically and execute on start
    
**rest-template-example**    
    
    Example of spring RestTemplate that able to make REST calls to himself
    Example of spring-boot microservice
    
**spring-boot-full-app**

    Example of sping-boot microservice
    Example of spring-data
    Example of end-to-end application 
    Example of H2 and postgreSQL properties configuration
    Example of manual jackson converter
    //todo another one microservice. MultiModule one more time?
    //todo connect them with Netflix Eureka
    //todo connect them with Netflix Feign
    //todo integration tests
    
**spring-context-example**
    
    Example of java configuration.
    Example of DataSource PostgreSQL configuration
    Example of JPA repository level: EntityManager, JPQL
    
**spring-eureka-feign-example**

    Spring boot 2.1 and spring cloud dependency configuration
    Example of eureka-feign
    Example of ribbon loadBalancer
    Example of wrapped RestTemplate to not use http://localhost:3004 but http://ValidationService instead 
    Example of two microservices that exhanging data
    Example of PathVariable
    Example of OpenTracing with Jeager (dependency)
        info on backend dependency https://github.com/opentracing-contrib/java-spring-jaeger
        info about Jeager service https://www.jaegertracing.io/docs/1.8/getting-started/ (you need to run docker image with 8 ports exposed)
        
        docker run -d --name jaeger \
          -e COLLECTOR_ZIPKIN_HTTP_PORT=9411 \
          -p 5775:5775/udp \
          -p 6831:6831/udp \
          -p 6832:6832/udp \
          -p 5778:5778 \
          -p 16686:16686 \
          -p 14268:14268 \
          -p 9411:9411 \
          jaegertracing/all-in-one:1.8
           
    //todo   Investigate discovery server with example https://github.com/kbastani/spring-cloud-microservice-example/blob/master/discovery-microservice/src/main/resources/application.yml
            #    serviceUrl:
            #      defaultZone: http://discovery:${server.port}/eureka/
    //todo http://localhost:3003/  showing disabled servers that is down as UP
    //todo make commong gateway (front controller)
    
**spring-data-rest**

    //todo example of spring-data-rest
    //todo resolve n+1 probllem
    