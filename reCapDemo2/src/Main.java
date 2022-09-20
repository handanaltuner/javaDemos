import java.util.Locale;

public class Main {
    public static void main(String[] args)
    {

        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı: " +mesaj.length());
        System.out.println("5. eleman : "+mesaj.charAt(4)); //charAt karakter
        System.out.println(mesaj.concat("Yaşasın!")); //concat birleştirir.
        System.out.println(mesaj.startsWith("B")); //B ile başlıyorsa True döndürür
        System.out.println(mesaj.endsWith(".")); //Nokta ile bitiyorsa True döndürür.
        char[] karakterler = new char[5];
        mesaj.getChars (0, 4, karakterler,  0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av")); //ilk bulduğu av yı bulur.
        System.out.println(mesaj.lastIndexOf('a')); //sağdan başlayan ilk a yı bulur.*/


        String yeniMesaj=mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));//2den 5.karakktere kadar gösterir

        for (String kelime : mesaj.split("")) {
            System.out.println(kelime); //bütün kelimeleri yazdırır.

        }

        System.out.println(mesaj.toLowerCase());//küçük harfe çevir, aramalarda sık kullanıılır.
        System.out.println(mesaj.toUpperCase());//büyük harfe çevir
        System.out.println(mesaj.trim());//boşluk silme/baştaki ve sondaki boşlukları silme

    }
}
