public class While {
    public static void main(String[] args) {
        // while este un loop
        // zona de cod care se repeta atat timp cat o conditie este True

        //problema: masina merge cat timp inca are benzina
        int litri_benzina = 10;
        while (litri_benzina > 0) {
            //accelera
            System.out.println("Vruum Vruum");
            // scadem bezina
            litri_benzina = litri_benzina-1;
            // aprindem beculetul cand avem <= 3 litri
            if (litri_benzina <= 3) {
                System.out.println("Se aprinde becul rosu!");
            }
        }
        System.out.println("STOP! Nu mai avem benzina");
    }
}
