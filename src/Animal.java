public class Animal {
    // Atribute sau proprietati
    String nume; 
    String culoare;
    boolean vegetarian;
 // constructor cu 0 parametri
    public Animal()
    {
        nume="unknown";
        culoare="unknown";
        vegetarian=false;
    }
    // constructor cu parametri
    public Animal(String nume) {
        this.nume = nume;
    }

    public Animal(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }
    public Animal(String nume, String culoare, boolean vegetarian){
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;
        
    }
    // functii sau metode
    public void mananca(){
        System.out.println(nume+" mananca");
    }
        
    public void doarme(){
        System.out.println(nume + " doarme");

    }

    public String afiseaza(){
        return (nume + " are culoare " + culoare);

    }





}


