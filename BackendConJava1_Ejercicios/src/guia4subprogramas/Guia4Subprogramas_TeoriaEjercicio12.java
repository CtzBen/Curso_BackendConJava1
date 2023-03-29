package guia4subprogramas;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Costanzo
 */
public class Guia4Subprogramas_TeoriaEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b;
        System.out.println("Ingrese dos números: ");
        a = leer.nextInt();
        b = leer.nextInt();
        EsMultiplo(a,b);
    }
    public static void EsMultiplo(int a,int b){
        if (a%b == 0) {
            System.out.println(a+ " es múltiplo de " + b);
        } else {
            System.out.println(a+ " NO es múltiplo de " + b);
        }
}
}
