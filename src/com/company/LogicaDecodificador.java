package com.company;

import java.util.Scanner;

public class LogicaDecodificador {
    private String ConjuntoMaximo;

    public void DecodificadorADN() {
        /**Declaracion de Variables*/
        String SecuenciaA;
        String SecuenciaB;
/**Entrada y Salida de Texto (Secuencias) */
        Scanner S_entrada = new Scanner(System.in);
        System.out.println("SECUENCIA A");
        SecuenciaA = S_entrada.nextLine();
        System.out.println("");
        System.out.println("SECUENCIA B");
        SecuenciaB = S_entrada.nextLine();
        ConjuntoMaximo = "";

/** Ciclo que reccorra las dos cadenas*/
/** En algun punto esta parte se puede omitir las secuencias no se ven condicionadas por algun patron*/
        String BasesAdyacentes;
        for (int i = 0; i < SecuenciaA.length(); i++) {
            for (int j = 0; j < SecuenciaB.length(); j++) {
                int orden1 = i;
                int orden2 = j;
                BasesAdyacentes = "";
                boolean Similares = true;
                while (orden2 < SecuenciaB.length() && orden1 < SecuenciaA.length() && Similares) {
                    if (SecuenciaA.charAt(orden1) == SecuenciaB.charAt(orden2)) {
                        BasesAdyacentes += SecuenciaA.charAt(orden1);
                    } else {
                        Similares = false;
                    }
                    orden1++;
                    orden2++;
                }
                if (BasesAdyacentes.length() > ConjuntoMaximo.length()) {
                    ConjuntoMaximo = BasesAdyacentes;
                }
            }
        }

/** Segunda Parte del Ciclo que costituye la comparacion directa y almacenaje del resultado*/
        if (SecuenciaA.length() >= SecuenciaB.length()) {
            for (int i = SecuenciaA.length(); i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (SecuenciaB.contains(SecuenciaA.substring(j, i)) &&
                            ConjuntoMaximo.length() < SecuenciaA.substring(j, i).length()) {
                        ConjuntoMaximo = SecuenciaA.substring(j, i);
                    }
                }
            }
            /** Salida de Texto segun se cumpla las condiciones necesarias*/
            System.out.println("Conjunto ordenado de bases adyacentes de mayor tamaño: " + ConjuntoMaximo);
            if (SecuenciaB.length() >= SecuenciaA.length())
                for (int r = SecuenciaA.length(); r >= 0; r--) {
                    for (int l = 0; l < r; l++) {
                        if (SecuenciaA.contains(SecuenciaB.substring(l, r)) &&
                                ConjuntoMaximo.length() < SecuenciaB.substring(l, r).length()) {
                            ConjuntoMaximo = SecuenciaB.substring(l, r);
                        }
                    }
                }
        }
    }
}
