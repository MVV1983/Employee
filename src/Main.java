import java.util.Scanner;

public class Main {

    //Create Main menu
    public static void mainMenu() {
        System.out.println("Employee Application");
        System.out.println("********************");
        System.out.println("Add employee");
        System.out.println("Print All Amployee");
        System.out.println("Exit");
    }

    //Create method to get Menu Option
    public static int getMenuOptions() {
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your option: ");
        option = sc.nextInt();
        return option;
    }

    public static void main(String[] args) {

        int op = 0;

        do {
            //Print menu
            mainMenu();
            //Get menu options
            op = getMenuOptions();

            switch (op) {
                case 1://Add
                    System.out.println("Add");
                    break;
                case 2://Print All
                    System.out.println("Print all employee");
                    break;
                case 3://Exit
                    System.out.println("System exit");
                    break;
                default:
                    System.out.println("INPUT ERROR");
            }

        }
        while (op != 3);//Exit application if press 4

        Employee dev = new Developer("Valentin", "IT", 1);
        Employee dev2 = new Developer("Irina", "Frontend", 2);
        dev.work();


        Accountant booker = new Accountant();
        booker.work();

    }
}