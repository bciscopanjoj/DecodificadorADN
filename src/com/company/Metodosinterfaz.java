package com.company;

public class Metodosinterfaz {

/** Inclusion de la parte logica, obviando la parte que era dirigido para la consola*/
    /**Declaracion de Variables*/
    public String obtenerResultado(String SecuenciaA, String SecuenciaB, String Resultado){
        /** Ciclo que reccorra las dos cadenas*/
//En algun punto esta parte se puede omitir las secuencias no se ven condicionadas por algun patron
        /**String BasesAdyacentes;
         for (int i = 0; i < SecuenciaA.length(); i++){
         for (int j = 0; j < SecuenciaB.length(); j++){
         int orden1 = i;
         int orden2 = j;
         BasesAdyacentes = "";
         boolean Similares = true;
         while (orden2 < SecuenciaB.length() && orden1 < SecuenciaA.length() && Similares){
         if (SecuenciaA.charAt(orden1) == SecuenciaB.charAt(orden2)){
         BasesAdyacentes += SecuenciaA.charAt(orden1);
         }else{
         Similares = false;
         }
         orden1++;
         orden2++;
         }
         if (BasesAdyacentes.length() > ConjuntoMaximo.length()){
         ConjuntoMaximo = BasesAdyacentes;
         }
         }
         }*/

/** Parte del Ciclo que costituye la comparacion directa y almacenaje del resultado*/
        String resultado = null;
        if(SecuenciaA.length() >= SecuenciaB.length()){
            for (int i = SecuenciaA.length(); i >= 0; i--)
            {
                for (int j = 0; j < i; j++){
                    if (SecuenciaA.contains(SecuenciaB.substring(j, i)) &&
                            Resultado.length() < SecuenciaA.substring(j, i).length())
                        Resultado = SecuenciaA.substring(j, i);//s
                }
            }
        }else if(SecuenciaB.length() >= SecuenciaA.length())
        {
            for (int i = SecuenciaB.length(); i >= 0; i--)
            {
                for (int j = 0; j < i; j++) {
                    if (SecuenciaA.contains(SecuenciaB.substring(j, i)) &&
                            Resultado.length() < SecuenciaB.substring(j, i).length()) {
                        Resultado = SecuenciaB.substring(j, i);
                    }
                }
            }
        }
        resultado = Resultado;
        return resultado;
    }
}
