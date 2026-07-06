# LlanquihueTourApp

## Descripción

Aplicación desarrollada en Java para la agencia turística Llanquihue Tour.

En esta versión se implementa una jerarquía de clases utilizando herencia, sobrescritura de métodos y polimorfismo. Además, los servicios turísticos son almacenados en una colección genérica y recorridos dinámicamente mediante referencias de la superclase.

## Funcionalidades implementadas

- Clase base `ServicioTuristico`.
- Subclases:
  - `RutaGastronomica`
  - `PaseoLacustre`
  - `ExcursionCultural`
- Sobrescritura del método `mostrarInformacion()`.
- Uso de polimorfismo para mostrar información de distintos tipos de servicios.
- Uso de colección genérica `List<ServicioTuristico>`.
- Recorrido de la colección mediante un ciclo `for-each`.

## Estructura del proyecto

### model

Contiene las clases del modelo:

- ServicioTuristico
- RutaGastronomica
- PaseoLacustre
- ExcursionCultural

### data

Contiene la clase:

- GestorServicios

### ui

Contiene la clase principal:

- Main

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Compilar el proyecto.
3. Ejecutar la clase `Main`.
4. Visualizar la información de los servicios turísticos en la consola.

## Conceptos aplicados

- Programación Orientada a Objetos
- Herencia
- Polimorfismo
- Sobrescritura de métodos
- Colecciones genéricas (`List`)
- Encapsulamiento

## Autor

Carlos Felipe González Cereceda
`
