public class Library {
    String name ;
    int year ;
    Book[] book;

    Library (String name ,int year,Book[] book){
        this.name = name ;
        this.year = year;
        this.book  = book;
    }

    void displayInfo(){
        System.out.println(this.name +"was established in the year " +this.year);
        System.out.println("the books available in the  library are :");
        for (Book book : book){
            System.out.println(book.InfoOfBook());
        }
    }

}
