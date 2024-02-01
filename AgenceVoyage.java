import java.util.ArrayList;
import java.util.Scanner;

class Voyageur {
    private String nom;
    private int age;
    private String adresse;

    public Voyageur(String nom, int age, String adresse) {
        this.nom = nom;
        this.age = age;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getAdresse() {
        return adresse;
    }
}

class AgenceVoyage {
    private String nom;
    private String adresse;
    private ArrayList<Voyageur> voyageurs = new ArrayList<>();

    public AgenceVoyage(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        initialiserVoyageurs();
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public void ajouterVoyageur(Voyageur voyageur) {
        voyageurs.add(voyageur);
    }

     private void initialiserVoyageurs() {
        voyageurs.add(new Voyageur("Stella", 12, " 456 Rue de l'Exploration, Lyon"));
        voyageurs.add(new Voyageur("Ryan", 24, " 9 Impasse du Bocqueteau , Cergy"));
        voyageurs.add(new Voyageur("Boudin", 6, " 123 Rue de la Aventure, Paris"));
        voyageurs.add(new Voyageur("Louisan", 21, " 101 Rue du Découverte, Bordeaux"));
        voyageurs.add(new Voyageur("Aurelie", 27, " 789 Avenue de l'Aventure, Marseille"));
    }


    public Voyageur searchVoyageur(String nom) {
        for (Voyageur voyageur : voyageurs) {
            if (voyageur.getNom().equalsIgnoreCase(nom)) {
                return voyageur;
            }
        }
        return null;
    }

    public void suppVoyageur(String nom) {
        Voyageur voyageur = searchVoyageur(nom);
        if (voyageur != null) {
            voyageurs.remove(voyageur);
            System.out.println("Le voyageur a été supprimé avec succès.");
        } else {
            System.out.println("Aucun voyageur trouvé avec le nom saisi.");
        }
    }

    public void afficherInformations() {
        System.out.println("Informations de l'agence de voyage:");
        System.out.println("Nom: " + nom);
        System.out.println("Adresse: " + adresse);
        System.out.println("Liste des voyageurs: ");
        for (Voyageur voyageur : voyageurs) {
            System.out.println("- " + voyageur.getNom() + ", " + voyageur.getAge() + " ans, Adresse: " + voyageur.getAdresse());
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AgenceVoyage agence = new AgenceVoyage("EasyLine Travel", "123 Rue de la Aventure, Paris");

        agence.afficherInformations();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Ajout d'un nouveau voyageur");
            System.out.println("2. Recherche d'un voyageur par son nom");
            System.out.println("3. Suppression d'un voyageur par son nom");
            System.out.println("4. Affichage des informations de l'agence");
            System.out.println("5. Quitter l'application");
            int choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("Entrez le nom du nouveau voyageur: ");
                    String nomVoyageur = sc.nextLine();
                    System.out.println("Entrez l'âge du nouveau voyageur: ");
                    int ageVoyageur = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Entrez l'adresse du nouveau voyageur: ");
                    String adresseVoyageur = sc.nextLine();
                    agence.ajouterVoyageur(new Voyageur(nomVoyageur, ageVoyageur, adresseVoyageur));
                    System.out.println("Le voyageur a été ajouté avec succès.");
                    break;

                case 2:
                    System.out.println("Entrez le nom du voyageur à rechercher: ");
                    String nomRecherche = sc.nextLine();
                    Voyageur voyageurTrouve = agence.searchVoyageur(nomRecherche);
                    if (voyageurTrouve != null) {
                        System.out.println("Voyageur trouvé: " + voyageurTrouve.getNom() + ", " + voyageurTrouve.getAge() + " ans, Adresse: " + voyageurTrouve.getAdresse());
                    } else {
                        System.out.println("Aucun voyageur trouvé avec le nom saisi.");
                    }
                    break;

                case 3:
                    System.out.println("Entrez le nom du voyageur à supprimer: ");
                    String nomSuppression = sc.nextLine();
                    agence.suppVoyageur(nomSuppression);
                    break;

                case 4:
                    agence.afficherInformations();
                    break;

                case 5:
                    System.out.println("Fin de l'application.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
                    break;
            }
            
        }
    }
}
