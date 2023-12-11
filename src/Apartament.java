public class Apartament {
    String localitate;
    int numar;
    boolean parter;

    public Apartament(String localitate, int numar, boolean parter) {
        this.localitate = localitate;
        this.numar = numar;
        this.parter = parter;
    }

    public Apartament(){

    }

    public void afiseazaNumar(){
        System.out.println("Apartament " + numar);
    }



    public void afiseazaLocalitatea(){
        System.out.println(localitate + " in care este apartamentul");

    }

}
