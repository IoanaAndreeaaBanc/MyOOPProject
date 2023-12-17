import java.sql.SQLOutput;

public class Main2 {
    public static void main(String[] args){
        Carte carte1 = new Carte(); // cuvantul cheie NEW se foloseste la crearea sau instantiere obiectelor
        carte1.autor = "Mihai Eminescu";
        carte1.titlu = "Poezii";
        carte1.pret = 35.00;

        Carte carte2 = new Carte();
        carte2.autor = "Ion Creanga";
        carte2.titlu = "Amintiri din copilarie";

        System.out.println(carte1.pret);
        System.out.println(carte2.pret);

        System.out.println(carte1.getPret());
        System.out.println(carte1.afiseaza());

        carte1.titlu = "Basme";
        System.out.println(carte1.afiseaza());

        Masina masina1=new Masina();
        Masina masina2 = new Masina();
        System.out.println(masina1.marca);
        masina2.marca="Dacia";
        System.out.println(masina2.marca);
        System.out.println(masina1.marca);

        Masina masina3= new Masina();
        Masina masina4= new Masina();
        masina3.anFabricatie = 2010;
        masina4.anFabricatie = 2020;
        System.out.println(masina3.getAnFabricatie());
        System.out.println(masina4.getAnFabricatie());
        //System.out.println(masina4);

        Persoana persoana1 = new Persoana();
        System.out.println(persoana1.nume);
        System.out.println(persoana1.prenume);
        Persoana persoana2=new Persoana("Ion"," Popescu");
        System.out.println(persoana2.varsta);
        System.out.println(persoana2.sex);

        Persoana persoana3 = new Persoana(36,"feminin","Ioana");
        System.out.println(persoana3.varsta);
        System.out.println(persoana3.sex);
        System.out.println(persoana3.nume);

        // ex 5 tema
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("leu", "maro",false);
        Animal animal3 =new Animal("Azorel");
        Animal animal4 = new Animal("pisi", "maro");

        // ex 6 tema
        animal1.mananca();
        animal1.doarme();
        animal2.mananca();
        animal2.doarme();
        animal3.mananca();
        animal4.doarme();
        //animal1.afiseaza();
        System.out.println(animal1.afiseaza());
        System.out.println(animal3.afiseaza());
        System.out.println(animal4.afiseaza());

        animal2.mananca();
        animal2.doarme();
        System.out.println(animal2.afiseaza());


        Apartament apartament1= new Apartament();
        Apartament aparatment2= new Apartament("Cluj-Napoca",7,true);

        apartament1.afiseazaNumar();
        apartament1.afiseazaLocalitatea();

        aparatment2.afiseazaNumar();
        aparatment2.afiseazaLocalitatea();


        Pasare pasare1 = new Pasare();
        pasare1.culoare="rosu";
        System.out.println(pasare1.culoare);

        Masina masina5 = new Masina();
        System.out.println(masina5.marca);

        Masina masina6 = new Masina("Tesla",2022);
        System.out.println(masina6.marca+ " " + masina1.getAnFabricatie());

        Elev elev1 = new Elev("Popescu");
        Elev elev2 = new Elev("Ionescu");
        System.out.println(elev1.nume);
        System.out.println(elev2.nume);
        Elev.diriginte="Isoscel2";
        System.out.println(elev2.diriginte);
        elev1.metodaNonStatica();
        Elev.metodaStatica();

        Film film1 = new Film();
        film1.setTitlu("Titanic");
        System.out.println(film1.getTitlu());

        Inotator inotator1 = new Inotator("Romania","fluture");
        inotator1.seAntreneaza();
        inotator1.seOdihneste();
        System.out.println(inotator1.tara);

        Maratonist maratonist1 = new Maratonist("Congo","100 m");
        Maratonist maratonist2 = new Maratonist("China","100 m");
        maratonist1.seAntreneaza();
        maratonist1.seOdihneste();
        System.out.println(maratonist1.sport);

        Pisica pisi = new Pisica();
        pisi.scoateSunete();

        Caine cutu = new Caine();
        cutu.scoateSunete();

        Mamifer mamifer1 = new Pisica();
        mamifer1.scoateSunete();

        Pisica pisi1 = new Pisica(); // pisi1 = pisica
        Mamifer pisi2 = (Mamifer) pisi1;

        //Mamifer pisi3 = new Mamifer(); // pisi 3 e de tip Mamifer
        //Pisica pisi4 = (Pisica) pisi3; // pisi4 il facem de tip Pisica








    }


}
