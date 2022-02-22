package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suhu, pilihan, ulang2 = 0;

        do{
            int ulang = 0;
            System.out.println("\nPROGRAM KONVERSI SUHU\n");
            System.out.println("Input data");
            System.out.print("Suhu dalam Celcius \t : ");
            suhu = input.nextInt();
            float celsius = (int) suhu;

            do{
                System.out.println("\nOPSI");
                System.out.println("1. Lihat Data Konversi");
                System.out.println("2. Edit Data Konversi");
                System.out.println("3. Exit");
                System.out.print("Pilih \t : ");
                pilihan = input.nextInt();

                switch(pilihan){
                    case 1:
                        Konversi objek = new Konversi(celsius);
                        break;
                    case 2:
                        ulang = 1;
                        break;
                    case 3:
                        ulang = 1;
                        ulang2 = 1;
                        break;
                    default:
                        System.out.println("\nOpsi tidak ada, silahkan coba lagi!\n");
                }
            } while(ulang != 1);
        } while(ulang2 != 1);
    }
}