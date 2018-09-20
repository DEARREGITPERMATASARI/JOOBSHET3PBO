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
 class Latihan2 {
    private String nama;
    private int usia;
    
    //konstruktor
    public Latihan2 (String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }
    //Methode
        public void info () {
            System.out.println("Nama : " + this.nama);
            System.out.println("Usia : " +this.usia);
        }
    
    
}
