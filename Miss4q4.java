import java.util.ArrayList;
import java.util.Scanner;

public class Miss4q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalprice = 0;

        ArrayList<String> article = new ArrayList<>();
        
        ArrayList<Integer> priceHT_art = new ArrayList<>();

        for(int i = 0; i<5; i++){
            System.out.println("Choose the name of your dog : ");
            String dogchoose = sc.nextLine();
            article.add(dogchoose);
        }


        for(int i = 0; i<article.size(); i++){
            System.out.print("Entry the cost " + (article.get(i)) +" : ");
            int pricechoose = sc.nextInt();
            priceHT_art.add(pricechoose);

        }

        int miniprice = priceHT_art.get(0);
        int maxiprice = priceHT_art.get(0);

        for(int i = 1; i<article.size(); i++){
            if ( priceHT_art.get(i)< miniprice){
                miniprice = priceHT_art.get(i);
            }
        }
        System.out.print("The minimum price is : " + miniprice + "\n");

        for(int i = 1; i<article.size(); i++){
            if(priceHT_art.get(i)> maxiprice){
                maxiprice = priceHT_art.get(i);
            }
        }

        System.out.print("The maximum price is : " + maxiprice + "\n");


        double m_price = 0.0;
        for(int i = 0; i<5; i++){
            m_price = m_price + priceHT_art.get(i);
        }

        double prix_moyen = m_price / 5; 
        System.out.println("The average price is : " + prix_moyen);

        for(int i=0; i<article.size(); i++){            
            totalprice = totalprice + priceHT_art.get(i);
        }

        System.out.print("The total price is : " + totalprice);
        sc.close();       
    }
}