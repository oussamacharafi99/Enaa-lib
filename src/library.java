import java.util.ArrayList;
import java.util.Scanner;

public class library {
    ArrayList<book> Book_list = new ArrayList<book>();
    ArrayList<student> student_list = new ArrayList<student>();

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        book newBook = new book();

        System.out.println("Enter the name of the book:");
        newBook.name_book = scanner.nextLine();

        System.out.println("Enter the description of the book:");
        newBook.des_book = scanner.nextLine();

        System.out.println("Enter the author of the book:");
        newBook.author = scanner.nextLine();

        System.out.println("Enter the Year of the book:");
        newBook.Years_book = scanner.nextInt();
        while (newBook.Years_book < 1520 || newBook.Years_book > 2024){
            System.out.println("Enter the correct Year of the book:");
            newBook.Years_book = scanner.nextInt();
        };

        Book_list.add(newBook);

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
        for(int i=0; i< Book_list.size(); i++){
            System.out.println("ID Book : " + i + 1);
            System.out.println("Book name :  " + Book_list.get(i).name_book);
            System.out.println("Book description :  " + Book_list.get(i).des_book);
            System.out.println("the author name is :" + Book_list.get(i).author);
            System.out.println("Book Years :  " + Book_list.get(i).Years_book);
            System.out.println("-----------------------");
        };

    }
    public void search(){
        System.out.println("i'm modifier !\n");
    }
    public void suppremir(){
        System.out.println("i'm suppremir !\n");
    }

}
