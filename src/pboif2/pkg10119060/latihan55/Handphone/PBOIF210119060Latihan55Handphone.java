/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan55.Handphone;

/**
 *
 @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program Handphone
 */
public class PBOIF210119060Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android objAndroid = new Android("Samsung", "Android", "Grand", 3000000);
        objAndroid.setKeyStore("23ibfd3840fo");
        
        BlackBerry objBlackBerry = new BlackBerry("BlackB", "RIM", "curve", 2000000);
        objBlackBerry.setPinBB("BHS249");
        
        WindowsPhone objWindowsPhone = new WindowsPhone("Nokia", "wind8", "Lumia", 1000000);
        objWindowsPhone.setWpKeyStore("UUUQIJWORJ");
        
        objAndroid.displayProduct();
        System.out.println("Android key Store : "+objAndroid.getKeyStore());
        System.out.println("");
        
        objBlackBerry.displayProduct();
        System.out.println("PIN : "+objBlackBerry.getPinBB());
        System.out.println("");
        
        objWindowsPhone.displayProduct();
        System.out.println("Wp key Store : "+objWindowsPhone.getWpKeyStore());
                
             
    }
    
}
