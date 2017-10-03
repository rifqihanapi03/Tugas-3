/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author Mochamad Fajar Ismatulloh
 */
class Mahasiswa {

    String nama, nim, keterangan;
    double quiz, uts, uas, nilaiAkhir;
    char index;

    public double getNilaiAkhir(double quiz, double uts, double uas) {
        nilaiAkhir = 0.2 * quiz + 0.3 * uts + 0.5 * uas;
        return nilaiAkhir;
    }

    public void getIndexKeterangan(double nilaiAkhir) {
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            index = 'A';
            keterangan = "Sangat Baik";
        } else if (nilaiAkhir > 68 && nilaiAkhir <= 80) {
            index = 'B';
            keterangan = "Baik";
        } else if (nilaiAkhir > 56 && nilaiAkhir <= 68) {
            index = 'C';
            keterangan = "Cukup";
        } else if (nilaiAkhir > 45 && nilaiAkhir <= 56) {
            index = 'D';
            keterangan = "Kurang";
        } else if (nilaiAkhir <= 45) {
            index = 'E';
            keterangan = "Sangat Kurang";
        }
    }
}

public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Rizki Adam kurniawan";
        mhs1.nim = "7.51.15.036";
        mhs1.quiz = 60;
        mhs1.uts = 80;
        mhs1.uas = 75;
        mhs1.getNilaiAkhir(mhs1.quiz, mhs1.uts, mhs1.uas);
        mhs1.getIndexKeterangan(mhs1.nilaiAkhir);

        //output
        for (int i = 1; i <= 4; i++) {
            System.out.println("Nama ke " + i + "\t\t = " + mhs1.nama);
        }
        for (int j = 8; j >= 1; j--) {
            System.out.println("NIM ke " + j + "\t\t = " + mhs1.nim + "." + j);
        }

        System.out.println("\nQuiz \t\t= " + mhs1.quiz);
        System.out.println("UTS \t\t= " + mhs1.uts);
        System.out.println("UAS \t\t= " + mhs1.uas);

        System.out.println("\nNilai Akhir \t= " + mhs1.getNilaiAkhir(mhs1.quiz, mhs1.uts, mhs1.uas));

        System.out.println("\nIndex = "+mhs1.index);
        System.out.println("Keterangan = "+mhs1.keterangan);
    }
}
