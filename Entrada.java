/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrada;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double euro = 18.21;
        double dolar = 17.07;
        double yen = 0.12;
        double libra = 21.18;
                
    Scanner lectura = new Scanner(System.in);
    System.out.println("ingrese la cantidad en pesos mexicanos");
    double peso = lectura.nextInt();
     
     System.out.println("Euro: " + peso/euro);
     System.out.println("Dolar: " + peso/dolar);
     System.out.println("Yen: " + peso/yen);
     System.out.println("Libra: " + peso/libra);
    
    }
    
}
