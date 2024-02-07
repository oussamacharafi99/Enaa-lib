import java.util.ArrayList;
import java.util.Scanner;

public class library {
    ArrayList<Book> Book_list = new ArrayList<>();
    ArrayList<student> student_list = new ArrayList<>();
    int i = 0;
    public void addBook() {
        Scanner scanner = new Scanner(System.in);
         Book newBook = new Book();
        newBook.Id_book = i;

        System.out.println("Enter the name of the book:");
        newBook.name_book = scanner.nextLine();
        for (Book book : Book_list) {
            while (newBook.name_book.equals(book.name_book)) {
                System.out.println("Enter the name of the book:");
                newBook.name_book = scanner.nextLine();
            }
        }
        System.out.println("Enter the description of the book:");
        newBook.des_book = scanner.nextLine();

        System.out.println("Enter the author of the book:");
        newBook.author = scanner.nextLine();

        System.out.println("Enter the Year of the book:");
        newBook.Years_book = scanner.nextInt();

        while (newBook.Years_book < 1520 || newBook.Years_book > 2024){
            System.out.println("Enter the correct Year of the book:");
            newBook.Years_book = scanner.nextInt();
        }
        Book_list.add(newBook);
        i++;
        System.out.println("Book added successfully!");
    }
    public void addStudent(){

        Scanner scanner = new Scanner(System.in);
        student newStudent = new student();

        System.out.println("Enter the ID of the student :");
        newStudent.num_card = scanner.nextLine();

        System.out.println("Enter the Full Name of the Student :");
        newStudent.full_name = scanner.nextLine();

        System.out.println("Enter the adresse of the book :");
        newStudent.adr_name = scanner.nextLine();


        student_list.add(newStudent);

        System.out.println("Student added successfully!");
    }
    public void afficher(){
//        System.out.println("i'm afficher !\n");
        for (Book book : Book_list) {
            System.out.print("ID Book : ");
            System.out.println(book.Id_book + 1);
            System.out.println("Book name :  " + book.name_book);
            System.out.println("Book description :  " + book.des_book);
            System.out.println("the author name is :" + book.author);
            System.out.println("Book Years :  " + book.Years_book);
            System.out.println("-----------------------");
        }

    }
    public void search(){
        System.out.println("i'm modifier !\n");
    }
    public void suppremir(){
//        System.out.println("i'm suppremir !\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Id book !");
        int sear = scanner.nextInt();

        for ( int i = 0; i < Book_list.size(); i++) {
            if (sear - 1 == Book_list.get(i).Id_book){
                Book_list.remove(i);
                System.out.println("this Book is removed !");
            }
        }

    }

}
