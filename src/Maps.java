import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // map = reprezentare de date in sistem cheie valoare
        // exemplu: gigel are nota 10 , costel are nota 9

        // declaram un map
        Map<String,Integer> note_elevi = new HashMap<String,Integer>();

        // adauam elemente
        note_elevi.put("Gigel", 10);
        note_elevi.put("Costel", 9);
        note_elevi.put("Ana", 2);

        // aflu notele
        System.out.println("Ana are nota: " + note_elevi.get("Ana"));

        //suprascriem
        note_elevi.replace("Costel", 10);
        System.out.println("Costel si-a marit nota la " + note_elevi.get("Costel"));

        // aflam dimensiunea
        System.out.println(note_elevi.size());

        // stefrgem valori
        note_elevi.remove("Gigel");
        System.out.println(note_elevi.size());

        // declaram si initializam cu
        // map nu este ordonat

        Map<String,Integer> luni = new HashMap<String,Integer>()
        {{

            put("Jan", 1);
            put("Feb", 2);
            put("Mar", 3);
        }};
        System.out.println(luni);

    }
}
