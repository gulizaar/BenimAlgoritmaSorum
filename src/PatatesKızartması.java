
public class PatatesKızartması extends Yemekler{
    
    public PatatesKızartması(String yemek_adı, String malzemeler, String pişirme_kabı, String pişme_süresi) {
        super(yemek_adı, malzemeler, pişirme_kabı, pişme_süresi);
    }
    @Override
    public void bilgileriGöster() {
        super.bilgileriGöster(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void yağEkle() {
        super.yağEkle();
        
    }

    @Override
    public void patatesleriSoy() {
        super.patatesleriSoy(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void yağaEkle() {
        super.yağaEkle(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void servisEt() {
        System.out.println("Kızaran patatesleri ocaktan alınız.");
        super.servisEt(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
