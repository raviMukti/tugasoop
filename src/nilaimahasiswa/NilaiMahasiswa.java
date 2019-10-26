//Mahasiswa(NPM, Nama, Nilai)
//Nilai
package nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author ravimukti
 */
public class NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inisialisasi
        Mahasiswa mhs = new Mahasiswa();
        String npmMahasiswa, namaMahasiswa;
        String keterangan = null;
        int jumlahMahasiswa = 1;
        int jumlahPenilaian = 4;
        double nk = 0, tugas = 0, uts = 0, uas = 0;
        double nilai[][];
        double nilaiAkhir = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.println("KALKULATOR KELULUSAN");
        System.out.println("--------------------");

        //Masukan NPM Mahasiswa
        System.out.println("Monggo masukan NPM Mu ndan..");
        npmMahasiswa = input.next();
        mhs.setNpm(npmMahasiswa);

        //Masukan Nama Mahasiswa
        System.out.println("Lah namanya juga ya ndan..");
        mhs.setNama(input.next().concat(input.nextLine()));

        //Inisialisasi Array
        nilai = new double[jumlahMahasiswa][jumlahPenilaian];

        //Input Nilai
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahPenilaian; j++) {
                System.out.println("Penilaian ke " + (j + 1) + ":");
                nilai[i][j] = input.nextInt();

                //Nilai Kehadiran
                nk = (15 * nilai[i][0]) / 100;
                //Nilai Tugas
                tugas = (35 * nilai[i][1]) / 100;
                //Nilai UTS
                uts = (25 * nilai[i][2]) / 100;
                //Nilai UAS
                uas = (25 * nilai[i][3]) / 100;

                //Jumlahkan Nilai Akhir
                nilaiAkhir = nk + tugas + uts + uas;
                mhs.setNilai(nilaiAkhir);

                if (nilaiAkhir < 50) {
                    mhs.setGrade("E");
                    keterangan = "TIDAK LULUS";
                }
                if (nilaiAkhir <= 50 && nilaiAkhir < 60) {
                    mhs.setGrade("D");
                    keterangan = "LULUS PERBAIKAN";
                }
                if (nilaiAkhir <= 60 && nilaiAkhir < 75) {
                    mhs.setGrade("C");
                    keterangan = "LULUS";
                }
                if (nilaiAkhir <= 75 && nilaiAkhir < 85) {
                    mhs.setGrade("B");
                    keterangan = "LULUS";
                }
                if (nilaiAkhir <= 85 && nilaiAkhir < 100) {
                    mhs.setGrade("A");
                    keterangan = "LULUS";
                }
            }
            System.out.println("--------------------");
            System.out.println("KELULUSAN MU NIH");
            System.out.println("--------------------");

            System.out.println("NPM\t\tNama\t\tN.Kehadiran\t\tN.Tugas\t\tN.UTS\t\tN.UAS\t\tN.Akhir\t\tGrade\t\tKet");
            System.out.print(mhs.getNpm() + "\t" + mhs.getNama() + "\t\t" + nk + "\t\t\t" + tugas + "\t\t" + uts + "\t\t" + uas
                    + "\t\t" + nilaiAkhir + "\t\t" + mhs.getGrade() + "\t\t" + keterangan);
            System.out.println("\n\n");
        }

    }

}
