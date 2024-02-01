import java.util.Scanner;

public class Miss2Q4 {


    /**
     * @param args
     */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String modele = "Tiny Car";
        double prixHT = 23999;
        double tva ;

        System.out.println("Bienvenue dans notre programme de réductions !");
            System.out.println("Veuillez choisir une option :");
            System.out.println("1 - Sans carte");
            System.out.println("2 - Avec carte gold");
            System.out.println("3 - Avec carte platinium");

            int choix = sc.nextInt();

            double reduction = 0.0;

            switch (choix) {
                case 1:
                    break;
                case 2:
                    reduction = 0.2;
                    break;
                case 3:
                    reduction = 0.15;
                    break;
                default:
                    System.out.println("Option invalide");
                    sc.close();
                    return;
            }

            System.out.println("Le montant de la réduction est de : " + (reduction * 100) + "%");

        System.out.print("Entrez votre Mot de passe : ");
        String mdp = sc.nextLine();

        if (mdp.equalsIgnoreCase("Oslo")) {


        System.out.print("Veuillez entrer la marque et le modele du vehicule (Tiny Car) :");
        String saisie = sc.nextLine();

        System.out.print("Électrique ? (Oui ou non) : ");
        String electrique = sc.nextLine();

    if (electrique.equalsIgnoreCase("oui")) {
            tva = 0.05;
        }
        else {
            tva = 0.2;
        };

        double prixTTC = prixHT + ( prixHT*tva);


        System.out.println("Saisir la marque et le modele du vehicule (Tiny Car) :");
        sc.close();

        if(saisie.equalsIgnoreCase("Tiny Car")){
            System.out.println("Le prix TTC de votre véhicule Tiny Car est de " + prixTTC + "euros");
            System.out.println("Le prix HT de votre véhicule est de " + prixHT + "euros");
            } else {
                System.out.println("Nous ne possèdons pas ce véhicule.");

                sc.close();
            }
        }

        else {
            System.out.println("Mot de passe incorrect.");
            sc.close();
        }

        }
    


    @Override
    public String toString() {
        return "Miss2Q2 []";
    }
}