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
            System.out.println("6 - Editing on Student information !");
            System.out.println("7 - Remove a Book !");
            System.out.println("8 - Search for the book !");
            System.out.println("9 - reserve a Book  !");
            System.out.println("0 - Exit the application ! ");
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
                case 6 :
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
                case 7 :
                    library1.remoove();
                    break;
                case 8 :
                    library1.search();
                    break;
                case 9:
                    library1.reserve();
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
