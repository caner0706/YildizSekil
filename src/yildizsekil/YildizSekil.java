package yildizsekil;

import java.util.Scanner;

public class YildizSekil {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        
        // Yıldızlar ile üçgen çizdirme
        
        System.out.print("Bir Sayı Giriniz : ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        
        //Yıldızlar ile elmas çizdirme
        
        System.out.print("Elmasın yüksekliğini girin: ");
        int yukseklik = scanner.nextInt();
        
        int boslukSayisi = yukseklik - 1;
        int yildizSayisi = 1;
        
        // Elmasın üst yarısını oluşturma
        for (int i = 0; i < yukseklik; i++) {
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }
            
            System.out.println();
            
            boslukSayisi--;
            yildizSayisi += 2;
        }
        
        boslukSayisi = 1;
        yildizSayisi = 2 * yukseklik - 3;
        
        // Elmasın alt yarısını oluşturma
        for (int i = 0; i < yukseklik - 1; i++) {
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }
            
            System.out.println();
            
            boslukSayisi++;
            yildizSayisi -= 2;
        }
    }
    
}
