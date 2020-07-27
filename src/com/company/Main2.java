package com.company;

import javax.swing.*;

public class Main2 {

    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                /**Configuracion de la ventana*/
                JFrame frame = new InterfazDecodificador();
                frame.setSize(550,200);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });

    }
}
