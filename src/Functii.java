public class Functii {
    // functiile = logica delimitata care poate fi refolosita
    // nu putem folosi spatii in nume
    // nu putem defini o functie in alta functie (nu poti instala firefox in chrome)

    // o functie simpla care ne printeaza ceva pe ecran
    // nu ne da nici un raspuns (nu are return)
    // nu are parametri
    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit");
    }

    // o functie care saluta clientul in functie de numele lui
    // nu ne da nici un raspuns (nu are return)
    // are nevoie de parametri
    public static void printGreetingByName(String nume, String prenume){
        System.out.println("Buna ziua " + nume + " " + prenume);
    }

    // o functie care calculeaza media a 3 numere
    // ne da un raspuns - suma nr va avea return
    // are nevoie de parametri
    public static double mediaNr(double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }

    // o functie care ne da valoarea lui pi
    // ne da un raspund? da ne da un raspuns
    // ce tip de date are raspunsul? nr este double
    // are nevoie de parametri? nu
    public static double piValue(){
        // constanta = care nu poate fii suprascrisa
        final double pi = 3.14;
        return pi;

    }

    public static void main(String[] args) {
        // intra clientul 1
        printGreeting(); // se apeleaza f

        // intra clientul 2
        printGreeting(); // ctrl + click pe functie ne duce la corpul ei

        // apelam o functie cu parametri, offering argumentes
        printGreetingByName("Stefan", "Mihai");
        printGreetingByName("Stefan", "Georhe");
        printGreetingByName("Stefan", "Monica");

        System.out.println(  mediaNr(3, 3, 4));
        double media1 = mediaNr(322324,343433,56567);
        double media2 = mediaNr(657,3467,324);
        double media3 = mediaNr(680,454677,5765);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piValue());


    }
}
