/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toko;

/**
 *
 * @author LENOVO
 */
public class Barang {
    private String NamaBarang, KodeBarang,Harga, JumlahBeli;
    
    public Barang (String NamaBarang, String KodeBarang, String Harga, String JumlahBeli){
        this.KodeBarang = KodeBarang;
        this.NamaBarang = NamaBarang;
        this.Harga = Harga;
        this.JumlahBeli = JumlahBeli;
    }
    
    public String getKodeBarang(){
        return KodeBarang;
    }
    
    public String getNamaBarang(){
        return NamaBarang;
    }
    
    public String getHarga(){
        return Harga;
    }
    
    public String getJumlahBarang(){
        return JumlahBeli;
    }
    
}
