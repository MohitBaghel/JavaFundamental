public class LibrabySystem {
    public static void main(String s[]){

        Book b1 = new Book();
        b1.add(1, "JAVA Fundamental", 970, 0);
        b1.issue();
        b1.issue();

    }
}



class Book{
    int bookId;
    String bookName;
    int price;
    int status;
     // 0 or 1 // false true


    // add , issue, submit

    void add(int bookId, String bookName,int price, int status){
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.status = status;

    }

    void issue(){
            if( status  == 0){ // book is available
                    System.out.println(bookName + "is issued");
                    status = 1; // book is not available
            } else {
                System.out.println(bookName + "is not Avialable");
            }
    }

    void submit(){
        if( status == 1){
            System.out.println(bookName + "is submitted");
            status = 0;
        } else{
             System.out.println(bookName + " is already submitted");
        }
    }

}