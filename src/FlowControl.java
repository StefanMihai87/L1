import java.util.Random;
import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {

        // Flow control - if , esle
        // evaluaeaza conditii si bifurca codul in functie de rezultat

//        System.out.println("pornim radio");
        //daca imi place piesa , dau mai tare
//        boolean piesa_faina = true;
//        if (piesa_faina == true) {
//            System.out.println("dau mai tare");
//            System.out.println("incep sa o fredonez");
//        }
//        System.out.println("oprim radio");
//        //daca nu imi place piesa,inchidem
//
//        int nr = 3;
//        if (nr % 2 == 0) {
//            System.out.println("par");
//        }else {
//            System.out.println("impar");

        // if , esle if , esle
        // luam date de la tastatura


//            System.out.println("introduceti ora:");
//        int ora = sc.nextInt();
//        if (ora < 0) {
//            System.out.println("ora invalida");
//        } else if (ora < 11) {
//            System.out.println("buna dimineata");
//        }else if (ora < 18) {
//            System.out.println("buna ziua");
//        }else if (ora < 21) {
//            System.out.println("buna seara");
//        }else if (ora < 24) {
//            System.out.println("noapte buna");
//        }else {
//            System.out.println("ora invalida");
//        }
        // flow control
        // switch -  se foloseste cand stim valorile posibile

        Scanner sc = new Scanner(System.in);
        System.out.println("alege optiunea");

        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("ro");
                break;
            case 2:
                System.out.println("eng");
                break;
            default:
                System.out.println("optiune invalida");
        }


    }
}
