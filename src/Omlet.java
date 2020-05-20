
public class Omlet extends Yemekler{
   
    public Omlet (String yemek_adı,String malzemeler, String pişirme_kabı, String pişme_süresi) {
        super(yemek_adı ,malzemeler, pişirme_kabı, pişme_süresi);
   
    }

    @Override
    public void yağEkle() {
      super.yağEkle(); 
        System.out.println("Yağ eklediğiniz tavaya, çırpılan yumurtayı tavaya dökünüz. ");
       
 
    
     }

    @Override
    public void bilgileriGöster() {
        super.bilgileriGöster(); 
    }

    @Override
    public void tuzEkle() {
         System.out.println("Yumurtayı bir kasede kırıp çırpınız");
        super.tuzEkle(); //To change body of generated methods, choose Tools | Templates.
    }
     
    @Override
    public void servisEt() {
        super.servisEt(); 
        
    }
    
  
       
    
}
