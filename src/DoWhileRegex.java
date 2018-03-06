import java.util.Scanner;
import java.util.regex.Pattern;

public class DoWhileRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city;
        boolean regex;
        do{
            System.out.println("Podaj miasto ");
            city = sc.nextLine();
            regex = Pattern.matches("[A-Za-z]{3,15}", city);
               }while(regex != true);
    }

}