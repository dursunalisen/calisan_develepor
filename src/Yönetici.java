/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duysun
 */
public class Yönetici extends Calisan{
    
    private int sorumlu_kisi_sayisi;

    public Yönetici(String ad, String soyad, int id , int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
    this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgilerigöster() {
        super.bilgilerigöster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("yöeneticinin sorumlu olduğu kişi sayisi " + sorumlu_kisi_sayisi);
    
    }
    public void zamYap(int zamMiktari){
        System.out.println(getAd() +"çalışanlara" + zamMiktari + "kadar zam yapılıyor...");
    }
    
    
}
