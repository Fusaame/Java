import java.util.Scanner;

public class Compagnie {
    
    public String nom;
    public int code;
    public double ca;
    public String couleurPrincipaleLogo;
    public String CouleurSecondaire;

    public Compagnie(){
        
    }
 
    public Compagnie(String nomCompagnie){
        this.nom=nomCompagnie;
    }

    // New constructeur consigne 18 pour les compagnies 6-7
    public Compagnie(String nomCompagnie, String couleurPrincipal, String couleurSecondaire){
        this.nom=nomCompagnie;
        this.couleurPrincipaleLogo= couleurPrincipal;
        this.CouleurSecondaire= couleurSecondaire;
    }

    // New constructeur pour integrer le code consigne 21
    public Compagnie(String nomCompagnie, String couleurPrincipal, String couleurSecondaire, int codeCompagnie){
        this.nom=nomCompagnie;
        this.couleurPrincipaleLogo= couleurPrincipal;
        this.CouleurSecondaire= couleurSecondaire;
        this.code=codeCompagnie;
    }

    public void afficher(){
        // changement de l'affichage consigne 13
        System.out.println("La compagnie "+this.nom+" son code est ("+this.code+"), vous pouvez la reconnaitre avec sa couleur "+this.couleurPrincipaleLogo+" sa couleur secondaire est "+this.CouleurSecondaire+".");
    }

    // Creation de la classe pour initier la couleur secondaire
    public void setCouleurSecondaire(String couleurSecondaire) {
        this.CouleurSecondaire = couleurSecondaire;
    }
    // Consigne 26
    public void setNom(String nom) {
        this.nom = nom;
    }
    // Consigne 26 + creation d'un mdp
    public void setCa(double newCa) {
        if(verifierMdp()){
            // on falsifie la somme de +30% consigne 26 part 1
            this.ca = newCa * 1.3;
            System.out.println("Le Chiffre d'Affaire de la compagnie a ete modifie avec succes !");
        }else {
            System.out.println("Mot de passe incorrect. Modification annulé !");
        }
    }
    // Consigne 26
    public void setCouleurPrincipaleLogo(String couleurPrincipaleLogo) {
        this.couleurPrincipaleLogo = couleurPrincipaleLogo;
    }
    // Creation du code + Consigne 26 + creation d'un mdp
    public void setCode(int newCode) {
        if(verifierMdp()){
            this.code=newCode;
            System.out.println("Le code de la compagnie a ete modifie avec succes !");
        }else {
            System.out.println("Mot de passe incorrect. Modification annulé !");
        }
    }
    // affichage code
    public void affichCode(){
        System.out.println("Le code de la compagnie "+this.nom+" est : "+ this.code);
    }

    // Consigne 25
    public int getCode() {

        // Demande du Mdp a l'utilisateur 
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer le le mot de passe pour obtenir le code de la compagnie : ");
        String mdp=sc.nextLine();

        // Initialisation du mdp
        if (mdp.equals("Oslo")){
            return this.code;
        }else{
            System.out.println("Mot de passe incorrect. Acces refusé !");
            return -1;
        }
    }
    // Consigne 25
    public String getNom() {
        return nom;
    }
    // Consigne 25
    public double getCa() {
        return this.ca;
    }
    // Consigne 25
    public String getCouleurPrincipaleLogo() {
        return couleurPrincipaleLogo;
    }
    // Consigne 25
    public String getCouleurSecondaire() {
        // Consigne 25 part 2 = renvoi de la couleur secondaire 
        return this.CouleurSecondaire+" second";
    }


    

    // Creation de la couleur
    public void setColor(String newColor){
        this.couleurPrincipaleLogo=newColor;
    }
    // affichage couleur
    public void affichColor(){
        System.out.println("La couleur de la compagnie "+this.nom+" est : "+this.couleurPrincipaleLogo);
    }

    private boolean verifierMdp(){

        Scanner sc= new Scanner(System.in);
        System.out.println("Veuillez entrer le mot de passe : ");
        String motdepasse=sc.nextLine();

        return motdepasse.equals("Girafe");

    }
    
    


    public static void main(String[] args){


        Compagnie maCompagnie1= new Compagnie();
        maCompagnie1.nom="zaza";
        maCompagnie1.setCa(10000.0);
        // Code attribue 1
        maCompagnie1.setCode(111);
        // affichage code 
        maCompagnie1.affichCode();
        // Give color principal
        maCompagnie1.setColor("Orange");
        // Integration d'une couleur secondaire
        maCompagnie1.setCouleurSecondaire("Vert");
        // affichage couleur
        maCompagnie1.affichColor();
        // Consigne 13 : tout afficher dans une fonction
        maCompagnie1.afficher();


        Compagnie maCompagnie2= new Compagnie("zozo");
        // code attribute 2
        maCompagnie2.setCode(222);
        // affichage code 
        maCompagnie2.affichCode();
        // Give color principal
        maCompagnie2.setColor("Turquoise");
        // affichage couleur
        maCompagnie2.affichColor();
        // Consigne 13 : tout afficher dans une fonction; Consigne 11: affichage de la compagnie 2
        maCompagnie2.afficher();


        // Creation et Affichage de maCompagnie3
        Compagnie maCompagnie3= new Compagnie();
        maCompagnie3.nom="easyJune";
        // Give color principal
        maCompagnie3.setColor("Violet");
        // affichage couleur
        maCompagnie3.affichColor();
        // Consigne 13 : tout afficher dans une fonction
        maCompagnie3.afficher();


        // Creation et Affichage de maCompagnie4 avec argument 
        Compagnie maCompagnie4= new Compagnie("AR Airline");
        // Give color principal
        maCompagnie4.setColor("Blue");
        // affichage couleur
        maCompagnie4.affichColor();
        // Consigne 13 : tout afficher dans une fonction
        maCompagnie4.afficher();


        // Creation et Affichage de maCompagnie4 sans argument
        Compagnie maCompagnie5=new Compagnie();
        maCompagnie5.nom="GifiAR";
        // Give color principal
        maCompagnie5.setColor("Jaune");
        // affichage couleur
        maCompagnie5.affichColor();
        // Consigne 13 : tout afficher dans une fonction
        maCompagnie5.afficher();

        // Nouvelle compagnie cree avec le new constructeur consigne 19
        Compagnie maCompagnie6=new Compagnie("FrebourgAir", "Rouge", "Marron");
        // Affichage du code consigne 24
        maCompagnie6.setCode(997);
        // Affichage Consigne 20
        maCompagnie6.afficher();

        // Nouvelle compagnie 7 cree avec le new constructeur consigne 22
        Compagnie maCompagnie7=new Compagnie("LouisAR", "Noir", "Blanc", 667);
        // Affichage consigne 23
        maCompagnie7.afficher();

        
        // Consigne 25 part 1 = demande du mdp a l'utilisateur
        int codeCompagnie= maCompagnie1.getCode();
        if (codeCompagnie!=-1){
            System.out.println("Le code de la compagnie 1 est : "+codeCompagnie);
        }

        // On donne le resultat du CA de maCompagnie1 avec 30% de fraude
        System.out.println("Le chiffre d'affaires de la compagnie est : " + maCompagnie1.getCa());
        System.out.println("La couleur principale du logo de la compagnie est : " + maCompagnie1.getCouleurPrincipaleLogo());
        // Consigne 25 part 2 = afficher la couleur 
        System.out.println("La couleur secondaire du logo de la compagnie 1 est : "+maCompagnie1.getCouleurSecondaire());
        
       
    }
}
