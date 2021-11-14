# Calculator app


### Build

#### 1) Build Server Side
   
```
mvn clean

mvn clean install -U

mvn spring-boot:run
```


### Get with below URL

```
http://localhost:8080/calculator/dividir -divisão
http://localhost:8080/calculator/multiplicar -multiplicar
http://localhost:8080/calculator/subtrair -subtrair
http://localhost:8080/calculator/adicionar-adicionar
```


### Body content for test 
### Make sure to use application/json con content-type


```
{
    "a": 2,
    "b":4
}

```


### Messages Quues with rabbitmq-and spring boot

```
https://www.onlinetutorialspoint.com/windows/how-to-install-rabbitmq-on-windows-10.html
https://www.rabbitmq.com/install-windows.html#chocolatey

cmd C:\Program Files\RabbitMQ Server\rabbitmq_server-3.9.8

rabbitmq-plugins enable rabbitmq_management

```