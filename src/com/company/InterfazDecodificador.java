package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazDecodificador extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton identificarButton;
    private JButton limpiarButton;

    private JMenuBar menuBar;
    private JMenu archivo;
    private JMenuItem salir;
    private JMenuItem memoria;

    public InterfazDecodificador() {
        /** Agregados a la pestaña de la Ventana*/

        super("DECODIFICADOR ADN BIOTEC");

        setContentPane(panel1);

        menuBar = new JMenuBar();
        archivo = new JMenu ("ARCHIVO");
        memoria = new JMenuItem("MEMORIA");
        salir = new JMenuItem("SALIR");


        menuBar.add(archivo);
        archivo.add(memoria);
        archivo.add(salir);


        setJMenuBar(menuBar);

        identificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /** Declaracion de lo contenido en las cajas de texto*/
                String SecuenciaA =textField1.getText();
                String SecuenciaB = textField2.getText();
                String Resultado = textField3.getText();

                /**Llamado de los atributos de la clase donde se encuntra la logica*/
                Metodosinterfaz llamado = new Metodosinterfaz();
                String resultado = llamado.obtenerResultado(SecuenciaA, SecuenciaB, Resultado);
                textField3.setText(resultado);
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /** Accion del boton Limpiar*/
                textField1.setText(null);
                textField2.setText(null);
                textField3.setText(null);
            }
        });
    }
}
