/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Junior
 */
public class client extends JFrame implements ActionListener {

    JTextField Fn;
    Label mensaje;
    Button send;
    TextArea response;

    public client() {
        Fn = new JTextField("DD-MM-AAAA");
        Fn.setBounds(10, 40, 100, 20);
      //Fn.setBounds(x, y , ancho, largo);
        mensaje = new Label("La pitoniza");
        mensaje.setBounds(150, 10, 100, 20);

        send = new Button("Enviar");
        send.setBounds(10, 70, 100, 20);
        //para capturar el evento al precionar el boton
        send.addActionListener(this);

        response = new TextArea();
        response.setBounds(10, 100, 350, 250);

        add(Fn);
        add(mensaje);
        add(response);
        add(send);

        setLayout(null);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new client();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == send) {
            try {
                Socket Sk_client = new Socket("127.0.0.1", 9090);
                DataOutputStream DateOut = new DataOutputStream(Sk_client.getOutputStream());
                DateOut.writeUTF(Fn.getText().toString());
                DataInputStream input = new DataInputStream( Sk_client.getInputStream() );
                response.setText(input.readUTF());

            } catch (IOException ex) {
                System.out.print("ERROR: " + ex.getMessage());
            }
        }
    }
}
