/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Nita
 */
public class Guru {
    public String nama;
    public String mapel;
    public String jeniskelamin;   
}

class Jenis extends Guru {
    public void tampil(){
        System.out.println(" Nama Guru SMK Telkom Malang");
}
}

class Guru1 extends Guru{
    public Guru1 (String nama,String mapel, String jeniskelamin) {
        this.nama = nama;
        this.mapel = mapel;
        this.jeniskelamin = jeniskelamin;
    }
    public void tampil() {
        System.out.println("\n=======================");
        System.out.println("Nama : " +nama);
        System.out.println("Mapel : " +mapel);
        System.out.println("Jenis Kelamin :" +jeniskelamin);
    }
}

class Guru2 extends Guru {
    public Guru2 (String nama,String mapel, String jeniskelamin) {
        this.nama = nama;
        this.mapel = mapel;
        this.jeniskelamin = jeniskelamin;
    }
     public void tampil() {
        System.out.println("\n=======================");
        System.out.println("Nama : " +nama);
        System.out.println("Mapel : " +mapel);
        System.out.println("Jenis Kelamin :" +jeniskelamin);
}
}
class Guru3 extends Guru {
    public Guru3 (String nama,String mapel, String jeniskelamin) {
        this.nama = nama;
        this.mapel = mapel;
        this.jeniskelamin = jeniskelamin;
    }
     public void tampil() {
        System.out.println("\n=======================");
        System.out.println("Nama : " +nama);
        System.out.println("Mapel : " +mapel);
        System.out.println("Jenis Kelamin :" +jeniskelamin);
        
    }
}

class Guruku {
    public static void main (String [] args) {
        Guru gr = new Guru();
        Jenis jn= new Jenis();
        Guru1 Pn = new Guru1 ("Pak Nasikin","Agama","Laki-laki");
        Guru2 Ba = new Guru2 ("Bu Ana","Sejarah Indonesia","Perempuan");
        Guru3 Pa = new Guru3 ("Pak Arifin","Produktif","Laki-Laki");
       
        jn.tampil();
        Pn.tampil();
        Ba.tampil();
        Pa.tampil();
      
    }
}