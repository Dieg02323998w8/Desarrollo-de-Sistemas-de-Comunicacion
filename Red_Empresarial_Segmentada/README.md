# 🌐 Proyecto Red Empresarial Segmentada

## 📌 Descripción del proyecto

Proyecto académico orientado al diseño e implementación de una infraestructura de red empresarial mediante Cisco Packet Tracer.

La solución utiliza segmentación lógica mediante VLAN para organizar los dispositivos por departamentos y servicios. Incorpora enrutamiento inter-VLAN mediante un router Cisco 2911, switches Cisco 2960, enlaces troncales IEEE 802.1Q y servicios centralizados DHCP y DNS.

Además, contempla mecanismos de seguridad mediante listas de control de acceso (ACL), Port Security y protección inalámbrica WPA2-PSK.

## 🎯 Objetivos

- Diseñar una infraestructura de red empresarial segmentada.
- Implementar seis VLAN para separar departamentos y servicios.
- Configurar el enrutamiento inter-VLAN.
- Centralizar la asignación de direcciones IP mediante DHCP.
- Implementar resolución de nombres mediante DNS.
- Establecer mecanismos de seguridad para controlar el acceso a la red.
- Documentar las configuraciones y evidencias del proyecto.

## 🏗️ Arquitectura de red

| Dispositivo | Modelo o función |
|---|---|
| R1-Central | Router Cisco 2911. |
| SW-Core | Switch Cisco 2960 principal. |
| SW1 | Switch Cisco 2960. |
| SW2 | Switch Cisco 2960. |
| SW3 | Switch Cisco 2960. |
| SRV-DHCP | Servidor DHCP. |
| SRV-DNS | Servidor DNS. |
| AP-WiFi | Punto de acceso Linksys WRT300N. |
| Equipos finales | Computadores y portátiles de los diferentes departamentos. |

## 🧩 Segmentación mediante VLAN

La infraestructura está organizada en seis VLAN:

| VLAN | Nombre | Red | Puerta de enlace |
|---|---|---|---|
| 10 | Administración | 192.168.10.0/24 | 192.168.10.1 |
| 20 | Docentes | 192.168.20.0/24 | 192.168.20.1 |
| 30 | Estudiantes | 192.168.30.0/24 | 192.168.30.1 |
| 40 | Biblioteca | 192.168.40.0/24 | 192.168.40.1 |
| 50 | Servidores | 192.168.50.0/24 | 192.168.50.1 |
| 60 | Wi-Fi | 192.168.60.0/24 | 192.168.60.1 |

El punto de acceso AP-WiFi proporciona conectividad inalámbrica para los dispositivos asociados a la VLAN 60.

## 🔄 Enrutamiento inter-VLAN

La comunicación entre las diferentes VLAN se implementa mediante el método Router-on-a-Stick.

El router R1-Central utiliza subinterfaces con encapsulación IEEE 802.1Q para gestionar las seis VLAN y proporcionar sus respectivas puertas de enlace.

Los switches utilizan enlaces troncales para transportar el tráfico de las VLAN correspondientes.

## 🖥️ Servicios de red

### DHCP

**Servidor:** SRV-DHCP  
**Dirección IP:** `192.168.50.10`

Se encarga de la asignación dinámica de direcciones IP a los dispositivos de las VLAN correspondientes. Se utiliza DHCP Relay para permitir que los clientes de otras VLAN utilicen el servidor centralizado.

### DNS

**Servidor:** SRV-DNS  
**Dirección IP:** `192.168.50.11`

Proporciona el servicio de resolución de nombres dentro de la infraestructura.

## 🔐 Seguridad de la red

El proyecto contempla los siguientes mecanismos:

- **ACL (Access Control Lists):** permiten controlar y filtrar el tráfico entre VLAN según las reglas definidas.
- **Port Security:** permite restringir el acceso a los puertos de los switches mediante controles sobre las direcciones MAC.
- **WPA2-PSK:** mecanismo de protección de la conexión inalámbrica del punto de acceso.
- **DHCP del AP-WiFi:** debe permanecer deshabilitado para que SRV-DHCP sea el único servidor encargado de distribuir direcciones IP en la infraestructura.

Para guardar esta última configuración, se debe acceder a la interfaz gráfica del AP-WiFi, entrar en Setup, seleccionar DHCP Server: Disabled y guardar los cambios mediante Save Settings.

## 📄 Archivos del proyecto

- `Red_Empresarial_Segmentada.pkt`: archivo principal de la simulación en Cisco Packet Tracer.
- `R1-Central_config.md`: documentación de la configuración del router principal.
- `Configuraciones_Switches_y_Equipos.md`: documentación de las configuraciones de switches y equipos.
- `Topologia_Red_Empresarial.html`: representación de la topología de red.
- `Contrasenas_Acceso_Dispositivos.md`: documentación de credenciales del entorno de laboratorio.

## 🧪 Pruebas y validaciones

Se contemplan las siguientes verificaciones:

1. Comprobar la asignación de direcciones IP mediante DHCP.
2. Verificar la conectividad de los equipos con sus puertas de enlace.
3. Comprobar la comunicación entre las diferentes VLAN.
4. Validar el funcionamiento del servidor DNS.
5. Revisar los enlaces troncales y las subinterfaces del router.
6. Verificar las reglas ACL.
7. Comprobar el funcionamiento de Port Security.
8. Validar la conexión inalámbrica protegida mediante WPA2-PSK.

## 🛠️ Tecnologías utilizadas

- Cisco Packet Tracer.
- Cisco IOS.
- VLAN.
- IEEE 802.1Q.
- Router-on-a-Stick.
- DHCP y DHCP Relay.
- DNS.
- ACL.
- Port Security.
- WPA2-PSK.

## 👨‍💻 Información académica

**Proyecto:** Red Empresarial Segmentada.

**Área:** Desarrollo de Sistemas de Comunicación.

**Herramienta principal:** Cisco Packet Tracer.

---

*Proyecto desarrollado con fines académicos y de aprendizaje sobre diseño, configuración y administración de redes empresariales.*
