/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.pkg6_funciones;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaramos un array y lo rellenamos usando una función
        //que devuelve un array
        int[] numerosPorValor;
        numerosPorValor=rellenarArray(5);
        imprimirArray(numerosPorValor);
        
        int numerosPorRef[]=new int[5];
        rellenarArray(numerosPorRef);
        imprimirArray(numerosPorRef);
    }
    public static void imprimirArray (int vector[]){
        System.out.print("Array--> ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" "+vector[i]);
        }
        System.out.println("");
    }
    public static int[] rellenarArray(int tamaño){
        int lista[] = new int [tamaño];
        
        for (int i = 0; i < lista.length; i++) {
            lista[i]=i;
        }
        return lista;
        
    }
    public static void rellenarArray(int vector[]){
        
    }
    
}
