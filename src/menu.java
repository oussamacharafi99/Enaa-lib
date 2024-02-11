import java.util.Scanner;

public class menu {

    public void menu1(){
        library library1 = new library();

        int choice;
        do {

            System.out.println("**********---*-*-**-- menu --**-*-*---************");
            System.out.println("* 1 - Add a Book or a student !                  *");
            System.out.println("* 2 - Show a Books or a Students !               *");
            System.out.println("* 3 - Editing on book info or Student info !     *");
            System.out.println("* 4 - Remove a Book !                            *");
            System.out.println("* 5 - Search for the book !                      *");
            System.out.println("* 6 - reserve a Book or Remove The Reservation ! *");
            System.out.println("* 0 - Exit the application !                     *");
            System.out.println("**************************************************");
            System.out.println("*                                                *");
            System.out.println("* ----- > Enter your choice !                    *");
            System.out.println("*                                                *");
            System.out.println("**************************************************");

            choice = new Scanner(System.in).nextInt();
            int choir;
            switch (choice){
                case 1 :
                    System.out.println("1 - Add a Book !");
                    System.out.println("2 - Add a Student !");
                    System.out.println("Enter 0 to return");
                    choir = new Scanner(System.in).nextInt();
                    switch (choir){
                        case 1:
                            library1.addBook();
                        break;
                        case 2:
                            library1.addStudent();
                        break;
                        default:
                            menu1();
                            break;
                    }
                    break;
                case  2:
                    System.out.println("1 - show The Books !");
                    System.out.println("2 - show The Students !");
                    System.out.println("Enter 0 to return");
                    choir = new Scanner(System.in).nextInt();
                    switch (choir){
                        case 1:
                            library1.showBook();
                            break;
                        case 2:
                            library1.showStudent();
                            break;
                        default:
                            menu1();
                            break;
                    }
                    break;
                case 3 :
                    System.out.println("1 - Editing a Book !");
                    System.out.println("2 - Editing a Student !");
                    System.out.println("Enter 0 to return");
                    choir = new Scanner(System.in).nextInt();
                    switch (choir){
                        case 1:
                            if (library1.Book_list.isEmpty()) {
                                System.out.println("Enaa-li is vide Now Please Add the books from menu !");
                            } else {
                                Scanner scanne = new Scanner(System.in);
                                System.out.print("Enter the Name Of the Book !");
                                String title = scanne.nextLine();
                                boolean found = false;

                                for (Book book : library1.Book_list) {
                                    if (book.name_book.equalsIgnoreCase(title)) {
                                        book.ModifierBook();
                                        found = true;
                                    }
                                }
                                if (!found) {
                                    System.out.println("Book not found");
                                }
                            }

                            break;
                        case 2:
                            System.out.println("Modify Student !");
                            if (library1.student_list.isEmpty()) {
                                System.out.println("Enaa-li is vide Now Please Add the books from menu !");
                            }
                            else {
                                Scanner scanne = new Scanner(System.in);
                                System.out.print("Enter Id Card of Student !");
                                String Id_card = scanne.nextLine();
                                boolean found = false;

                                for (Student student : library1.student_list) {
                                    if (student.num_card.equalsIgnoreCase(Id_card)) {
                                        student.modifieStudent();
                                        found = true;
                                    }
                                }
                                if (!found) {
                                    System.out.println("Book not found");
                                }
                            }
                            break;
                        default:
                            menu1();
                            break;
                    }
                    break;
                case 4 :
                    library1.remoove();
                    break;
                case 5 :
                    library1.search();
                    break;
                case 6:
                    System.out.println("1 - reserve a Book !");
                    System.out.println("2 - Remove The Reservation !");
                    System.out.println("Enter 0 to return");
                    choir = new Scanner(System.in).nextInt();
                    switch (choir){
                        case 1:
                            library1.reserve();
                            break;
                        case 2:
                            library1.cancelReservation();
                            break;
                        default:
                            menu1();
                            break;
                    }
                    break;
                case 0 :
                    System.out.println("The program has been closed");
                    break;
                default:
                    System.out.println("Please Enter number from the top list !");
                    break;
            }
        }while (choice != 0);
    }
}
