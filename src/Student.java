import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public String num_card;
    public String full_name;
    public String adr_name;

    ArrayList<Book> books = new ArrayList<>();


    public void modifieStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The new Id Card of the Student ! :");
        this.num_card = scanner.nextLine();

        System.out.print("Enter The new Full Name of the  student ! :");
        this.full_name = scanner.nextLine();

        System.out.print("Enter The new Addr Of The  author ! :");
        this.adr_name = scanner.nextLine();

    }
}
