public class MysqlCustomerDal  implements ICustomerDal, IRepository {
    @Override
    public void add() {
        System.out.println("My sql eklendi");

    }

    //Dal, data access layer
    //MySql için add operasyonu ekledik.
    //implements; bir class birden fazla interface'yi implemente edebilir.
    //İnterface'ler referans tutucudur.
}
