import java.util.ArrayList;
import java.util.Scanner;

public class Mission4 {

    public static class Voyageur {
        private String nom;

        public Voyageur(String nom){
            this.nom = nom;
        }
        public String getNom() {
            return nom;
        }

        @Override
        public String toString() {
            return "Voyageur{nom='" + nom + "'}";
        }
    }
    
    
    public static void main(String[] args) {
        
        ArrayList<Voyageur> listeVoyageurs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Combien de voyageurs voulez vous ajouter : ");
        int nbVoya = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<nbVoya; i++){
            System.out.println("Entrez le nom du voyageur "+(i+1)+ " : ");
            String nom = sc.nextLine();
            Voyageur voyageur = new Voyageur(nom);
            listeVoyageurs.add(voyageur);
        }

        System.out.println("Liste des voyageurs : ");
        for (Voyageur voyageur : listeVoyageurs) {
            System.out.println(voyageur.toString());
        }

        System.out.println("Entrez le nom de voyageur a rechercher : ");
        String nomRecherche=sc.nextLine();
        Voyageur voyageurSearch= null;
        for (Voyageur voyageur : listeVoyageurs){
            if (voyageur.getNom().equals(nomRecherche)){
               voyageurSearch=voyageur;
               break; 
            }         
        }
        if (voyageurSearch != null){
            System.out.println("Voyageur trouvé : "+voyageurSearch.toString());
        } else {
            System.out.println("Voyageur non trouvé.");
        }

        System.out.println("Voulez vous supprimer un voyageur ? (Oui - 1; Non = 2) : ");
        int supp = sc.nextInt();
        sc.nextLine();
        if (supp == 1){
            System.out.println("Entrez le nom du voyageur a supprimé : ");
            String nomSupp=sc.nextLine();
            for (int i = 0; i<listeVoyageurs.size(); i++){
                if (listeVoyageurs.get(i).getNom().equals(nomSupp)) {
                    listeVoyageurs.remove(i);
                    break;
                }
            }

            System.out.println("Liste des voyageurs après suppression : ");
            for (Voyageur voyageur : listeVoyageurs){
                System.out.println(voyageur.toString());
        }

        } else {
            System.out.println("Voici votre liste de voyageur ajouté "+listeVoyageurs);
        }
    }
}


