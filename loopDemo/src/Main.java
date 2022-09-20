public class Main {
    public static void main(String[] args) {

        //For
        for (int i=2;i<10;i+=2){ //2den başlatıp 2 arttırır, 10dan küçük sayılar
            System.out.println(i);
        }
        System.out.println("Döngü Bitti");


        //While
        int i=1;
        while (i<10) {
            System.out.println(i);
            i++;
        }
        System.out.println("Döngü Bitti");



    //Do-While
        //Not: Şart uymasa bile while döngüsü en az 1 kere çalışacaktır.
        //Log atmak için kullanılabilir.
    int j=1;
    do{
        System.out.println("Loglandı");
        System.out.println(j);
        j+=2;
        }while(j<10);
        System.out.println("Do-While Döngüsü Bitti");



    }
}