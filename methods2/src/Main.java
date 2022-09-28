public class Main {
    public static void main(String[] args) {
        String mesaj ="Bugün hava çok güzel.";
        String yeniMesaj= sehirVer(); //substring sonuç olarak verir.
        System.out.println(yeniMesaj);
        int sayi=topla(15,7);
        System.out.println(sayi);
        int toplam=topla2();
        System.out.println(toplam);

    }

        public static void ekle(){

        }
        public static void sil(){

        }
         public static void güncelle(){

        }

        public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
        }//Bu fonksiyon int değerinde değer döndürür.

        public static int topla2(int... sayilar){   //int... variable )
            int toplam=0;
            for (int sayi:sayilar){
                toplam+=sayi;
            }
            return toplam;
        }

        public static String sehirVer(){
        return "Ankara";

        }

    }
