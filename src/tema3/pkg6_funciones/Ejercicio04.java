/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.pkg6_funciones;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio04 {
    public static String fechaCompleta(int dia, int mes, int año) {
        boolean meses;
        boolean años;
        boolean dias;
        String fecha="";
        
        String []nombreMes={
            "","enero","febrero","marzo","abril","mayo","junio","julio","agosto",
            "septiembre","octubre","noviembre","diciembre"
        };
        
        //fecha = dia+" de "+nombreMes[mes]+" del "+año;
        fecha = String.format("%d de %s del %d",dia, nombreMes[mes],año); //EXamen el String.format
        return fecha;
        
    }
    public static boolean fechaCorrecta(int dia,int mes, int año) {
        boolean meses=true;
        boolean años=false;
        boolean dias=false;
        boolean fecha=false;
        if(año>0 && 2022<año){
            años=true;
        }
        switch (mes){
            case 1,3,5,7,8,10,12 :  if (dia>=1 && dia <= 31){
                                        dias=true;
                                    }
                                    break;
            case 4,6,9,11 : if (dia >= 1 && dia <= 30){
                                dias=true;
                            }
                            break;
            case 2 : if (Year.of(año).isLeap()){
                            if (dia>=1 && dia<=29){
                                dias=true;
                            }
                        } else if(dia>=1 && dia<=28){
                            dias=true;
                        } 
                        break;
            default: meses=false;
                        break;
        }
        if (dias==true && años==true && meses==true){
            fecha = true;
        } 
        return fecha;
        
    }
    
    public static int getDia(String fecha){
        String[] cadena = fecha.split("/");
        return Integer.parseInt(cadena[0]);
    }
    public static int getMes(String fecha){
        String[] cadena = fecha.split("/");
        return Integer.parseInt(cadena[1]);
    }
    public static int getAño(String fecha){
        String[] cadena = fecha.split("/");
        return Integer.parseInt(cadena[2]);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        System.out.print("Dime una fecha (dd/mm/aaaa) : ");
        String fecha = s.nextLine();
        int dia = getDia(fecha);
        int mes = getMes(fecha);
        int año = getAño(fecha);
        
        if(fechaCorrecta(dia,mes,año)){
            System.out.println(fechaCompleta(dia, mes, año));
        }
        
        
        

    }
    
}
