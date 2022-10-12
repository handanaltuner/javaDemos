public class CustomerManager {
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal) {this.customerDal=customerDal;}
    public void add(){
        //iş kodları
        customerDal.add();
    }


    //public void Add(){System.out.println("Müşteri eklendi");}
   // public void Remove(){System.out.println("Müşteri silindi");}
    //public void Update(){System.out.println("Müşteri güncellendi");}
}