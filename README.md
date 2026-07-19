# LlanquihueTourApp

## Descripción General

LlanquihueTourApp es una aplicación desarrollada en Java para apoyar la gestión de una agencia de turismo mediante la aplicación de los principios de Programación Orientada a Objetos.

El sistema permite administrar distintas entidades relacionadas con la agencia, como clientes, guías turísticos, vehículos y servicios turísticos. Además, incorpora lectura de datos desde archivos de texto, uso de colecciones, herencia, polimorfismo e interfaces.

---

## Objetivos del Proyecto

- Modelar entidades del dominio turístico mediante clases Java.
- Aplicar los principios de Programación Orientada a Objetos.
- Utilizar herencia, composición e interfaces.
- Gestionar colecciones de objetos mediante ArrayList.
- Leer información desde archivos de texto.
- Implementar una interfaz gráfica sencilla utilizando JOptionPane.

---

## Estructura del Proyecto

```text
src
│
├── model
│   ├── Registrable.java
│   ├── Persona.java
│   ├── Cliente.java
│   ├── Proveedor.java
│   ├── GuiaTuristico.java
│   ├── Direccion.java
│   ├── RutInvalidoException.java
│   ├── ServicioTuristico.java
│   ├── ExcursionCultural.java
│   ├── PaseoLacustre.java
│   ├── RutaGastronomica.java
│   ├── Vehiculo.java
│   └── ColaboradorExterno.java
│
├── data
│   ├── GestorEntidades.java
│   └── GestorServicios.java
│
├── utils
│   ├── LectorClientes.java
│   └── ValidadorRut.java
│
├── resources
│   └── clientes.txt
│
└── ui
    └── Main.java
```

---

## Principios de Programación Orientada a Objetos Aplicados

### Encapsulamiento

Los atributos de las clases fueron declarados como privados y se accede a ellos mediante getters y setters.

### Herencia

Se implementó la siguiente jerarquía de clases:

```text
Persona
│
├── Cliente
├── GuiaTuristico
└── Proveedor
```

Además:

```text
ServicioTuristico
│
├── ExcursionCultural
├── PaseoLacustre
└── RutaGastronomica
```

### Composición

La clase Persona contiene un objeto Direccion.

```java
private Direccion direccion;
```

### Interfaces

Se creó la interfaz Registrable para definir un comportamiento común entre distintas entidades.

```java
String mostrarResumen();
```

### Polimorfismo

Se utiliza una colección polimórfica:

```java
ArrayList<Registrable>
```

permitiendo almacenar objetos de distintos tipos dentro de la misma colección.

### instanceof

Se utiliza el operador instanceof para reconocer el tipo de entidad almacenada y aplicar lógica específica cuando corresponde.

---

## Gestión de Colecciones

El sistema utiliza estructuras dinámicas de tipo ArrayList para almacenar:

- Clientes
- Guías turísticos
- Vehículos
- Servicios turísticos

Permitendo agregar, recorrer y visualizar información de forma eficiente.

---

## Lectura de Archivos

El sistema incluye lectura de información desde archivos de texto.

Archivo de ejemplo:

```text
clientes.txt
```

Formato:

```text
Nombre;Rut;Calle;Comuna
```

La clase:

```java
LectorClientes
```

se encarga de leer el archivo y convertir cada línea en objetos Cliente.

---

## Validación y Excepciones

Se implementó una excepción personalizada:

```java
RutInvalidoException
```

utilizada para validar el formato de los RUT ingresados en el sistema.

---

## Funcionalidades Implementadas

- Registrar guías turísticos.
- Registrar vehículos.
- Registrar excursiones culturales.
- Cargar clientes desde archivo TXT.
- Mostrar registros almacenados.
- Gestionar múltiples tipos de entidades mediante polimorfismo.
- Validar datos mediante excepciones personalizadas.

---

## Menú Principal

```text
1. Agregar Guía
2. Agregar Vehículo
3. Agregar Excursión Cultural
4. Mostrar Registros
5. Cargar Clientes desde TXT
6. Salir
```

---

## Tecnologías Utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub
- JOptionPane
- Archivos de texto (.txt)

---

## Instrucciones de Ejecución

1. Clonar el repositorio:

```bash
git clone https://github.com/carlitti/llanquihue-tour.git
```

2. Abrir el proyecto en IntelliJ IDEA.

3. Verificar que exista el archivo:

```text
src/resources/clientes.txt
```

4. Ejecutar la clase:

```java
ui.Main
```

5. Utilizar el menú para interactuar con el sistema.

---

## Autor

Carlos Felipe González Cereceda

Desarrollo Orientado a Objetos I

Duoc UC
