import java.util.Scanner;

public class Voyageur {

    private String nom;
    private int age;
    private String cat;
    private Adresspost adresse;
    private Bagage bagage;

    public Voyageur(String n, int a) {
        setAge(a);
        setNom(n);
        assignCat();
        this.adresse= new Adresspost(8, " Impasse, ", "Beauchamps, ", 95000);
        this.bagage=new Bagage("", "", "");
    }

    public Voyageur(String n, int a, Adresspost adresse){
        this.nom=n;
        this.age=a;
        this.adresse=adresse;

    }

    public Voyageur() {
    }


    // Add des bagages 
    public void setBagage(Bagage bagage) {
        this.bagage = bagage;
    }
    public Bagage getBagage() {
        return bagage;
    }
    

    public void affichVoyageur() {
        System.out.println("Name is: " + nom);
        System.out.println("Age: " + age + " years");
        System.out.println("Categorie: " + cat);
    }

    // Add des Adresses
    public void setAdresse(Adresspost adresse) {
        this.adresse = adresse;
    }
    public Adresspost getAdresse() {
        return adresse;
    }

    private void setNom(String nom) {
        int largeword = nom.length();
        if (largeword >= 2) {
            this.nom = nom;
        } else {
            System.out.println("Veuillez entrer un nom valide !");
            System.exit(0);
        }
    }

    private void setAge(int age) {
        if (age > 0) {
            this.age = age;
            assignCat();
        } else {
            System.out.println("Age invalide!");
            System.exit(0);
        }
    }

    private int getAge() {
        return age;
    }

    String getNom() {
        return nom;
    }

    private String getCat() {
        return cat;
    }

    private void assignCat() {
        if (getAge() < 2) {
            this.cat = "Nourisson";
        } else if (getAge() < 18) {
            this.cat = "Enfant";
        } else if (getAge() < 60) {
            this.cat = "Adulte";
        } else {
            this.cat = "Senior";
        }
    }

    // Liaison des differents code bagage et adresse
    @Override
    public String toString() {

        return this.getNom()+ this.getAdresse().toString()+this.getBagage().toString();
    }

    

    public static void main(String args[]){
        Voyageur v1=new Voyageur ("Aurélie ", 25);
        Adresspost ad=new Adresspost(15, " Rue du calvere", " Cergy ", 95800);
        Bagage bg=new Bagage(" Bagage n°100", " Blanc", " 22kg");
        v1.setBagage(bg);
        v1.setAdresse(ad);
        System.out.println(v1);


        Voyageur voyageurInit= new Voyageur();

        Adresspost newAdress = new Adresspost(22, " Avenue du voyageur, ", " Miami ", 95800);
        voyageurInit.setAdresse(newAdress);

        Bagage newBagage = new Bagage("101", "Noir", "22kg");
        voyageurInit.setBagage(newBagage);

        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est votre nom : ");
        String nom = sc.nextLine();

        System.out.println("Quel est votre age : ");
        int age = sc.nextInt();

        voyageurInit.setNom(nom+" ");
        voyageurInit.setAge(age);
        System.out.println(voyageurInit);
        sc.close();

    }

}



