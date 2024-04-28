package project3java;

import java.util.Scanner;

public class bukuteman {
    private int rows = 10;
    private int columns = 3;
    private int activeRows = 0;
    private String[][] friendBook = new String[rows][columns];
    private Scanner inputScanner = new Scanner(System.in);

    public void storeData() {
        if (activeRows >= rows) {
            System.out.println("Buku teman sudah penuh.");
            return;
        }

        System.out.println("Menambahkan data teman");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Nama Teman: ");
        String name = inputScanner.nextLine();

        System.out.print("Alamat: ");
        String address = inputScanner.nextLine();

        System.out.print("No Telepon: ");
        String phoneNumber = inputScanner.nextLine();

        friendBook[activeRows][0] = name;
        friendBook[activeRows][1] = address;
        friendBook[activeRows][2] = phoneNumber;

        activeRows++;
        System.out.println("Data teman berhasil disimpan.");
    }

    public void updateData() {
        if (activeRows == 0) {
            System.out.println("Buku teman masih kosong.");
            return;
        }

        viewData();

        System.out.print("Masukkan nomor teman yang ingin diupdate: ");
        int index = inputScanner.nextInt();
        inputScanner.nextLine();

        if (index < 1 || index > activeRows) {
            System.out.println("Nomor teman tidak valid.");
            return;
        }

        index--;

        System.out.println("Mengubah data teman ke-" + (index + 1));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Nama Teman: ");
        friendBook[index][0] = inputScanner.nextLine();

        System.out.print("Alamat: ");
        friendBook[index][1] = inputScanner.nextLine();

        System.out.print("No Telepon: ");
        friendBook[index][2] = inputScanner.nextLine();

        System.out.println("Data teman berhasil diupdate.");
    }

    public void destroyData() {
        if (activeRows == 0) {
            System.out.println("Buku teman masih kosong.");
            return;
        }

        viewData();

        System.out.print("Masukkan nomor teman yang ingin dihapus: ");
        int index = inputScanner.nextInt();
        inputScanner.nextLine();

        if (index < 1 || index > activeRows) {
            System.out.println("Nomor teman tidak valid.");
            return;
        }

        index--;

        for (int i = index; i < activeRows - 1; i++) {
            friendBook[i] = friendBook[i + 1];
        }
        activeRows--;

        System.out.println("Data teman berhasil dihapus.");
    }

    public void viewData() {
        if (activeRows == 0) {
            System.out.println("Buku teman masih kosong.");
            return;
        }

        System.out.println("Daftar Teman");
        System.out.println("~~~~~~~~~~~~");
        for (int i = 0; i < activeRows; i++) {
            System.out.println("Data teman ke-" + (i + 1));
            System.out.println("Nama: " + friendBook[i][0]);
            System.out.println("Alamat: " + friendBook[i][1]);
            System.out.println("No Telepon: " + friendBook[i][2]);
            System.out.println("--------------------");
        }
    }
}
