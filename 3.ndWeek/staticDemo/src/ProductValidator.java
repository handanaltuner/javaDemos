public class ProductValidator {
    //Java'da ana class, static olamıyor ama başka bir class'ın içinde bölümlendirmek içinkullanılabilir
    //inner class

    static {
        System.out.println("Static Yapıcı blok çalıştı.");
    }


    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı.");
    }


    //ürünün kurallara uygun olup olmadığını anlamak için ProductValidator kullanırız.
    public static boolean isValid(Product product) {
        //static, bir kere oluşur ve onu bütün kullanıcılar kullanır.
        if (product.price>0 && !product.name.isEmpty()) {
            //! işareti değilse anlamındadır.
            //isEmpty boş anlamınaadır.
            //Yukarıdaki kodda ürün ismi boş değilse anlamındadır.
            return true;
        } else {
            return false;
        }
    }

    public void bisey(){


    }



}

