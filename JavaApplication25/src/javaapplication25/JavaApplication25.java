/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
import java.util.Scanner;
/**
 *
 * @author hekimcanaktas
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


int birinciSayi ,ikinciSayi;
Scanner scanner = new Scanner(System.in);
        
        System.out.println("Birinci sayıyı giriniz: ");   
        birinciSayi = scanner.nextInt();
        System.out.println("İkinci sayiyi giriniz:");
        ikinciSayi = scanner.nextInt();
        System.out.println("Değiştirilmeden önce...");
        System.out.println("birinci sayı : " + birinciSayi+  " ikinci sayı : " + ikinciSayi);
        int gecici = birinciSayi;
        birinciSayi= ikinciSayi;
        ikinciSayi = gecici;
        
        System.out.println("Değiştirildikten sonra...");
        System.out.println("birinci sayı : " + birinciSayi+  " ikinci sayı : " + ikinciSayi);

        
        
        }
    
}
