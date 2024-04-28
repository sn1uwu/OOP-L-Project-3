package project3java;

import java.util.Scanner;

public class Project3java {
    public static void main(String[] args) {
        bukuteman friendBook = new bukuteman();
        Scanner scanner = new Scanner(System.in);
        String userChoice;

        System.out.println("===== Buku Teman Menu =====");
        System.out.println("A. Lihat Data");
        System.out.println("B. Tambah Data");
        System.out.println("C. Ubah Data");
        System.out.println("D. Hapus Data");
        System.out.println("E. Keluar");

        do {
            System.out.print("Pilih Menu (A/B/C/D/E): ");
            userChoice = scanner.nextLine().toUpperCase();

            switch (userChoice) {
                case "A":
                    friendBook.viewData();
                    break;
                case "B":
                    friendBook.storeData();
                    break;
                case "C":
                    friendBook.updateData();
                    break;
                case "D":
                    friendBook.destroyData();
                    break;
                case "E":
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Silakan masukkan pilihan yang valid (A/B/C/D/E)");
                    break;
            }
        } while (!userChoice.equals("E"));
        
        scanner.close();
    }
}
