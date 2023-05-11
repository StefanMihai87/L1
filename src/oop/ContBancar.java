package oop;

public class ContBancar {
    // program files = definim logica unui cont bancar

    //oop = object oriented programming
    //poo programare orientata pe obieste

    // o clasa = este un tip nou
    // este def unui concept (reteta de paste carbonare)
    // ex: clasa Car

    // un obiesct = instanta unei clase (paste carbonara)
    // ex: obiect de tip Car

    // fields = proprietati = atribute (variabile)
    // ex: culoare, marca, model, consum, pret,

    // metode = actiuni ce pot fi facute de obieste
    // functii
    // ex: accelereaza(), franeaza(), deschie usa()

    // proprietatile
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;


    // constructorul =are rolul de a impunde date de start
    // ca si * din formulare ( required fields)

    // click drapta -> generate ->constructor -> selectam cu ctrl+clik

    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
      }

    // metode
    public void descriere() {
        System.out.println("Titular " + this.titularCont);
        System.out.println("IBAN " + this.iban);
        System.out.println("Sold " + this.activ);
        System.out.println("Activ" + this.sold);
    }

    public void activareCont() {
         // modifica activ in true
        this.activ =  true;

    }


    //cei 4 piloni ai oop-ului:
    // inheritance
    // polimorphism
    // encapsulation
    // abstractization

}
