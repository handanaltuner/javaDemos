public class CustomerManager {

    BaseDatabaseManager databaseManager;
    //Hangi veritabanı ismini verirsek o çalışacak
    //DatabaseManager'in içinde Oracle,SqlServer var.
    // Hangisini isterse onun getData'sını çalıştırır. Main class'ında görürüz.
    public void getCustomers(){
        databaseManager.getData();
    }
}
