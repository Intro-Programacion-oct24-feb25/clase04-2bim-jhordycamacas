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
        String mensaje;
        
        int tabla;
        int limite;
        int indice;

        System.out.println("Ingrese el numero del que desea la tabla");
        tabla = entrada.nextInt();
        System.out.println("Ingrese el limite de la tabla");
        limite = entrada.nextInt();
        System.out.printf("Ingrese segun desee:" + "\n(1) Tabla-Sumar"
                + "\n(2) Tabla-Multiplicar\n");
        indice = entrada.nextInt();
        switch (indice) {
            case (1):
                mensaje = obtenerTablaSumar(limite, tabla);
                System.out.printf("%s\n", mensaje);
                break;
            case (2):
                mensaje = obtenerTablaMultiplicar(limite, tabla);
                System.out.printf("%s\n", mensaje);
                break;
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
