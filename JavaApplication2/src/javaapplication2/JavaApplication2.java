/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Erdem Özer
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner deger = new Scanner(System.in);
        int[] dizi = {4,3,2,1};
        int sayac = 0;
        int evirmeSayisi;
        for(int i = 0; i<4; i++)
            for(int j = 0; j<4; j++)
            {
                if(dizi[i]>dizi[j] && i<j)
                    sayac++;
            }
        
        evirmeSayisi = sayac;
        System.out.println("Evirme sayisi = " + evirmeSayisi);
    //----------------------------------------------------------//
    System.out.println("------------------------------------");
        String cumle;
        cumle = deger.nextLine();
        System.out.println(cumle);
        int i = 0;
        int sayac2=0;
        int uzunluk = cumle.length();
        for(i=0;i < uzunluk;i++){
            if(cumle.charAt(i)>'d')
            {
                sayac2++;  
            }
        }
        System.out.println("d'den buyuk harf sayısı: "+ sayac2);
    }
}
