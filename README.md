ArxivJava: Java Arxiv API
==================================


ArxivJava is a lightweight, highly modular, reactive, type safe Java and
Spring Library for working with [Arxiv](https://arxiv.org/). 

This allows you to work with the Arxiv api, without the additional overhead of having to write your own
integration code for the platform.


Features
--------

-   Complete Implementation of [Arxiv API](https://arxiv.org/help/api/user-manual)
-   Implementation of downloadPdf() and downloadSource() to download the arxiv papers from Arxiv
-   Comprehensive integration tests demonstrating a number of the above scenarios



It has four runtime dependencies:


-   [OpenFeign](https://spring.io/projects/spring-cloud-openfeign) for its
    reactive-functional API
-   [OKHttp](https://square.github.io/okhttp/)
    for HTTP connections
-   [Jackson Core](https://github.com/FasterXML/jackson-core) for fast
    JSON serialisation/deserialization
-   [Lombok](https://projectlombok.org/) for automatation of methods and logging

It also uses
[JUnit](https://junit.org/junit5/) and [Spring-test-starter](https://docs.spring.io/spring-boot/docs/1.5.7.RELEASE/reference/html/boot-features-testing.html) (Only test scope)


QuickStart
---------

Add the following VM Options or Environment Variables to your project:

```
-Dspring.profiles.active=dev
```

Add the following yaml file named `arxiv-application.yaml` to configure this library:

```yaml
spring:
  application:
    name: arxiv-client
  profiles: dev, stage
feign:
  client:
    config:
      default:
        connect-timeout: 160000000
        read-timeout: 160000000
arxiv:
  url: https://export.arxiv.org/api/

---

spring:
  profiles: prod

feign:
  client:
    config:
      openaiapi:
        connect-timeout: 1000
        read-timeout: 2000

arxiv:
  url: https://export.arxiv.org/api/

```




Use our [Maven](https://github.com/web3j/web3j-maven-plugin) 
plugin that will provide the OpenAIClient object.

Maven
-----

Java:

```xml
<dependency>
    <groupId>com.vaysai</groupId>
    <artifactId>arxivjava</artifactId>
    <version>0.1.0</version>
</dependency>
```

Use the @EnableArxivAPI annotation in your main class

```java
@EnableArxivClient
@SpringApplication
public class SomeApplication{
    
    public static void main(String[] args){
        SpringApplication.run(SomeApplication.class, args)
    }
}
```

Autowire an OpenAIClient object

```java
@Autowired
ArxivClient arxivClient;
```

Create a method calling an endpoint
```java
void listModels(){
    String shortID= "2301.07094v1"
    ArxivPaper response = arxivClient.search(shortID);
    log.info(response);
}
```




License
------
Apache 2.0
