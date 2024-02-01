public class Bagage {

    private String numero;
    private String color;
    private String pds;

    public Bagage(String numero, String color, String pds){
        this.numero=numero;
        this.color=color;
        this.pds=pds;
    }

    public void afficher(){
        System.out.println("Votre bagage numero "+numero+" de couleur "+color+" avec un poids de "+pds+"kg");
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }

    public void setPds(String pds) {
        this.pds = pds;
    }
    public String getPds() {
        return pds;
    }

    @Override
    public String toString() {

        return "\n"+" Bagage {" +"numero = "+this.getNumero()+"\n "+ ", color = "+this.getColor()+"\n"+", poids = "+this.getPds()+"\n"+"}";
    }

    public static void main(String[] args) {
        
        Bagage bg=new Bagage("Numéro 8 ", " Vert ", " 10kg");
        System.out.println(bg);
        bg.afficher();
    }
}
