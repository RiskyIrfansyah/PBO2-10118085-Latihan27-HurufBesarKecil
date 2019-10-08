/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author Risky Irfansyah
 * Nama     : Risky Irfansyah
 * Kelas    : PBO2
 * Nim      : 10118085
 * Deskripsi Program : Huruf Besar Kecil
 */
public class PBO210118085Latihan27HurufBesarKecil {
    public static String kalimat;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Kalimat : ");
        kalimat = scanner.next();
        
        System.out.println("======= Hasil Formatting =======");
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());
    }
}
