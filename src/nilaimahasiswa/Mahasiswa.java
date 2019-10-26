/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;

/**
 *
 * @author ravimukti
 */
public class Mahasiswa {
    private String npm;
    private String nama;
    private String grade;
    private double nilai;

    public Mahasiswa(String npm, String nama, String grade, double nilai) {
        super();
        this.npm = npm;
        this.nama = nama;
        this.grade = grade;
        this.nilai = nilai;
    }

    public Mahasiswa() {
    }
    
    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
    
    
   
}
