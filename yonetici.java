
public class yonetici  extends calisan {
    private int sorumlu_kisi; //ekstra özellik eklenebilir.
    public yonetici(String isim,int maas,String departman,int sorumlu_kisi){
      /*  this.isim=isim;
        this.maas=maas;
        this.departman=departman;  
        bu şekilde çalışmadı(özellikler private class dışında erişilemez.)*/
      super(isim, maas, departman); //miras aldığım classın constructerını kullandım.
        this.sorumlu_kisi=sorumlu_kisi;
       }
    public void ZamYap(int miktar){
        System.out.println("calisanlara "+miktar+" tl zam yapilacaktir.");
    }
    public void bilgilerigoster(){
         System.out.println("isim:"+getIsim());
        System.out.println("maası:"+getMaas());
        System.out.println("departmani:"+getDepartman());
        System.out.println("sorumlu oldugu kisi sayisi:"+sorumlu_kisi);
    }
    
}
