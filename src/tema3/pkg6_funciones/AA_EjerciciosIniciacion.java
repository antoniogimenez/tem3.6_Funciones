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
public class AA_EjerciciosIniciacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Funcion con 1 parametro de entrada
        System.out.println("Raiz cuadrada de 9: "+Math.sqrt(9));
        
        
        //Funcion con 0 parametros de entrada
        String cadena = "ABCD";
        System.out.println("Longitud de la cadena ABCD: "+cadena.length());
        
        //Funcion con 2 parametros 
        Math.pow(2, 3);  //OJO, esto no hace nada
                         // La funcion solo dvuelve un valor 
                         // Hay que asignarlo a una variable o usarlo en ootra funcion hacer algo con dicho valor
        double potencia = Math.pow(2, 3);
        System.out.println("2 elevado a 3 es: "+potencia);
        //Directamente uso el valor de la funcion
        System.out.println("2 elevado a 3 es: "+Math.pow(2, 3));
        
        
        System.out.println("El area del cuadrado de lado = 2 es: "+areaCuadrado(2));
        
        
        Scanner s = new Scanner (System.in);
        double radio;
        System.out.println("Dime el radio");
        radio = Double.parseDouble(s.nextLine());
        
        System.out.println("El area del circulo de radio "+radio+" es: "+areaCirculo(radio));
    }//FIN mAIN
    
    //Area del cuadrado
    public static int areaCuadrado(int lado) {
        int area;
        area = lado * lado;
        return area;
        
        //return lado*lado //es equivalente a todo el otro codigo
    }
    
    //Area del circulo PI*r*r
    public static double areaCirculo(double radio) {
        double area;
        area = radio * radio * Math.PI;
        return area;
        
        //return lado*lado //es equivalente a todo el otro codigo
    }
    
}
