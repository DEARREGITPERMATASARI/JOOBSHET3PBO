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
public class Latihan1 {
    private int a= 10;
    protected void terprotek (){
        
        System.out.println("Method ini hanya untuk anaknya");
    }
    
    public void info () {
        System.out.println("a = " +a);
        System.out.println("Dipanggil pada = " +this.getClass().getName());
    }
}
class Kedua extends Latihan1 {
    private int b = 8;
    protected void BacaSuper() {
        
        System.out.println("Nilai b : " +b);
        terprotek();
        info();       
    }
}

class TestPertamaKedua {
    public static void main (String [] args) {
        Kedua D2 = new Kedua();
        D2.BacaSuper();
        D2.info();
        
        Latihan1 S1 = new Latihan1();
        S1.terprotek();
        S1.info();
        
    }
}
