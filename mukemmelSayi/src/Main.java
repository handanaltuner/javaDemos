public class Main {
    public static void main(String[] args) {
        //6 mükemmel sayıdır.1,2,3 sayılarını topladığımızda 6 eder ve 1,2,3 sayılarına bölünür.
        //28 mükemmel sayıdır. 1,2,4,7,14

        int number = 6;
        int total = 0; //toplam tutacak

        for (int i = 1;i< number;i++) {
            if (number % i == 0) {
            total = total + i;
        }
    }
        if(total == number) {
            System.out.println("Mükemmel sayıdır!");
        }else {
            System.out.println("Mükemmel sayı değildir");
        }
     }
    }
