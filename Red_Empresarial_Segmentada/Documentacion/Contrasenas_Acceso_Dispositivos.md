# Contraseñas de acceso a dispositivos: Red_Empresarial_Segmentada

> Contraseñas de laboratorio. No las uses en una red real.
> El exportador de NetPilot no admite estos comandos, así que **no están dentro del .pkt**. Pégalos a mano en la CLI de cada dispositivo después de abrir el archivo.

## Tabla de credenciales

| Dispositivo | Acceso | Usuario | Contraseña |
|---|---|---|---|
| R1-Central, SW-Core, SW1, SW2, SW3 | Modo privilegiado (`enable secret`) | n/a | `Cl@ve_Enable2026` |
| R1-Central, SW-Core, SW1, SW2, SW3 | Consola (`line con 0`) | n/a | `Cl@ve_Consola2026` |
| R1-Central, SW-Core, SW1, SW2, SW3 | Remoto (`line vty 0 4`) | n/a | `Cl@ve_Vty2026` |
| AP-WiFi (Linksys) | Administración web (pestaña Administration, Router Password) | admin | `Admin_AP2026` |
| AP-WiFi | Wi-Fi WPA2-PSK, SSID `EMPRESA_WIFI` (ya está en el .pkt) | n/a | `Empresa2026Lab` |

Los servidores y los PCs de Packet Tracer no piden contraseña de acceso.

## Router R1-Central

```
enable
configure terminal
service password-encryption
enable secret Cl@ve_Enable2026
banner motd ^ Acceso autorizado solamente ^
line console 0
 password Cl@ve_Consola2026
 login
 exit
line vty 0 4
 password Cl@ve_Vty2026
 login
 exit
end
write memory
```

## Switches (SW-Core, SW1, SW2, SW3: el mismo bloque en cada uno)

```
enable
configure terminal
service password-encryption
enable secret Cl@ve_Enable2026
banner motd ^ Acceso autorizado solamente ^
line console 0
 password Cl@ve_Consola2026
 login
 exit
line vty 0 15
 password Cl@ve_Vty2026
 login
 exit
end
write memory
```

Los switches no tienen IP de administración (SVI), así que `vty` no se podrá usar hasta que añadas una. La consola sí funciona.

## Cómo verificar

```
show running-config | section line
show running-config | include enable secret
```

Cierra la sesión (`exit`) y vuelve a entrar: debe pedir la contraseña de consola. Luego escribe `enable` y debe pedir `Cl@ve_Enable2026`.
