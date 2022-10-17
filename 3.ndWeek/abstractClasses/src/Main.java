public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameover();


        //abstract sınıflar new'lenemez

        GameCalculator gameCalculators=new WomanGameCalculator();


    }
}