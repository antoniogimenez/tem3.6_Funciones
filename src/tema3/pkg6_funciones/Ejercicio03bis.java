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
public class Ejercicio03bis {

    public static int fechaCorrecta(int dia,int mes, int año) {
        boolean meses=true;
        boolean años=false;
        boolean dias=false;
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
                    dias = false;
                        break;
        }
        if (dias==true && años==true && meses==true){
            return 0;
        } else if(meses==false){
            return 2;
        } else if (dias==false){
            return 1;
        } else if(años==false){
            return 3;
        }else {
            return 4;
        }
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        int dia, mes, año;
        
        System.out.println("Dime un dia: ");
        dia = Integer.parseInt(s.nextLine());
        
        System.out.println("Dime un mes: ");
        mes = Integer.parseInt(s.nextLine());
        
        System.out.println("Dime un Año: ");
        año = Integer.parseInt(s.nextLine());
        
        if(fechaCorrecta(dia,mes,año)==0){
            System.out.println("La fecha "+dia+"/"+mes+"/"+año+" es correcta");
        }else if(fechaCorrecta(dia,mes,año)==1){
            System.out.println("La fecha "+dia+"/"+mes+"/"+año+" tiene Incorrecto el DIA");
        }else if(fechaCorrecta(dia,mes,año)==2){
            System.out.println("La fecha "+dia+"/"+mes+"/"+año+" tiene Incorrecto el MES");
        } else if(fechaCorrecta(dia,mes,año)==3){
            System.out.println("La fecha "+dia+"/"+mes+"/"+año+" tiene Incorrecto el AÑO");
        }else {
            System.out.println("La fecha "+dia+"/"+mes+"/"+año+" es incorrecta");
        }
    }
    
}
