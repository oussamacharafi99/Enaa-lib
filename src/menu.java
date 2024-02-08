import java.util.Scanner;

public class menu {

    public void menu1(){
        library library1 = new library();
        Book Book1 = new Book();
        int choice;
        do {

            System.out.println("----- menu -----");
            System.out.println("1 - Add a Book!");
            System.out.println("2 - Add a student !");
            System.out.println("3 - Show the Books!");
            System.out.println("4 - Editing on book information !");
            System.out.println("5 - Remove a Book !");
            System.out.println("6 - Search for the book !");
            System.out.println("7 - Exit the application ! ");
            System.out.println("----- > Enter your choice !");

            choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1 :
                    library1.addBook();
                    break;
                case 2 :
                    library1.addStudent();
                    break;
                case 3 :
                    library1.afficher();
                    break;
                case 4 :
                    Book1.modifier();
                    break;
                case 5 :
                    library1.suppremir();
                    break;
                case 6 :
                    // pour la fonction rechercher;
                case 7 :
                    System.out.println("The program has been closed");
                default:
                    System.out.println("Please Enter number from the top list !");
                    break;
            }
        }while (choice != 7);
    }
}
