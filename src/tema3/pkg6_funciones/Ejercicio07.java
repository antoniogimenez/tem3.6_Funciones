/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.pkg6_funciones;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio07 {
    public static boolean comparar_vectores(int [] lista1, int [] lista2) {
        if (lista1.length != lista2.length )
            return false;
        else{
            //Los arrays tienen el mismo tamaño. Comparo posición a posición
            for (int i = 0; i < lista1.length; i++) {
                if (lista1[i]!=lista2[i]){
                    return false;
                }
               
            }
        }
        return true;
    }
    public static int[] fusionar_vectores(int [] lista1, int [] lista2) {
        int longitud;
        int indice_resultado=0;
        
        longitud = lista1.length + lista2.length;
        int []listaplus= new int [longitud];
        
        for (int i = 0; i < lista1.length; i++) {
              listaplus[indice_resultado]=lista1[i];
              indice_resultado++;
        }
        
        for (int i = 0; i < lista2.length; i++) {
              listaplus[indice_resultado]=lista2[i];
              indice_resultado++;
        }
        return listaplus;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int lista1[] = {1,2,3};
        int lista2[] = {1,2,3};
        int []listaplus = fusionar_vectores(lista1,lista2);
        
        for (int i = 0; i < listaplus.length; i++) {
            System.out.print("|"+listaplus[i]);
        }
        System.out.println("|");
        
        if(comparar_vectores(lista1,lista2)== true){
            System.out.println("Son Iguales");
        } else {
            System.out.println("Son Dirferentes");
        }
    }
    
}
