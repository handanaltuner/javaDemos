public class DatabaseLogger extends BaseLogger {
    //BaseLogger'daki message'yi override ederek database'e ekledik
    //Database'ye eklendi diye yazdık
    public void log(String message){
     System.out.println("Logged to database : "+message);
    }
}
