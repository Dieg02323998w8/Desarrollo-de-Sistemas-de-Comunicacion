# 🔮 La Pitonisa — Sistema Cliente-Servidor

## 📖 Descripción

La Pitonisa es una aplicación desarrollada bajo una arquitectura cliente-servidor, orientada a la comunicación entre procesos mediante sockets y al intercambio de información relacionada con los signos del zodiaco.

El proyecto implementa dos componentes independientes: un cliente encargado de interactuar con el usuario y un servidor responsable de gestionar las solicitudes y la información zodiacal almacenada en archivos de texto.

## 🎯 Objetivo

Implementar un sistema de comunicación cliente-servidor que permita comprender los mecanismos de conexión, transmisión de información y procesamiento de solicitudes mediante sockets, integrando la lectura y gestión de archivos externos.

## 🏗️ Arquitectura del sistema

El proyecto está compuesto por dos módulos principales:

### 🖥️ 1. Cliente (`client.java`)

Es el componente encargado de establecer la comunicación con el servidor y gestionar la interacción con el usuario.

Sus responsabilidades dentro de la arquitectura son:

- Iniciar la comunicación con el servidor.
- Participar en el intercambio de información.
- Enviar las solicitudes correspondientes.
- Recibir las respuestas del servidor.

### 🌐 2. Servidor (`servido.java`)

Es el componente encargado de atender las conexiones y gestionar la información zodiacal.

Sus responsabilidades dentro de la arquitectura son:

- Esperar las conexiones de los clientes.
- Recibir y procesar solicitudes.
- Gestionar el acceso a los archivos de información.
- Participar en el envío de respuestas al cliente.

## 🔄 Flujo general de comunicación

El funcionamiento del sistema sigue el modelo cliente-servidor:

1. **Inicio del servidor:** se ejecuta el componente encargado de recibir conexiones.
2. **Conexión del cliente:** el cliente inicia la comunicación con el servidor.
3. **Solicitud:** se realiza el intercambio de información entre ambos componentes.
4. **Procesamiento:** el servidor gestiona la solicitud y consulta los recursos correspondientes.
5. **Respuesta:** la información procesada se transmite al cliente.
6. **Visualización:** el cliente recibe la información para presentarla al usuario.

## ♈ Información zodiacal

El servidor cuenta con archivos de texto independientes para almacenar la información de los doce signos zodiacales.

| Signo | Archivo |
|---|---|
| Aries | `aries.txt` |
| Tauro | `tauro.txt` |
| Géminis | `geminis.txt` |
| Cáncer | `cancer.txt` |
| Leo | `leo.txt` |
| Virgo | `virgo.txt` |
| Libra | `libra.txt` |
| Escorpio | `escorpion.txt` |
| Sagitario | `sagitario.txt` |
| Capricornio | `capricornio.txt` |
| Acuario | `acuario.txt` |
| Piscis | `piscis.txt` |

Estos archivos forman parte de los recursos necesarios para gestionar la información zodiacal del sistema.

## 🛠️ Tecnologías y herramientas

- **Java:** lenguaje utilizado para desarrollar la aplicación.
- **Sockets:** mecanismo de comunicación entre el cliente y el servidor.
- **Apache NetBeans:** entorno de desarrollo del proyecto.
- **Archivos TXT:** almacenamiento de información zodiacal.
- **Apache Ant:** herramienta de construcción y compilación del proyecto.

## ▶️ Instalación y ejecución

### Requisitos

- Tener instalado Java Development Kit (JDK).
- Disponer de Apache NetBeans o un entorno compatible.
- Descargar o clonar el repositorio.
- Mantener los archivos de información zodiacal en su ubicación correspondiente.

### Ejecución desde Apache NetBeans

1. Abrir el proyecto `La Pitonisa` en NetBeans.
2. Localizar el archivo `servido.java` dentro del paquete `servidor`.
3. Ejecutar el servidor.
4. Localizar el archivo `client.java` dentro del paquete `cliente`.
5. Ejecutar el cliente.
6. Realizar las operaciones disponibles en la aplicación.

**Importante:** el servidor debe estar iniciado antes de ejecutar el cliente para permitir el establecimiento de la comunicación.

## 📚 Conceptos de ingeniería aplicados

- Arquitectura cliente-servidor.
- Programación de sockets.
- Comunicación entre procesos.
- Transmisión e intercambio de datos.
- Gestión de conexiones.
- Lectura y procesamiento de archivos.
- Separación de responsabilidades entre componentes.

## 🎓 Propósito académico

Este proyecto permite aplicar conocimientos de programación y sistemas de comunicación, explorando la interacción entre aplicaciones independientes mediante mecanismos de conexión y transferencia de información.

Además, fortalece la comprensión de las arquitecturas de red y de los fundamentos necesarios para desarrollar aplicaciones distribuidas.

---

<div align="center">

**🔮 LA PITONISA**

*Comunicación, programación e intercambio de información.*

**Desarrollo de Sistemas de Comunicación**

</div>
