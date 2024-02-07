import java.util.Scanner;

public class menu {

    public void menu1(){
        library library1 = new library();
        Book Book1 = new Book();
        int choice;
        do {

            System.out.println("----- menu -----\n");
            System.out.println("1 - ajouter un liver !\n");
            System.out.println("2 - ajouter un student !\n");
            System.out.println("3 - afficher les livres !\n");
            System.out.println("4 - Modifier un livre\n");
            System.out.println("5 - suppremir un livre\n");
            System.out.println("entrer ton choix !");

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
                default:
                    break;
            }
        }while (choice != 7);
    }
}
