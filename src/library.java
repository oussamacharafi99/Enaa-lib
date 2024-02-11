import java.util.ArrayList;
import java.util.Scanner;

public class library {
    ArrayList<Book> Book_list = new ArrayList<>();
    ArrayList<Student> student_list = new ArrayList<>();
    int i = 0;
    Scanner scanner = new Scanner(System.in);
    public void addBook() {
        Book newBook = new Book();
<<<<<<< HEAD
        Scanner scanner = new Scanner(System.in);
=======
>>>>>>> 7df99619651cf44c1939200f6dde8b3f4d416558
        newBook.Id_book = i;

        System.out.println("Enter the name of the book:");
        newBook.name_book = scanner.nextLine();
<<<<<<< HEAD

=======
>>>>>>> 7df99619651cf44c1939200f6dde8b3f4d416558
        for (Book book : Book_list) {
            while (newBook.name_book.equals(book.name_book)) {
                System.out.println("Enter the name of the book:");
                newBook.name_book = scanner.nextLine();
<<<<<<< HEAD

            }
            break;
=======
            }
>>>>>>> 7df99619651cf44c1939200f6dde8b3f4d416558
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
        Student newStudent = new Student();

        System.out.println("Enter the ID of the student :");
        newStudent.num_card = scanner.nextLine();

        System.out.println("Enter the Full Name of the Student :");
        newStudent.full_name = scanner.nextLine();

        System.out.println("Enter the adresse of the book :");
        newStudent.adr_name = scanner.nextLine();


        student_list.add(newStudent);

        System.out.println("Student added successfully!");
    }
    public void showBook(){
        for (Book book : Book_list) {
            System.out.print("ID Book : ");
            System.out.println(book.Id_book + 1);
            System.out.println("Book name :  " + book.name_book );
            System.out.println("Book description :  " + book.des_book);
            System.out.println("the author name is :" + book.author);
            System.out.println("Book Years :  " + book.Years_book);
            System.out.println("-----------------------");
        }

    }
<<<<<<< HEAD
    public void reserve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the Book: ");
        String nameBook = scanner.nextLine();

        boolean foundBook = false;

        for (Book book : Book_list) {

            if (book.name_book.equalsIgnoreCase(nameBook)) {

                foundBook = true;

                if (book.student != null) {
                    System.out.println("This book is already reserved by a student.");
                } else {
                    System.out.println("Enter the ID of the student: ");
                    String idStudent = scanner.nextLine();
                    boolean foundStudent = false;
                    for (Student student : student_list) {
                        if (student.num_card.equalsIgnoreCase(idStudent)) {
                            foundStudent = true;
                            book.student = student;
                            student.books.add(book);
                            System.out.println("Reservation successful.");
                            break;
                        }
                    }
                    if (!foundStudent) {
                        System.out.println("Student with ID " + idStudent + " not found.");
                    }
                }
                break;
            }
        }
        if (!foundBook) {
            System.out.println("Book with name " + nameBook + " not found.");
        }
    }
    public void cancelReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the Book to cancel reservation: ");
        String nameBook = scanner.nextLine();

        boolean foundBook = false;

        for (Book book : Book_list) {
            if (book.name_book.equalsIgnoreCase(nameBook)) {
                foundBook = true;

                if (book.student == null) {
                    System.out.println("This book is not reserved by any student.");
                } else {
                    Student student = book.student;
                    student.books.remove(book);
                    book.student = null;
                    System.out.println("Reservation canceled successfully.");
                }
                break;
            }
        }
        if (!foundBook) {
            System.out.println("Book with name " + nameBook + " not found.");
        }
    }

    public void showStudent(){
        for (Student student : student_list) {
            System.out.println("-----------------------");
            System.out.print("ID Student : " + student.num_card + "\n");
            System.out.println("Student Full NAme name :  " + student.full_name);
            System.out.println("Student Address :  " + student.adr_name);
=======
    public void reserve(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name Book ! :");
        String nameBook = scanner.nextLine();

         for (Book book : Book_list){

             if (book.name_book.equalsIgnoreCase(nameBook)){

                     System.out.println("Enter the Id Of student !  : ");
                     String idStudent = scanner.nextLine();

                     for (Student student : student_list){
                         if (student.num_card.equalsIgnoreCase(idStudent)){
                                book.student = student;
                                student.books.add(book);

                               System.out.println(" wa hasan --------");
                         }
                     }
                 break;
             }

         }

    }
    public void showStudent(){
        for (Student student : student_list) {
            System.out.println("-----------------------");
            System.out.print("ID Book : " + student.num_card + "\n");
            System.out.println("Book name :  " + student.full_name);
            System.out.println("Book description :  " + student.adr_name);
>>>>>>> 7df99619651cf44c1939200f6dde8b3f4d416558

            if (student.books.isEmpty()){
                System.out.println("He did not to reserve any book !");
            }
            else {
                student.books.forEach( book -> System.out.println("The book name " + book.name_book));
            }
            System.out.println("-----------------------");
        }
    }
    public void remoove(){
//        System.out.println("i'm suppremir  !\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Id book !");
        int sear = scanner.nextInt();
        boolean found = false;

        for ( int i = 0; i < Book_list.size(); i++) {
            if (sear - 1 == Book_list.get(i).Id_book){
                found = true;
                Book_list.remove(i);
                System.out.println("this Book is removed !");
            }
        }
        if (!found){
            System.out.println("The Book Id : " + sear + " unavailable !");
        }

    }
    public void search() {
       if (Book_list.isEmpty()){
           System.out.println("Enaa-lib is vide !");
       }

       else {

           System.out.print("Enter Name Book For searching !: ");
           String NAME = scanner.nextLine();
           for (Book book : Book_list) {
               if (book.name_book.equalsIgnoreCase(NAME)) {
                   System.out.print("ID Book : ");
                   System.out.println(book.Id_book + 1);
                   System.out.println("Book name :  " + book.name_book);
                   System.out.println("Book description :  " + book.des_book);
                   System.out.println("the author name is :" + book.author);
                   System.out.println("Book Years :  " + book.Years_book);
                   System.out.println("-----------------------");
               }
           }

       }
    }


}
