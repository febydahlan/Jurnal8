/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah angka : ");
        int n = scanner.nextInt();
        long fibonacci [] = new long[n];
        fibonacci [0]= 1;
        fibonacci [1]= 1;
        int tmp = 0;
        for (int i = 2; i <  n; i++) {
            fibonacci[i]= fibonacci[i-1]  + fibonacci[i-2];
        }
        for (int i = 0; i <  n; i++) {
            tmp = tmp + (int) fibonacci [i] ;
        }
        System.out.println(" " +tmp);
    }
    
}
