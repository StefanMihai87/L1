package oop;

public class ContBancarMain {
    public static void main(String[] args) {

        // initializam obiecte de tip ContBancar
        // instante ale clasei ContBancar

        ContBancar cont1 = new ContBancar("Mihai S","RO001");
        ContBancar cont2 = new ContBancar("Mihai S1","RO002");

        System.out.println(cont1.titularCont);
        System.out.println(cont1.iban);
        System.out.println(cont1.activ);
        System.out.println(cont1.sold);
        System.out.println(cont2.titularCont);

        // apelam metoda descrie
        cont1.descriere();
        cont2.descriere();

        // activam conturile
        cont1.activareCont();
        cont2.activareCont();
        cont1.descriere();
        cont2.descriere();



    }
}
