import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Airline {

    private String nom;
    private Adresspost adresse;
    private ArrayList<Voyageur> lesVoyageurs= new ArrayList<>();

    public Airline(String nom, Adresspost adresse){
        this.nom=nom;
        this.adresse=adresse;
        Adresspost a1 = new Adresspost(110, "Azerty impasse, ", "Auvers", 77000);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    
    public void setAdresse(Adresspost adresse) {
        this.adresse = adresse;
    }
    public Adresspost getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        
        return "\n"+"Le Voyageur "+"\n" + nom +"\n"+ adresse ;
    }


    public static void main(String[] args) {

        
        
        Adresspost adress0 = new Adresspost(10, " rue des bains parisiens, ", "Paris, ", 75000);
        Airline a = new Airline("e", adress0);

        a.lesVoyageurs.add(new Voyageur("Stella",12));
        a.lesVoyageurs.add(new Voyageur("Ryan", 24));
        a.lesVoyageurs.add(new Voyageur("Boudin", 6));
        a.lesVoyageurs.add(new Voyageur("Louisan", 21));
        a.lesVoyageurs.add(new Voyageur("Aurelie", 27));        
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Combien de voyageurs voulez vous ajouter : ");
        int nbVoya = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<nbVoya; i++){
            System.out.println("Entrez le nom du voyageur "+(i+1)+ " : ");
            sc.nextLine();
            Voyageur voyageur = new Voyageur();
            a.lesVoyageurs.add(voyageur);
        }


        System.out.println("Voulez vous rechercher un voyageur ? Oui-1; Non-2 : ");
        int choose = sc.nextInt();
        sc.nextLine();

        if (choose==1){
            System.out.println("Entrez le nom de voyageur : ");
            String nomResearch = sc.nextLine();

            boolean found = false;
            int indexToDelete=-1;
            for (int i = 0;i<a.lesVoyageurs.size(); i++){
                if (a.lesVoyageurs.get(i).getNom().equalsIgnoreCase(nomResearch)) {
                    found = true ;
                    indexToDelete = i;
                    break;
                }
            }
            if (found) {
                System.out.println("Voyageur trouvé: " + a.lesVoyageurs.get(indexToDelete));

                System.out.println("Voulez vous supprimer le voyageur ? Oui-1; Non-2 : ");
                int nomsupp = sc.nextInt();
                sc.nextLine();

                if (nomsupp == 1) {
                    
                    a.lesVoyageurs.remove(indexToDelete);
                    System.out.println("Le voyageur a été supprimé avec succès.");
                } else {
                    System.out.println("Le voyageur n'a pas été supprimé.");
                }
            } else {
                System.out.println("Aucun voyageur trouvé avec le nom saisi.");
                
            }
        } else {
            System.out.println("Fin du programme.");
        }

        
        System.out.println("Liste mise à jour des voyageurs : " + a.lesVoyageurs.toString());
        sc.close();
    }
}