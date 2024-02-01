public class Adresspost {

    private int num;
    private String libell;
    private String ville;
    private int codPost;

    public Adresspost(int num, String libell, String ville, int codPost){
        this.num = num;
        this.libell=libell;
        this.ville=ville;
        this.codPost=codPost;
    }

    // Get and Set Num
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
    
    // Get and Set libell
    public void setLibell(String libell) {
        this.libell = libell;
    }
    public String getLibell() {
        return libell;
    }

    // Get and Set Ville
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getVille() {
        return ville;
    }

    // Get and Set CodPost
    public void setCodPost(int codPost) {
        this.codPost = codPost;
    }
    public int getCodPost() {
        return codPost;
    }


    public void afficher(){
        System.out.println("L'adresse postale du voyageur est : "+num+" "+libell+" "+ville+" "+codPost+".");
    }

    @Override
    public String toString() {
        
        return this.getNum()+this.getLibell()+this.getVille()+this.getCodPost();
    }

    

    public static void main(String[] args) {
        
        Adresspost adresse= new Adresspost(8, "Impasse du Bocqueteau,", "Cergy,", 95800);
        System.out.println(adresse);
        adresse.afficher();

        adresse.setNum(25);
        adresse.setLibell("Avenue des Champs-Élysées");
        adresse.setVille("Beauchamps");
        adresse.setCodPost(95000);
        adresse.afficher();
    }

    
}
