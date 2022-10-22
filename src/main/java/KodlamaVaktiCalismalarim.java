public class KodlamaVaktiCalismalarim {
    public static void main(String[] args) {
        //char[] str= {'K','O','D','L','A','M','A'} ;
        // String metin= new String(str);
        // System.out.println(metin);
        String metin = "KODLAMA HELLO";
        String metin2 = "VAKTI";

        System.out.println(metin.length());//7 Metinin boyutunu verir
        System.out.println(metin + metin2);//KODLAMAVAKTI =iki metni birlestirdi
        System.out.println(metin.concat(metin2));//KODLAMAVAKTI =iki metni birlestirdi
        System.out.println(metin.indexOf('L'));//indexOf(karakter siralamasini verir) //3
        System.out.println(metin.charAt(1));//charAt de siralamasi verilen karakteri gosterir.//O
        System.out.println(metin.contains("LAMA"));//true =verilen deger string icinde geciyor mu gecmiyor mu onu kontrol eder
        System.out.println(metin.endsWith("MA"));// true= belirtilen characterler() (parantez icine alinan)ile bitiyorsa true degerini dondurur.
        System.out.println(metin.replace("HELLO", "VAKTI"));//VAKTI String degistirmek icin kullanilir.
        //Replace'in anlami HeLlo'u VAKti ile degistir

    }
}