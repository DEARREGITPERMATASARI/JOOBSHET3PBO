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
 class Latihan4B extends Latihan4A {
     private int b;
     public void setLatihan4B (int nilai) {
         b = nilai;
     }
     
     public int getLatihan4B() {
         return b;
     }
    //melakukan override terhadap method tampilkanNilai ()
     //yang terdapat pada kelas Latihan4A
     
     public void tampilkanNilai () {
         super.tampilkanNilai(); //memanggil method dalam kelas Latihan4A
         System.out.println("Nilai b : " +getLatihan4B());
     }
}
