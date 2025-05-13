package corso_java_itcon.martedi1305;

import java.util.Scanner;

public class EsempioScanner {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in); //crea oggetto scanner
        System.out.println("Enter username");

        String userName=myObj.nextLine(); //lettura input
        System.out.println("Username is: "+userName); //stampa
    }
}
