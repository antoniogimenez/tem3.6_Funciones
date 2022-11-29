/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.pkg6_funciones;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Definimos un entero y lo pasamos como parámetro
        int unentero=10;
        System.out.println("Valor de [unentero] antes:"+unentero);
        modificarEntero(unentero);
        System.out.println("Valor de [unentero] despues:"+unentero);
        System.out.println("");


        //Definimos una cadena y la pasamos como parámetro
        String unacadena="Hola";
        System.out.println("Valor de [unacadena] antes:"+unacadena);
        modificarString(unacadena);
        
        System.out.println("Valor de [unacadena] despues:"+unacadena);
        System.out.println("");

        //Definimos un array y lo pasamos como parámetro
        int[] unarray={1,2,3,4,5};
        System.out.print("Valor de [unarray] antes:");
        for (int i = 0; i < 5; i++) {
        System.out.print("-"+unarray[i]+"-");
        }
        System.out.println("");
        modificarArray(unarray);
        System.out.print("Valor de [unarray] despues:");
        for (int i = 0; i < 5; i++) {
        System.out.print("-"+unarray[i]+"-");
        }
        System.out.println("");

        }//fin del main
        
    public static void modificarEntero(int entero){
        entero++;
        System.out.println(" Dentro de la funcion, el valor es:"+entero);
    }

    public static void modificarString(String cadena){
        cadena="Adios";
        System.out.println(" Dentro de la funcion, el valor es:"+cadena);
    }

    public static void modificarArray(int[] array){
        array[0]=11;
        array[1]=12;
        array[2]=13;
        array[3]=14;
        array[4]=15;
        System.out.print(" Dentro de la función, el valor es:");
        for (int i = 0; i < 5; i++) {
            System.out.print("-"+array[i]+"-");
        }
        System.out.println("");
    }
}
