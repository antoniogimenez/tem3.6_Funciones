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
public class Ejercicio05 {
    public static int aleatorio(int min, int max) {
        //Algoritmo. Ambos extremos tienen que ser >=0
       
        
        int num=(int)(Math.random()*(max-min+1)+min); //max y min incluidos
        return num;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner (System.in);
        
        int min;
        int max;
        int veces;
        

        
        System.out.println("Dime el numero minimo: ");
        min = Integer.parseInt(s.nextLine());
        
        System.out.println("Dime el numero maximo: ");
        max = Integer.parseInt(s.nextLine());
        
        System.out.println("Cuantos numeros quieres obtener: ");
        veces = Integer.parseInt(s.nextLine());
        
        for (int i = 0; i < veces; i++) {
            System.out.println("Los numeros aleatorios son: "+aleatorio(min,max));
        }
        
        
    }
    
}
