import java.util.ArrayList;
import java.util.Scanner;

public class Miss5q4 {

     ArrayList<String> article = new ArrayList<>();
     ArrayList<Integer> priceHT_art = new ArrayList<>();

    public void calcul(){
        for(int i = 0; i<(article.size()-1); i++){
            double tva = 0.2;
            double prixtttc=priceHT_art.get(i)*(1+tva);
            String description = "The animal is "+article.get(i)+" his cost without tva is "+priceHT_art.get(i)+" $ total cost is "+prixtttc+" $.";
            System.out.println(description);

        }   
    }
    public void max_price() {
        int max_price = priceHT_art.get(0);
        for (int i = 1; i<priceHT_art.size(); i++) {
            if (priceHT_art.get(i)>max_price) {
                max_price = priceHT_art.get(i);
            
            }
        }
        System.out.println("The maximum price is "+max_price+" $.");
    }

    public void min_price() {
        int min_price = priceHT_art.get(0);
        for (int i = 1; i<priceHT_art.size(); i++) {
            if (priceHT_art.get(i)<min_price) {
                min_price = priceHT_art.get(i);
            
            }
        }
        System.out.println("The minimum price is "+min_price+" $.");
    }

    public void average_price() {
        int ave_price = (priceHT_art.get(0) + priceHT_art.get(1) + priceHT_art.get(2) + priceHT_art.get(3) + priceHT_art.get(4))/5;
        System.out.println("The average price is "+ave_price+" $.");
    }

    

    public static void main(String[] args) {
        Miss5q4 object = new Miss5q4();
        Scanner sc = new Scanner(System.in);

        object.article.add("Oslo");
        object.article.add("Boudin");
        object.article.add("Scooby");
        object.article.add("Max");
        object.article.add("Tina");

        object.priceHT_art.add(700);
        object.priceHT_art.add(500);
        object.priceHT_art.add(200);
        object.priceHT_art.add(1500);
        object.priceHT_art.add(800);

        

        object.calcul();
        object.max_price();
        object.average_price();
        object.min_price();

        sc.close();


        
    }
}
