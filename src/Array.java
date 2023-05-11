import java.util.List;

public class Array {
    public static void main(String[] args) {
        // declaram si initiem cand stim valorile
        String[] elevi = {"Gigel", "Costel", "Mari", "Ela", "Ada"};
        int[] numere = {1, 33, 81, 99, 201};
        //contine mai nulte elemente de acelasi tip
        // accesam elementele prin index , care incepe de la 0
        // are o dimensiune fixa
        // are prop length care ne da dimensiunea Array-ului

        System.out.println(elevi[2]);
        elevi[2] = "Sebi";   // suprascriere
        System.out.println(elevi[2]);
        System.out.println(elevi.length);

        System.out.println("Last place: " + elevi[elevi.length-1]);  //formula dinamica ptr a vedea ultimul index

        // declarare si alocare de memorie
        int[] note = new int[5]; //definim fara a stii datele initiale si limitam la 5 note


    }
}
