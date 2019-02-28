# recuentoanimales

## Descripción
En este proyecto se presenta el patron de diseño iterador en el cual se crea un iterador manualmente.

## Iterator
Iterator o Iterador es un patrón de diseño de comportamiento que le permite recorrer elementos de una colección sin exponer su representación subyacente (lista, pila, árbol, etc.).

![alt text](https://refactoring.guru/images/patterns/diagrams/iterator/structure.png)


## Cómo implementar

-Declara la interfaz del iterador. Como mínimo, debe tener un método para obtener el siguiente elemento de una colección. Pero por conveniencia, puede agregar un par de otros métodos, como recuperar el elemento anterior, rastrear la posición actual y verificar el final de la iteración.

-Declare la interfaz de la colección y describa un método para obtener iteradores. El tipo de retorno debe ser igual al de la interfaz del iterador. Puede declarar métodos similares si planea tener varios grupos distintos de iteradores.

-Implemente clases de iterador concretas para las colecciones que desea que puedan recorrerse con los iteradores. Un objeto iterador debe estar vinculado con una única instancia de colección. Por lo general, este enlace se establece a través del constructor del iterador.

-Implementar la interfaz de colección en sus clases de colección. La idea principal es proporcionar al cliente un acceso directo para crear iteradores, adaptados a una clase de colección particular. El objeto de colección debe pasar al constructor del iterador para establecer un enlace entre ellos.

-Revise el código del cliente para reemplazar todo el código de recorrido de la colección con el uso de iteradores. El cliente obtiene un nuevo objeto iterador cada vez que necesita iterar sobre los elementos de la colección.

## Pros y contras

### Pros
-Principio de Responsabilidad Única . Puede limpiar el código del cliente y las colecciones extrayendo algoritmos de recorrido voluminosos en clases separadas.

-Principio Abierto / Cerrado . Puede implementar nuevos tipos de colecciones e iteradores y pasarlos al código existente sin romper nada.

- Puede iterar sobre la misma colección en paralelo porque cada objeto iterador contiene su propio estado de iteración.

- Por el mismo motivo, puede retrasar una iteración y continuarla cuando sea necesario.

### Contras

-Aplicar el patrón puede ser una exageración si tu aplicación solo funciona con colecciones simples.

-El uso de un iterador puede ser menos eficiente que analizar elementos de algunas colecciones especializadas directamente.
