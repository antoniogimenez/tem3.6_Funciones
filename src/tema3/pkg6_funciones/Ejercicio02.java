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
public class Ejercicio02 {
    public static boolean esAfortunado(int num) {
        boolean afortunado=false;
        int cont=0, notcont=0;
        while (num > 0) {
            int digito = (int)(num % 10);
            if ((digito == 2) || (digito == 5) || (digito == 8)) {
                cont++;
            }else {
                notcont++;
            }
            num /= 10;
        }
        if (cont > notcont){
            return afortunado=true;
        }else{
            return afortunado;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        String cadena;
        do{
            System.out.println("Dime un numero: ");
            cadena =s.nextLine();
            
            if(!cadena.equals("")){
                int num = Integer.parseInt(cadena);
                if(esAfortunado(num)){
                    System.out.println("El numero "+num+" es afortunado");
                } else {
                    System.out.println("El numero "+num+" es no es afortunado");
                }
            } else {
                System.out.println("bye, bye");
                break;
            }
            
        }while(cadena != "  ");
        
    }

}
