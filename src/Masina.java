public class Masina {
    String marca ;
    int anFabricatie;

    public int getAnFabricatie(){
        return anFabricatie;
    }

    public Masina(String marca, int anFabricatie) {
        this.marca = marca;
        this.anFabricatie = anFabricatie;
    }

    public Masina(){
        marca = "BMV";
        anFabricatie = 2000;




    }
}
