# Práctica: Pilas Estáticas y Dinámicas en Java

## 1. Descripción

Este proyecto implementa dos tipos de pilas en Java: una pila estática y una pila dinámica. Ambas utilizan el principio LIFO (*Last In, First Out*), que significa que el último elemento en entrar es el primero en salir.

El programa permite agregar elementos, eliminar el elemento de la cima, consultar el elemento superior y mostrar los elementos de la pila.

## 2. Estructura del proyecto

```text
PilasEstaticasDinamicas/
├── src/
│   ├── Main.java
│   ├── PilaSimple.java
│   └── PilaDinamica.java
└── README.md
```

- **Main.java:** ejecuta las pruebas de las dos pilas.
- **PilaSimple.java:** implementa una pila estática mediante un arreglo de tamaño fijo.
- **PilaDinamica.java:** implementa una pila dinámica mediante nodos enlazados.

## 3. Diferencias entre las pilas

### Pila estática

Utiliza un arreglo que se crea con una capacidad determinada. En este proyecto se utiliza una capacidad de cinco elementos. Cuando la pila está llena, no permite agregar más elementos.

### Pila dinámica

Utiliza nodos enlazados. Cada nodo almacena un dato y una referencia al siguiente nodo. Puede crecer conforme se agregan elementos, mientras exista memoria disponible.

### Comparación

La pila estática tiene una capacidad fija y permite acceder a sus posiciones mediante un arreglo. La dinámica utiliza memoria para crear nodos conforme se necesitan. Ambas siguen el principio LIFO.

## 4. Métodos implementados

| Método | Función |
|---|---|
| `push(int x)` | Agrega un elemento a la cima. |
| `pop()` | Elimina y devuelve el elemento de la cima. |
| `mostrar()` | Muestra los elementos de arriba hacia abajo. |
| `isEmpty()` | Comprueba si la pila está vacía. |
| `isFull()` | Comprueba si la pila está llena. Solo se utiliza en la pila estática. |
| `peek()` | Consulta el elemento de la cima sin eliminarlo. |

Cuando una pila está vacía, `pop()` y `peek()` devuelven `null` y muestran un mensaje. En la pila estática, `push()` también controla el caso en que se alcanza la capacidad máxima.

## 5. Cómo ejecutar el programa

### Desde IntelliJ IDEA

1. Abrir el proyecto `PilasEstaticasDinamicas`.
2. Verificar que los tres archivos `.java` estén dentro de la carpeta `src`.
3. Abrir `Main.java`.
4. Presionar el triángulo verde junto al método `main` o hacer clic derecho en el archivo.
5. Seleccionar **Run 'Main.main()'**.
6. Revisar los resultados en la consola.

### Desde la terminal

Desde la carpeta principal del proyecto, ejecutar:

```bash
javac -d out src/PilaSimple.java src/PilaDinamica.java src/Main.java
java -cp out Main
```

Es necesario tener instalado el JDK y disponer de los comandos `javac` y `java` en la terminal.

## 6. Ejemplo de salida en consola

El siguiente ejemplo muestra las operaciones principales de las dos pilas:

```text
===== PILA ESTATICA =====
Se agregó: 10
Se agregó: 20
Se agregó: 30
Se agregó: 40
Se agregó: 50
La pila está llena. No se puede agregar 60
Elementos de la pila (de arriba hacia abajo):
50
40
30
20
10
Elemento de arriba: 50
Elemento eliminado: 50

===== PILA DINAMICA =====
Se agregó: 10
Se agregó: 20
Se agregó: 30
Elementos de la pila (de arriba hacia abajo):
30
20
10
Elemento de arriba: 30
Elemento eliminado: 30
```

La salida completa también muestra el contenido restante de cada pila y las comprobaciones de `isEmpty()` e `isFull()`.

## 7. Conclusión

Con esta práctica comprendí cómo funcionan las pilas estáticas y dinámicas en Java. Aprendí que ambas siguen el principio LIFO, pero utilizan distintas formas de almacenar los datos.

La pila estática es sencilla de implementar, aunque su capacidad se establece desde el principio. La pila dinámica permite agregar elementos conforme se necesitan, pero utiliza nodos y referencias. La elección entre ambas depende de las necesidades del programa y de la memoria disponible.
