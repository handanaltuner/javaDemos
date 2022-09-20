public class Main {
    public static void main(String[] args)
    {
        //uygulamalardaki hatalara/açıklara bug denir.
        int number=-2;
        int remainder = number % 2; //kalan
        System.out.println(remainder);
        boolean inPrime = true;

        if(number==1) {
            System.out.println("Sayı asal değildir");
            return;
        }


        if (number<2){
            System.out.println("Geçersiz sayı");
        }

        for (int i=2; i<number; i++) {

            if (number % i == 0) ;{
            inPrime = false;

        }

        }
        if(inPrime) {
            System.out.println("Sayı asaldır");
        }else {
            System.out.println("Sayı asal değildir");

        }

    }
}