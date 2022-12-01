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
public class Ejercicio08 {
    public static int aleatorio(int min, int max) {
        //Algoritmo. Ambos extremos tienen que ser >=0
        
        int num = (int) (Math.random()*(max-min+1)+min); //max y min incluidos
        return num;
        
    }
    public static int sumaArray(int array[]) {
        int suma=0;
        for (int i = 0; i < array.length; i++) {
            suma = array[i]+ suma;
        }
        return suma;
        
    }
    public static int minArray(int array[]) {
        int num_max=10;
        int minimo=num_max;
        for (int i = 0; i < array.length; i++) {
            if(minimo>array[i]){
                minimo = array[i];
            }
        }
        return minimo;
        
    }
    public static int maxArray(int array[]) {
        int max=0;
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max = array[i];
            }
        }
        return max;
        
    }
    public static void generarArray(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("|"+array[i]);
        }
        System.out.println("|");
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner (System.in);
        int opcion =0;
        int []array = new int [5];
        do{
            int min = -10, max = 10;
            
            System.out.println("Menu de ARRAY");
            System.out.println("*******************");
            System.out.println("Array --->");generarArray(array);

            System.out.println("1. Generar nuevo Array");
            System.out.println("2. Obtener el maximo y el minimo");
            System.out.println("3. Obtener la suma");
            System.out.println("4. Salir");
            
            do{
                System.out.println("¿Que opcion quieres elegir?");
                opcion = Integer.parseInt(s.nextLine());
            } while(opcion>4 || opcion<1);
            
            switch(opcion){
                case 1: 
                    for (int i = 0; i < array.length; i++) {
                        array[i] = aleatorio(min,max);
                    }
                    break;
                case 2: 
                    System.out.println("El maximo es --> "+maxArray(array));
                    System.out.println("El minimo es --> "+minArray(array));
                    break;
                case 3: 
                    System.out.println("La suma es --> "+sumaArray(array));
                    break;
                
                case 4: 
                    System.out.println("Saliendo.....");
                    break;
            }
        }while(opcion!=4);
        
    }
    
}
