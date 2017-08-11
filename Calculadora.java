/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincalculadora;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Calculadora {
     Scanner leer=new Scanner(System.in);
    private int num1;
    private int num2;
    private float resultado;
	
	void aceptarDatos(){
		System.out.println("De primer numero");
		num1= leer.nextInt();
		System.out.println("De segundo numero numero");
                num2=leer.nextInt();
	}
	void sumar(){
		resultado = num1 + num2;
	}
	void restar(){
		resultado = num1 - num2;
	}
	void multiplicar(){
		resultado = num1 * num2;
	}
	void dividir(){
		
                if(num2==0)
                {
                    System.out.println("LA DIVISION ENTRE CERO NO ESTA ESPECIFICADA.");
                }
                else{
                   resultado = (float)num1/ num2; 
                }
	}
        void opcionInvalida(){
            System.out.println("Opcion invalida.");
            System.out.println("Ingrese opcion correcta");
        }
	 void desplegar(){
                System.out.println("El resultado es: "+resultado);
            
		
	}

        
    
}
