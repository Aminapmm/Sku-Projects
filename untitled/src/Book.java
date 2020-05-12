import jdk.jshell.Snippet;

public class Book {
    //TODO : Making first&second VAR final
    private final String Bookname;
    private final String Publisher;
    private  Integer  Bookprice;//it should be nececcary
    //TODO: Defining a Publish date with Date Class
    private int Page_Number;//Optional

    Status Book_Status;


    public void setBookprice(Integer bookprice) { Bookprice = bookprice; }

    public String getBookname(){return Bookname;}
    public String getPublisher(){return Publisher;}

    public void setPage_Number(int page_Number){Page_Number=page_Number;}

    public int getPage_Number(){return Page_Number;}

    public Status getBook_Status(){return Book_Status;}

    enum  Status{LENDING,READY,BINDING;}

    public void setBook_Status(String status){Book_Status = Status.valueOf(status.toUpperCase());}
    public Book(String Bookname,String Publisher){
        this.Bookprice=0;
        this.Bookname = Bookname;
        this.Publisher=Publisher;
    }

    public Book(String Bookname,String Publisher,Integer Bookprice){
        this.Bookname=Bookname;
        this.Publisher= Publisher;
        this.Bookprice = Bookprice;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Golestan","Hafez Shirazi",48000);
        b1.setBook_Status("READY");
        System.out.printf("%s - %s - %s ",b1.getBookname(),b1.getPublisher(),b1.getBook_Status());
    }


}
