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
public class MainCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        char resp = 's';
	int _opc;
	Calculadora objCalc = new Calculadora();
		while (resp == 's')
		{
			System.out.println("CALCULADORA");
			System.out.println("1 suma ");
			System.out.println("2 resta ");
			System.out.println("3 multiplicacion ");
			System.out.println("4 division ");
			System.out.println("Teclea la opcion ");
			_opc = leer.nextInt();
			objCalc.aceptarDatos();
			switch(_opc)
			{
				case 1:
				objCalc.sumar();
				break;
				case 2:
				objCalc.restar();
				break;
				case 3:
				objCalc.multiplicar();
				case 4:
				objCalc.dividir();
				break;
				default:
				System.out.println("Opcion no validad. Ingrese una opcion correcta");
			}
                        if((_opc<=4) && (_opc>=1))
                        {
                            objCalc.desplegar();
                        }
			
			System.out.println("Desea continuar? s/n");
			resp = leer.next().charAt(0);
		}
    }
    
}
