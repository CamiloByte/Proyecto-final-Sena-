# Aplicación de Gestión Hotelera

¡Bienvenido a la Aplicación de Gestión Hotelera! Esta aplicación de escritorio, desarrollada en Java 11, ofrece un sistema completo para la gestión de un hotel, incluyendo la administración de clientes, recepción y facturas.

## Características

- **Java 11:** La aplicación está desarrollada en Java 11, aprovechando las características más recientes del lenguaje.
- **Base de Datos MySQL:** Utilizamos MySQL para gestionar la base de datos del hotel, garantizando un almacenamiento seguro y eficiente de la información.
- **Sistema CRUD:** Implementamos un sistema completo de operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para clientes, recepción y facturas, proporcionando una experiencia de gestión intuitiva y completa.
- **Modelo Relacional:** En la carpeta `docs`, puedes encontrar una imagen que representa el modelo relacional de la base de datos utilizado en esta aplicación.


![Aplicación](https://raw.githubusercontent.com/CamiloByte/Proyecto-final-Sena-/master/Proyecto.png)

## Modelo Relacional
![Modelo Relacional](https://github.com/CamiloByte/Proyecto-final-Sena-/blob/master/Modelo%20Relacional.png)

## Entidades

1. **Cliente**: Esta entidad contiene los siguientes campos:
    - `id_cliente`: Identificador único del cliente.
    - `nombre`: Nombre del cliente.
    - `apellido`: Apellido del cliente.
    - `cedula`: Cédula del cliente.
    - `telefono`: Teléfono del cliente.

2. **Factura**: Esta entidad está relacionada con la entidad `cliente` a través del campo `id_cliente`. Contiene los siguientes campos:
    - `id_factura`: Identificador único de la factura.
    - `id_recepcionista`: Identificador del recepcionista que generó la factura.
    - `id_cliente`: Identificador del cliente al que se le generó la factura.
    - `fecha_desde`: Fecha de inicio de la estancia.
    - `fecha_hasta`: Fecha de finalización de la estancia.
    - `tipo_de_habitacion`: Tipo de habitación reservada.
    - `valor_habitacion`: Costo de la habitación.
    - `productos_consumidos`: Productos consumidos durante la estancia.
    - `valor_productos`: Costo total de los productos consumidos.
    - `valor_total`: Costo total de la estancia.

3. **Recepcionista**: Esta entidad está relacionada con la entidad `factura` a través del campo `id_recepcionista`. Contiene los siguientes campos:
    - `id_recepcionista`: Identificador único del recepcionista.
    - `nombre`: Nombre del recepcionista.
    - `apellido`: Apellido del recepcionista.

## Relaciones

- **Cliente - Factura**: Un cliente puede tener varias facturas. Cada factura está asociada a un solo cliente.
- **Recepcionista - Factura**: Un recepcionista puede generar varias facturas. Cada factura está asociada a un solo recepcionista.




## Contacto

Si tienes alguna pregunta o sugerencia, no dudes en ponerte en contacto con nosotros a través de nuestro correo electrónico: ccaranda.sandoval@gmail.com

¡Gracias por tu interés en nuestra aplicación!

