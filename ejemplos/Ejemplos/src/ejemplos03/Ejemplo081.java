/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo081 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        String mensajeSuma;
        String mensajeSumaDos;
        int tabla;
        int limite;
        int indice;

        System.out.println("Ingrese el numero del que desea la tabla");
        tabla = entrada.nextInt();
        System.out.println("Ingrese el limite de la tabla");
        limite = entrada.nextInt();
        System.out.println("Ingrese segun desee: (1) Tabla-Sumar; (2) Tabla-"
                + "Multiplicar");
        indice = entrada.nextInt();
        if (indice == 1) {
            mensajeSuma = obtenerTablaSumar(limite, tabla);
            System.out.printf("%s\n", mensajeSuma);
        } else {
            if (indice == 2) {
                mensajeSumaDos = obtenerTablaMultiplicar(limite, tabla);
                System.out.printf("%s\n", mensajeSumaDos);
            }
        }

    }

    public static String obtenerTablaSumar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;
    }

    public static String obtenerTablaMultiplicar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;

    }

}
