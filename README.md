# LlanquihueTourApp

## Descripción

LlanquihueTourApp es una aplicación desarrollada en Java para gestionar distintas entidades relacionadas con una agencia de turismo.

Durante el desarrollo del proyecto se aplicaron conceptos fundamentales de Programación Orientada a Objetos, tales como:

- Interfaces
- Herencia
- Polimorfismo
- Colecciones genéricas
- Uso de instanceof
- Interfaz gráfica con JOptionPane

El sistema permite registrar y visualizar distintas entidades de la agencia turística mediante una interfaz gráfica simple.

---

## Estructura del Proyecto

```text
src
├── model
│   ├── Registrable.java
│   ├── ServicioTuristico.java
│   ├── ExcursionCultural.java
│   ├── PaseoLacustre.java
│   ├── RutaGastronomica.java
│   ├── GuiaTuristico.java
│   ├── Vehiculo.java
│   └── ColaboradorExterno.java
│
├── data
│   ├── GestorServicios.java
│   └── GestorEntidades.java
│
└── ui
    └── Main.java
```

---

## Clases e Interfaces Utilizadas

### Interfaz Registrable

La interfaz Registrable define un comportamiento común para todas las entidades que pueden ser gestionadas por el sistema.

Método implementado:

```java
String mostrarResumen();
```

---

### Clase ServicioTuristico

ServicioTuristico es una clase abstracta que representa la base de los servicios ofrecidos por la agencia.

Atributos:

```java
protected String nombre;
protected int duracionHoras;
```

---

### Subclases de ServicioTuristico

#### ExcursionCultural

Representa excursiones a lugares de interés histórico o cultural.

#### PaseoLacustre

Representa paseos turísticos realizados en embarcaciones.

#### RutaGastronomica

Representa rutas gastronómicas con diferentes paradas.

---

### Otras Entidades

#### GuiaTuristico

Representa a un guía turístico de la empresa.

#### Vehiculo

Representa un vehículo utilizado para el transporte de turistas.

#### ColaboradorExterno

Representa colaboradores o empresas externas asociadas a la agencia.

---

## Funcionalidades del Sistema

El sistema permite:

- Registrar guías turísticos.
- Registrar vehículos.
- Registrar excursiones culturales.
- Almacenar objetos de distintos tipos en una misma colección.
- Mostrar información utilizando polimorfismo.
- Diferenciar entidades mediante instanceof.
- Visualizar registros mediante una interfaz gráfica construida con JOptionPane.

---

## Herencia

Se implementó la siguiente jerarquía:

```text
ServicioTuristico
│
├── ExcursionCultural
├── PaseoLacustre
└── RutaGastronomica
```

---

## Polimorfismo

El sistema utiliza una colección genérica:

```java
ArrayList<Registrable>
```

Esto permite almacenar distintos tipos de objetos dentro de una misma colección y acceder a ellos mediante una interfaz común.

---

## Uso de instanceof

Se utiliza el operador instanceof para identificar el tipo específico de entidad almacenada y aplicar lógica diferenciada.

Ejemplo:

```java
if (entidad instanceof GuiaTuristico)
```

---

## Menú Principal

```text
1. Agregar Guía
2. Agregar Vehículo
3. Agregar Excursión Cultural
4. Mostrar Registros
5. Salir
```

---

## Cómo Ejecutar

1. Clonar el repositorio.

```bash
git clone https://github.com/carlitti/llanquihue-tour.git
```

2. Abrir el proyecto en IntelliJ IDEA.

3. Ejecutar la clase:

```java
ui.Main
```

4. Utilizar las opciones del menú para registrar y visualizar entidades.

---

## Tecnologías Utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub
- JOptionPane

---

## Autor

Carlos Felipe González Cereceda

Desarrollo Orientado a Objetos I

Duoc UC
