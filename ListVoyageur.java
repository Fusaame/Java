import java.util.ArrayList;
import java.util.Scanner;

public class ListVoyageur {

    private class Voyageur {
        String nameVoya;
        int ageVoya;

        public Voyageur(String nameVoya, int ageVoya){
            this.nameVoya=nameVoya;
            this.ageVoya=ageVoya;
        }

    public int getAgeVoya() {
        return ageVoya;
    }
    public void setAgeVoya(int ageVoya) {
        this.ageVoya = ageVoya;
    }

    public String getNameVoya() {
        return nameVoya;
    }
    public void setNameVoya(String nameVoya) {
        this.nameVoya = nameVoya;
    }

    @Override
    public String toString() {
        
        return "Votre nom est "+this.getNameVoya()+" et votre age est "+this.getAgeVoya()+" ans.";
    }
}

    

    public static void main(String[] args) {
        
        ArrayList<Voyageur> listVoya = new ArrayList<>();
        ListVoyageur easyline = new ListVoyageur();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer le nombre de voyageur : ");
        int nbVoya = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i< nbVoya; i++){

            System.out.println("Entrez le nom du voyageur : "+(i+1));
            String nameVoya = scanner.nextLine();

            System.out.println("Entrez l'âge du voyageur : ");
            int ageVoya = scanner.nextInt();
            scanner.nextLine();

            listVoya.add(easyline.new Voyageur(nameVoya, ageVoya));

        }

        System.out.println("\nListe des voyageurs saisis : "+ listVoya);
        
    }
    
}
