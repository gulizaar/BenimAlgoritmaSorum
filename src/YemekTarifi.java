
import java.util.Scanner;


public class YemekTarifi {
    public static void main (String []args){
        
         Scanner klavye = new Scanner (System.in);
        
        System.out.println("YEMEKLER");
        System.out.println("******************************");
         String yemekler = "1.Mercimek Çorbası \n"
                         +"2.Omlet \n"
                         + "3.Patates Kızartması \n"
                         +"Çıkmak istiyorsanız q ya basınız.";
         
        System.out.println(yemekler);
        System.out.println("*******************************");
        
        
        while(true){
           System.out.print("Tarifini görmek istediğiniz yemeği seçiniz: ");
           String seçim = klavye.nextLine();
            System.out.println("*********************************");
            
           if(seçim.equals("q")){
               System.out.println("Çıkılıyor");
               break;
            
           }
           else if(seçim.equals("1")){
               Yemekler yemek1= new MercimekÇorbası("Mercimek Çorbası","Kırmızı Mercimek,Havuç,Patates,Kuru Soğan","Tencere","45 dakika");
               System.out.println("Mercimek Çorbasının Tarifi");
               System.out.println("*******************************");
               yemek1.bilgileriGöster();
               System.out.println("*******************************");
               System.out.println("Yapılışı");
                System.out.println("*******************************");
               yemek1.yağEkle();
               yemek1.malzemeleriEkle();
               yemek1.tuzEkle();
               yemek1.yumuşamasınıBekle();
               yemek1.blenderdenGeçir();
               yemek1.yağınıHazırla();
               yemek1.servisEt();
               
           }
            else if(seçim.equals("2")){
               Yemekler yemek1= new Omlet("Sahanda Yumurta","Yumurta,yağ,tuz","Tava","5 dakika");
               System.out.println("Sahanda Yumurtanın Tarifi");
               System.out.println("*******************************");
               yemek1.bilgileriGöster();
               yemek1.yağEkle();
              
               yemek1.tuzEkle();
           
               yemek1.servisEt();
              
        }
           else if(seçim.equals("3")){
               Yemekler yemek1= new PatatesKızartması("Patates Kızartması","Patates,yağ,tuz","Tava","20 dakika");
               System.out.println("Patates Kızartmasının Tarifi");
               System.out.println("*******************************");
               yemek1.bilgileriGöster();
               yemek1.yağEkle();
               yemek1.patatesleriSoy();
               yemek1.tuzEkle();
               yemek1.yağaEkle();
               yemek1.servisEt();
               break;
        }
           else{
               
               System.out.println("Geçersiz işlem girdiniz.");
           }
    }
        
        
        
        
        
    }
    
}
