import java.util.Scanner;

public class Book {
    public int Id_book;
    public String name_book;
    public String des_book;
    public String author;
    public int Years_book;

    public void Modifier(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer new titre: ");
        this.name_book = scanner.nextLine();
        System.out.print("Entrer new auteur: ");
        this.author = scanner.nextLine();
        System.out.print("Entrer new date de publication: ");
        this.Years_book = scanner.nextInt();
        System.out.println("modifier avec succes");
    }
}

