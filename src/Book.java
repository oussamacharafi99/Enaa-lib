import java.util.Scanner;

public class Book {
    public int Id_book;
    public String name_book;
    public String des_book;
    public String author;
    public int Years_book;

    public void modifier(){
        library lib = new library();
        Scanner scanner = new Scanner(System.in);
        System.out.println("dkhel");
        String sear = scanner.nextLine();
        for (int i = 0; i < lib.Book_list.size(); i++){
            if (sear.equals(lib.Book_list.get(i).name_book)){
                ;
            };
        };

    }

}
