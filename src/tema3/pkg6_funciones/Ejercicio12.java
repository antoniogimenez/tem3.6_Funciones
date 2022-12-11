/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.pkg6_funciones;

/**
 *
 * @author anton
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    //OPCION 1 de función para replicar un array
    //usando el paso por referencia
    public static void replicaArray (int []lista1, int []lista2){
        for (int i = 0; i < lista1.length; i++) {
            lista1[i]=lista2[i];
        }
        
    }
    public static void imprimirArray (int []lista1){
        System.out.print("Array --> |");
        for (int i = 0; i < lista1.length; i++) {
            System.out.print(lista1[i]+" |");
        }
        System.out.println("");
        
    }
    public static int[] replicarArray(int[]lista1){
        
        int[]lista2=new int[lista1.length];
        
        for (int i = 0; i < lista1.length; i++) {
            lista2[i]=lista1[i];
        }
        
        return lista2;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PARTE A");
        int []lista1 = {1,2,3};
        int []lista2 = new int[lista1.length];
        //OPCION 1 de función para replicar un array
        //usando el paso por referencia
        replicaArray(lista1,lista2);
        lista2[0]=10;
        lista2[1]=20;
        lista2[2]=30;
        imprimirArray(lista1);
        imprimirArray(lista2);
        
        System.out.println("PARTE B");
        System.out.println("----------------------");
        System.out.println("Opción 1");
        replicaArray(lista1,lista2);
        imprimirArray(lista1);
        imprimirArray(lista2);
        System.out.println("Opción 2");
        lista2=replicarArray(lista1);
        imprimirArray(lista1);
        imprimirArray(lista2);
        
    }
    
}
