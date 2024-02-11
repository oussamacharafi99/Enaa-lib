import java.util.Scanner;


public class Book {
    public int Id_book;
    public String name_book;
    public String des_book;
    public String author;
    public int Years_book;


    public Student student;

    public void ModifierBook(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The new Name of the Book ! :");
        this.name_book = scanner.nextLine();

        System.out.print("Enter The new Description of the Book ! :");
        this.des_book = scanner.nextLine();

        System.out.print("Enter The new Name Of The  author ! :");
        this.author = scanner.nextLine();

        System.out.print("Enter The new date of the Book ! :  ");
        this.Years_book = scanner.nextInt();

        System.out.println("modifier avec succes");
    }
}

