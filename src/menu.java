import java.util.Scanner;

public class menu {

    public void menu1(){
        library library1 = new library();

        int choice;
        do {

            System.out.println("----- menu -----");
            System.out.println("1 - Add a Book!");
            System.out.println("2 - Add a student !");
            System.out.println("3 - Show the Book !");
            System.out.println("4 - Show the student !");
            System.out.println("5 - Editing on book information !");
            System.out.println("6 - Remove a Book !");
            System.out.println("7 - Search for the book !");
            System.out.println("8 - Exit the application ! ");
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
                    library1.showBook();
                    break;
                case 4 :
                    library1.showStudent();
                    break;
                case 5 :
                    //Book1.modifier();
                    if (library1.Book_list.isEmpty()) {
                        System.out.println("la bibliotheque est vide");
                    } else {
                        Scanner scanne = new Scanner(System.in);
                        System.out.print("Entrer le titre de livre à modifier: ");
                        String title = scanne.nextLine();
                        boolean found = false;

                        for (Boo ok book : library1.Book_list) {
                            if (book.name_book.equalsIgnoreCase(title)) {
                                book.Modifier();
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("Book not found");
                        }
                    }
                    break;
                case 6 :
                    library1.remoove();
                    break;
                case 7 :
                    library1.search();
                    break;
                case 8 :
                    System.out.println("The program has been closed");
                    break;
                default:
                    System.out.println("Please Enter number from the top list !");
                    break;
            }
        }while (choice != 8);
    }
}
