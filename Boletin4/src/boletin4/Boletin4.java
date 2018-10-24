/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

import java.util.Scanner;

/**
 *
 * @author Iagob
 */
public class Boletin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int velocidade;
        Coche coche1 = new Coche();
        Scanner valor = new Scanner(System.in);
        
        System.out.println("introduce velocidade");
        velocidade=valor.nextInt();
        coche1.setVelocidade(velocidade);
        System.out.println("velocidade=" +coche1.getVelocidade());
        coche1.acelerar(10);
        System.out.println("velocidade=" +coche1.getVelocidade());
        coche1.frenar(5);
        System.out.println("velocidade=" +coche1.getVelocidade());
    }
    
}
