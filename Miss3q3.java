import java.util.Scanner;

public class Miss3q3 {
    
        public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            int essai = 2;
            String mdp;
            mdp = "Oslo";
            System.out.println("Veuillez saisir le Mot de passe : ");
            String codesaisi = scanner.nextLine();
            
            if(codesaisi.equals(mdp)){
                
                System.out.println("Veuillez saisir la marque de votre voiture : ");
                String marque = scanner.nextLine();

                System.out.println("Veuillez saisir un le modele de votre voiture : ");
                String modele = scanner.nextLine();
        
                System.out.println("Veuillez saisir un le prixHT :");
                int prixHT = scanner.nextInt();

                System.out.println("Veuillez saisir 1 si vitre véhicule est éléctrique et 2 si non-éléctrique:");
                int type = scanner.nextInt();
        
            
                if (prixHT>20000) {
                    if (type == 1 ){
                    double tva = 0.05;
                    double prixTTC = (prixHT * (1 + tva))* 0.9;
                    System.out.println("Votre "+ marque + " " + modele + " coûte " + prixTTC);
                    }else{
                        double tva = 0.20;
                        double prixTTC = (prixHT * (1 + tva))* 0.9;
                        System.out.println("Votre "+ marque + " " + modele + " coûte " + prixTTC);
                    }
                }

                if (prixHT<20000){
                    if (type == 1){
                    double tva = 0.05;
                    double prixTTC1 = prixHT * (1 + tva);
                    System.out.println("Votre "+ marque + " " + modele + " coûte " + prixTTC1);
                    } else{
                        double tva = 0.20;
                        double prixTTC1 = prixHT * (1 + tva);
                        System.out.println("Votre "+ marque + " " + modele + " coûte " + prixTTC1);
                    }
                }   
                scanner.close();
        }if(essai == 0) {
            System.out.println("Votre mot de passe ne correspond pas.");
            System.exit(0);
        }else{
            System.out.print("Le mot de passe est faux, il vous reste " + essai + " essaies " +"\n");
            essai = essai -1;
        }
        }
    }
}
