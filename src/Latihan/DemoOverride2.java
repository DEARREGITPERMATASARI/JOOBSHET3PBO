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
 class DemoOverride2 {
     public static void main (String [] args) {
         Latihan4B obj = new Latihan4B();
         obj.setLatihan4A(50);
         obj.setLatihan4B(150);
         
         //akan memanggil method yang terdapat pada kelas B
         obj.tampilkanNilai();
     }
}
