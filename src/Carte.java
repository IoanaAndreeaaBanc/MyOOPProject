public class Carte {
    double pret;
    String titlu;
    String autor;


    public double getPret(){
        return pret;
    }
    public String afiseaza(){
        return "Cartea " + titlu+ " are ca autor " + autor;
    }
}
