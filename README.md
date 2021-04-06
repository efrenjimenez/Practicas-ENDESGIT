# Practicas-ENDESGIT
Práctica signatura Entornos de Desarrollo
Subo la carpeta del proyecto de Java
Realizo la prueba de caja negra
Realizo la prueba de caja blanca
Al realizar la prueba de caja blanca me doy cuenta que la segunda condicional (else if) debe ser simplemente un else, pues no hay otra posible opción.
Modifico el código.
Al realixar las pruebas con JUnit me doy cuenta de que si alguna de las variables el false da error.
El fallo estaba en que la primera condición debía ser if(a && b) en lugar de if(a || b).
Corrijo el código.
