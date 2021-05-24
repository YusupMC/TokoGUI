/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toko;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class InputBarang {
    ArrayList<Barang> listbarang;
    
    public InputBarang(){
        listbarang = new ArrayList();
    }
    
    public void insertData(String KodeBarang, String NamaBarang, String Harga, String JumlahBeli){
        Barang brg = new Barang(KodeBarang, NamaBarang, Harga, JumlahBeli);
        listbarang.add(brg);
    }
    
    public ArrayList<Barang>getALL(){
        return listbarang;
    }
  
}
