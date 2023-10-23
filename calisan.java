
import java.util.Scanner;


public class calisan {
    private String isim;
    private int maas;
    private String departman;
    private String yeni_departman;
      
    
    public calisan(String isim,int maas,String departman){
       this.isim=isim;
       this.maas=maas;
       this.departman=departman;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    
    public void calis(){
        System.out.println("calisan calisiyor...");
                
    }
    public void bilgilerigoster(){
        System.out.println("isim:"+isim);
        System.out.println("maası:"+maas);
        System.out.println("departmani:"+departman);
    }
    public void departmandegistir(String yeni_departman){
        System.out.println("departman degistirildi...");
        this.yeni_departman=departman;
        System.out.println("yeni departman:"+this.departman);
    }
    
    
    
}
