/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.pkg6_funciones;

import java.util.Scanner;
import static tema3.pkg6_funciones.Ejercicio08.aleatorio;
import static tema3.pkg6_funciones.Ejercicio08.generarArray;
import static tema3.pkg6_funciones.Ejercicio08.maxArray;
import static tema3.pkg6_funciones.Ejercicio08.minArray;
import static tema3.pkg6_funciones.Ejercicio08.sumaArray;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner (System.in);
        int opcion =0;
        String []array = {""};
        String cadena = "";
        do{
            
            System.out.println("Menu de ARRAY");
            System.out.println("*******************");
            System.out.println("Cadena ---> "+cadena);

            System.out.println("1. Introducir nueva cadena");
            System.out.println("2. Capitalizar la cadena");
            System.out.println("3. Sustituir los espacios en blanco por _");
            System.out.println("4. Salir");
            
            do{
                System.out.println("¿Que opcion quieres elegir?");
                opcion = Integer.parseInt(s.nextLine());
            } while(opcion>4 || opcion<1);
            
            switch(opcion){
                case 1:
                    cadena = devolverCadena();
                    break;
                case 2: 
                    cadena=capitalizarCadena(cadena);
                    break;
                case 3: 
                    cadena = sustituir_blancos(cadena);
                    break;
                
                case 4: 
                    System.out.println("Saliendo.....");
                    break;
            }
        }while(opcion!=4);
    }
    
    public static String devolverCadena(){
        Scanner s = new Scanner(System.in);
        System.out.println("Dime una frase: ");
        String cadena = s.nextLine();
        return cadena;
    }
    
    public static String capitalizarCadena(String cadena){
        String cadenaNew = "";
        char c;
        
        cadena = cadena.trim();
        char primerCaracter = cadena.charAt(0);
        
        cadenaNew=cadenaNew+Character.toUpperCase(primerCaracter);
        
        for (int i = 1; i < cadena.length(); i++) {
            //Caracter anterior es un espacio en blanco
            //Pongo el actual en mayusculas
            if(cadena.charAt(i-1)==' '){
                c = cadena.charAt(i);
                cadenaNew=cadenaNew+Character.toUpperCase(c);
            }
            //El caracter anterior NO es blanco
            //concateno el caracter actual tal cual
            else{
                c = cadena.charAt(i);
                cadenaNew = cadenaNew+c;
            }
        }
        return cadenaNew;
    }
    
    public static String sustituir_blancos(String cadena){
        String nuevaCadena="";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==' '){
                nuevaCadena=nuevaCadena+"_";
            }
            else{
                nuevaCadena=nuevaCadena+cadena.charAt(i); 
            }
        }
        return nuevaCadena;
    }
    
}
