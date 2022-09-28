public class Main {
    public static void main(String[] args) {
        sayıBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();

    }

    //camelCase
    public  static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = €;
        boolean varMi = false;

        for (int sayi : sayilar){
            if (sayi==aranacak){
                varMi=true;
                break;
            }

        }

        if (varMi) {
            System.out.println("Sayı mevcuttur" + aranacak);
        }else {
            System.out.println("Sayı mevcut değildir" + aranacak);

        }

        }
    public  static  void mesajVer(){


    }

    }



}