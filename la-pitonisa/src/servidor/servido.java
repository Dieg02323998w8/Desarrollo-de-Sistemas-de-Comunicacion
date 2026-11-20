/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Junior
 */
public class servido extends JFrame implements Runnable {

    Thread hilo = new Thread(this);

    public servido() {
        setSize(400, 400);
        hilo.start();
        setVisible(true);
    }

    public static void main(String[] args) {
        new servido();
    }

    @Override
    public void run() {
        try {
            ServerSocket servidor = new ServerSocket(9090);
            Socket sk_cliente;
            while (true) {
                sk_cliente = servidor.accept();
                if (false) {
                    sk_cliente.close();
                    break;
                } else {
                    try {
                        DataInputStream dataInpu = new DataInputStream(sk_cliente.getInputStream());
                        String FN = dataInpu.readUTF();
                        String[] FNF = FN.split("-");
                        int dia = Integer.parseInt(FNF[0]);
                        int mes = Integer.parseInt(FNF[1]);
                        File archivo = new File("src\\servidor\\" + selecionarSigno(dia,mes) + ".txt");
                        int buscar = (int) (Math.random() * 5) + 1;
                        String pbuscar = String.valueOf(buscar) + ".";
                        DataOutputStream salida = new DataOutputStream(sk_cliente.getOutputStream());
                        salida.writeUTF( buscarMensaje(archivo, pbuscar));
                    } catch (Exception e) {
                    }
                }
            }

        } catch (IOException ex) {
        }

    }

    public String buscarMensaje(File archivo, String pbuscar) {
        try {
            if (archivo.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(archivo));
                String lineaL;
                while ((lineaL = reader.readLine()) != null) {
                    String[] mensaje = lineaL.split(" ");
                    for (int i = 0; i < mensaje.length; i++) {
                        if (mensaje[i].equals(pbuscar)) {
                            return lineaL;
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return "Sucedio algun error";
    }

    public String selecionarSigno(int dia, int mes) {
        String signo = "";
        if ((dia >= 21 && mes == 3) || (dia <= 20 && mes == 4)) {
            signo = "aries";
        } else if ((dia >= 21 && mes == 4) || (dia <= 20 && mes == 5)) {
            signo = "tauro";
        } else if ((dia >= 21 && mes == 5) || (dia <= 21 && mes == 6)) {
            signo = "geminis";
        } else if ((dia >= 22 && mes == 6) || (dia <= 22 && mes == 7)) {
            signo = "cancer";
        } else if ((dia >= 23 && mes == 7) || (dia <= 23 && mes == 8)) {
            signo = "leo";
        } else if ((dia >= 24 && mes == 8) || (dia <= 23 && mes == 9)) {
            signo = "virgo";
        } else if ((dia >= 24 && mes == 9) || (dia <= 22 && mes == 10)) {
            signo = "libra";
        } else if ((dia >= 23 && mes == 10) || (dia <= 22 && mes == 11)) {
            signo = "escorpion";
        } else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
            signo = "sagitario";
        } else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) {
            signo = "capricornio";
        } else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) {
            signo = "acuario";
        } else if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)) {
            signo = "piscis";
        }

        return signo;
    }
}
