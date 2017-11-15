# api-workshop-107_config_server

Build Config-Server

1. add dependencies


	compile('org.springframework.cloud:spring-cloud-starter-eureka')
	compile('org.springframework.boot:spring-boot-starter-actuator')
	compile('org.springframework.boot:spring-boot-starter-aop')
	compile('org.springframework.cloud:spring-cloud-config-server')
	compile('org.springframework.boot:spring-boot-starter-web')
	compile('org.springframework.boot:spring-boot-starter-security')

2. add annotations 


    @EnableConfigServer
    @EnableEurekaClient

2. config properties


    spring.application.name=config-server
    server.port=8888
    
    spring.cloud.config.server.git.uri=https://github.com/APIGuild/api-workshop-107_config.git
    spring.cloud.config.server.git.search-paths=eureka-server,user-service
    spring.cloud.config.label=master
    spring.cloud.config.server.git.username=email address
    spring.cloud.config.server.git.password=password
    
    management.security.enabled=false
        
    endpoints.restart.enabled=true
    
    eureka.client.service-url.defaultZone=http://localhost:10000/eureka/
    