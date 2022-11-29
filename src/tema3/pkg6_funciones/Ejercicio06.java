/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.pkg6_funciones;

import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio06 {
    public static String devolverCadenaColor(String texto, String color) {
        String cadena= "Error color no encontrado";
        switch (color){
            case "negro": 
                cadena = String.format("\033[30m %s ", texto);
                break;
            case "rojo": 
                cadena = String.format("\033[31m %s\033[30m ", texto);
                break;
            case "verde":
                cadena = String.format("\033[32m %s\033[30m ", texto);
                break;
            case "amarillo":
                cadena = String.format("\033[33m %s\033[30m ", texto);
                break;
        }
        return cadena;
    }
    public static void imprimirCadenaColor(String texto, String color, boolean salto) {
        switch (color){
            case "negro": 
                System.out.printf("\033[30m %s ", texto);
                break;
            case "rojo": 
                System.out.printf("\033[31m %s\033[30m ", texto);
                break;
            case "verde":
                System.out.printf("\033[32m %s\033[30m ", texto);
                break;
            case "amarillo":
                System.out.printf("\033[33m %s\033[30m \n", texto);
                break;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner (System.in);
        
        imprimirCadenaColor("hola","rojo",true);
        imprimirCadenaColor("hola","verde",true);
        imprimirCadenaColor("hola","amarillo",true);
        
        System.out.println("------------------------------");
        
        System.out.print(devolverCadenaColor("adios","rojo"));
        System.out.print(devolverCadenaColor("adios","verde"));
        System.out.print(devolverCadenaColor("adios","amarillo"));
        
        System.out.println(devolverCadenaColor("otroa","amalillo"));
    }
    
}
