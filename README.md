# LARIOS
1. Para poder lograr que la aplicación funcione, primero hay que cargar los datos del archivo larios.sql que esta alojado en la raiz del proyecto.
2. Una vez cargado la DB, hay que cambiar las credenciales de acceso, esto se encuentra en la siguiente ruta:
`/src/main/resources/application.properties`
En este archivo cambiaremos las siguientes lineas:
```
spring.datasource.url=jdbc:mysql://#localhost:8080/larios
spring.datasource.username=#Su usuario si tiene
spring.datasource.password=#Su password si tiene
```
Normalmente suele ser localhost, pero si tiene el servidor alojado en otro lugar la linea a de quedar de la siguiente forma.
`spring.datasource.url=jdbc:mysql://${MYSQL_HOST:Su ip}:Puerto de escucha/larios`

3. Si todo es correcto solo queda ejecutar el siguiente comando y la aplicación se pondrá en marcha:
`./mvnw spring-boot:run`

Por ultimo si hay cualquier duda no dude en contactarme.
