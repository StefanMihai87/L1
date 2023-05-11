public class Variabile {
    public static void main(String[] args) {
        // DECLARAERE SI INITIALIZARE
        // variabila = zona din memorie care tine dete
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        // strongly typed = trebuie sa  specificam tipul de date

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // suprascrierea
        modelMasina = "XC 60 facelift";

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

         // DECLARARE
        String nume;
        String prenume;
        nume = "Stefan";
        prenume ="Mihai";
        int varsta = 35;

        // concatenare de stringuri
        System.out.println(nume + " " + prenume + " si ma varsta de " + varsta);

    }
}
