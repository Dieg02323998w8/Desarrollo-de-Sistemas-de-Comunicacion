# 🌐 Red Empresarial Segmentada

## 📌 Descripción del proyecto

Red Empresarial Segmentada es un proyecto académico orientado al diseño e implementación de una infraestructura de red empresarial mediante Cisco Packet Tracer.

El proyecto utiliza segmentación lógica mediante VLAN para organizar los dispositivos por departamentos y servicios, permitiendo una administración más estructurada de la infraestructura de comunicaciones.

La arquitectura contempla enrutamiento inter-VLAN mediante un router Cisco, enlaces troncales IEEE 802.1Q y servicios centralizados de DHCP y DNS.

## 🎯 Objetivos

- Implementar una infraestructura de red segmentada mediante VLAN.
- Organizar los dispositivos según las áreas de la organización.
- Configurar el enrutamiento entre diferentes VLAN.
- Centralizar la asignación de direcciones IP mediante DHCP.
- Implementar resolución de nombres mediante DNS.
- Configurar enlaces troncales entre los dispositivos de red.
- Documentar las configuraciones de los equipos y servicios.

## 🏗️ Arquitectura de red

La infraestructura está compuesta por los siguientes dispositivos:

| Dispositivo | Función |
|---|---|
| R1-Central | Router principal encargado del enrutamiento inter-VLAN. |
| SW-Core | Switch principal de distribución. |
| SW1 | Switch de acceso. |
| SW2 | Switch de acceso. |
| SW3 | Switch de acceso. |
| SRV-DHCP | Servidor de asignación dinámica de direcciones IP. |
| SRV-DNS | Servidor de resolución de nombres. |
| AP-WiFi | Punto de acceso para dispositivos inalámbricos. |

## 🧩 Segmentación de red mediante VLAN

La red se encuentra organizada en seis VLAN:

| VLAN | Nombre | Red | Gateway |
|---|---|---|---|
| 10 | Administración | 192.168.10.0/24 | 192.168.10.1 |
| 20 | Docentes | 192.168.20.0/24 | 192.168.20.1 |
| 30 | Estudiantes | 192.168.30.0/24 | 192.168.30.1 |
| 40 | Biblioteca | 192.168.40.0/24 | 192.168.40.1 |
| 50 | Servidores | 192.168.50.0/24 | 192.168.50.1 |
| 60 | Wi-Fi | 192.168.60.0/24 | 192.168.60.1 |

## 🖥️ Servicios de red

### DHCP

El servicio DHCP se encuentra centralizado en el servidor SRV-DHCP.

- Dirección IP: `192.168.50.10`
- Función: asignación dinámica de direcciones IP a los dispositivos de las diferentes VLAN.
- Se contempla DHCP Relay para comunicar las VLAN de usuarios con el servidor central.

### DNS

El servicio DNS se encuentra en el servidor SRV-DNS.

- Dirección IP: `192.168.50.11`
- Función: resolución de nombres dentro de la infraestructura de red.

## 🔄 Enrutamiento inter-VLAN

La comunicación entre las diferentes redes se realiza mediante el método Router-on-a-Stick.

El router R1-Central utiliza subinterfaces con encapsulación IEEE 802.1Q para gestionar las seis VLAN y proporcionar sus respectivas puertas de enlace.

## 📁 Estructura del proyecto

```text
Red_Empresarial_Segmentada/
│
├── README.md
├── AP-WiFi.cfg
├── Contraseñas_Acceso_Dispositivos.md
├── LAPTOP1.cfg
├── LAPTOP2.cfg
├── PC-ADM1.cfg
├── PC-ADM2.cfg
├── PC-BIB1.cfg
├── PC-BIB2.cfg
├── PC-DOC1.cfg
├── PC-DOC2.cfg
├── PC-EST1.cfg
├── PC-EST2.cfg
├── PC-EST3.cfg
├── PC-EST4.cfg
├── SRV-DHCP.cfg
├── SRV-DNS.cfg
├── SW-Core.cfg
├── SW1.cfg
├── SW2.cfg
└── SW3.cfg
```

## ⚙️ Tecnologías utilizadas

- Cisco Packet Tracer.
- Redes LAN.
- VLAN.
- IEEE 802.1Q.
- Router-on-a-Stick.
- DHCP.
- DHCP Relay.
- DNS.
- Redes inalámbricas.

## 🧪 Pruebas y validaciones

Para comprobar el funcionamiento de la infraestructura se contemplan las siguientes pruebas:

1. Verificar la asignación de direcciones IP.
2. Comprobar la conectividad entre los dispositivos y sus puertas de enlace.
3. Validar la comunicación entre las diferentes VLAN.
4. Comprobar el funcionamiento del servidor DHCP.
5. Verificar la resolución de nombres mediante DNS.
6. Revisar los enlaces troncales.
7. Comprobar las configuraciones de seguridad.

## 🔐 Seguridad

Las credenciales documentadas en `Contraseñas_Acceso_Dispositivos.md` están destinadas exclusivamente al entorno académico de laboratorio.

No se recomienda utilizar estas credenciales en infraestructuras reales.

## 📚 Finalidad académica

Este proyecto permite aplicar conceptos fundamentales de redes de computadores, segmentación lógica, administración de dispositivos Cisco y configuración de servicios de infraestructura.

**Proyecto:** Red Empresarial Segmentada.

**Área:** Desarrollo de Sistemas de Comunicación.

**Herramienta:** Cisco Packet Tracer.
