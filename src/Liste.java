import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // declaram o lista goala
        List<String> fructe = new ArrayList<>(); // facem importuri de date cand e rosu

        // adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        // cum se iau elementele
        // fructe.get(0);
        System.out.println(fructe.get(0));

        // cum se afla indexul unui elemen
        // fructe.indexOf("banana")
        System.out.println(fructe.indexOf("banana"));

        //este lista goala?
        System.out.println(fructe.isEmpty());

        // eliminam toate elementele din lista
        // fructe.clear();

        //scoatem un element
         fructe.remove("mar");


         //aflam dimensiunea listei
        System.out.println(fructe.size());

        //listam elementele
        //System.out.println(flowerList);


        if (!fructe.isEmpty()) {  // intrebam daca lista NU este goala (punem o intrebare negativa datorita ! )
            System.out.println("avem ce manca");
        }else {
            System.out.println("nu avem ce manca");
        }

        //declaram o lista imutabila si o initializam cu valori
        List<String> list = Arrays.asList(new String[]{"foo", "bar"});
        // List<Integer> list = Arrays.asList(new Integer[]{1, 22 , 33 , 56});

        //declaram o lista dinamica
        String[] flowers = {"Ageratum", "Allium", "Poppy", "Catmint"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));

        //adaugam in lista
        flowerList.add("rose");

        System.out.println(flowerList);

        // aflam unde este un element Poppy
        int poppy_index = flowerList.indexOf("Poppy");

        //stergem ce este in acea pozitie
        flowerList.remove(poppy_index);

        // scoatem in functie de valoare
        flowerList.remove("Catmint");

        //System.out.println(Arrays.toString(flowerList.toArray()));  varinta mai lunga
        System.out.println(flowerList);
    }
}
