## Parte 1

**Pregunta 1.1**
Respuesta: C) Long Parameter List
Ya que el metodo tiene demasiados parametros, esto hace que no se comprenda bien a la hora de leer.
Pero se puede mejorar si se encapsula los datos del cliente y parametros del reporte en objetos.

**Pregunta 1.2**
Respuesta: B) Switch Statements
El metodo contiene muchas condicionales segun el tipo.
Sería mejor separar cada tipo de pedido en su propia clase. 

**Pregunta 1.3**
Respuesta: A) Large Class (God Class)
Esta clase maneja demasiadas responsabilidades, lo mejor seria dividirse en otras sub clases con sus responsabilidades

**Pregunta 1.4**
Respuesta: B) Data Clumps
Los mismos grupos de parametros se estan repitiendo en varios metodos.
Una mejor solucion seria juntarlos en unas mima clase.

**Pregunta 1.5**
Respuesta: B) Primitive Obsession
Se estan usando numeros para representar los descuentes y los estatus.
Puede reemplazarse por clases como status, type y level.