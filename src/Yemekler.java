
public class Yemekler {
  
    private String yemek_adı;
    private String malzemeler;
    private String pişirme_kabı;
    private String pişme_süresi;

   public Yemekler(String yemek_adı,String malzemeler, String pişirme_kabı, String pişme_süresi) {
       this.yemek_adı = yemek_adı;
       this.malzemeler = malzemeler;
       this.pişirme_kabı = pişirme_kabı;
       this.pişme_süresi =pişme_süresi;
    }
   
   
   public void bilgileriGöster(){
    System.out.println("Yemeğin adı: " +yemek_adı);
    System.out.println("Pişirme süresi: " +pişme_süresi);
    System.out.println("Malzemeler: " +malzemeler);
    System.out.println("Pişirme kabı: "+pişirme_kabı);
}
   
   public void servisEt(){
        
       System.out.println("Yemeği servis ediniz.");
    }
   public void yağEkle(){
      
       System.out.println(pişirme_kabı+ " yağ ekleyiniz");
    }
   public void tuzEkle(){
       System.out.println("Tuz ekleyiniz");
   }
   
   
     public void malzemeleriEkle(){
       
       
       System.out.println(pişirme_kabı + " ye "  +malzemeler+ " ekleyiniz");
       
   } 

    public void yumuşamasınıBekle() {
        System.out.println("Malzemelerin yumuşamasını bekleyiniz.");
    }
    
     public void blenderdenGeçir() {
        System.out.println("Malzemeleri blenderden geçiriniz.");
        
    }
    
    public void yağınıHazırla(){
        System.out.println("Tereyağını bir tavada kızdırın. Üzerine 1 tatlı kaşığı toz kırmızı biberi ekleyin ve yağı kızdırdıktan sonra kasedeki çorbanın üzerine dökünüz.");
    }
    
    public void patatesleriSoy(){
        System.out.println("Patatesleri soyunuz.Soyduğunuz patatesleri dilimleyiniz ve yıkayınız");
    }
    
    public void yağaEkle(){
        System.out.println("Kızgın yağa soyduğunuz patatesleri ekleyiniz.");
    }
    
    
    
    
    
    
    
      }
      
         
         
         
    

