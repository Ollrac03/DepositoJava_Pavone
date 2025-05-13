package corso_java_itcon.martedi1305;

public class PrimeVariabili {
    public static void main(String[] args) {
        int provaNumero=12;     //dichiarazione variabili
        String provaTesto="Ciao Mondo";
        boolean provaBool=true;

        boolean provaBool2;
        provaBool=false;

        final int provaNumero2=15; //variabile final=costante
        provaNumero=20;

        String testo = "Mondo";
        System.out.println("Ciao "+testo);

        System.out.println('2'+'2'); //concatenazione di 2 char => output='22'

        int x,y,z; //cascata
        x=y=z=50; 
        System.out.println(x+y+z);



        int x =5, y=6, z=50;//refer
        System.out.println(x+y+z);

        double myDouble=19.99d; //tipo primitivo
    }
}
