package corso_java_itcon.martedi1305;

import java.util.Scanner;

public class EsercizioUno {
    public static void main(String[] args) {
        Scanner myObjStringa=new Scanner(System.in);
        Scanner myObjNumero=new Scanner(System.in); //crea oggetto scanner

        System.out.println("Inserisci Stringa: ");
        String userName=myObjStringa.nextLine();
        System.out.println("La stringa e' : "+userName);

        System.out.println("Inserisci Numero Intero: ");
        int numInt=myObjNumero.nextInt();
        System.out.println("il numero intero e' : "+numInt);

        System.out.println("Inserisci Float: ");
        Float numFloat=myObjNumero.nextFloat();
        System.out.println("il float e' : "+ numFloat);
        
        System.out.println("Inserisci Boolean: ");
        Boolean varBool=myObjStringa.nextBoolean();
        System.out.println("Il Bool e' : "+varBool);
    }
}