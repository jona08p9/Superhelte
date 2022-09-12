import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Velkommen til superheltedatabasen");
        System.out.println("Her kan du tilføje en superhelt");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Intast superheltens navn");
        String navn = scanner.nextLine();

        System.out.println("indtast superheltens superheltealias");
        String heltealias = scanner.nextLine();

        System.out.println("indtast superheltens superkræft");
        String power = scanner.nextLine();

        System.out.println("Indtast superheltens udgivelses år");
        int year = scanner.nextInt();

        System.out.println("Indtast superheltens styrkeniveau");
        double strenght = scanner.nextDouble();


        /*Superhelte s1 = new Superhelte("Clark Kent", "superman", "Uovervindelig", 1938, 10.0);

        System.out.println(s1.getHelteAlias());*/


    }
}
