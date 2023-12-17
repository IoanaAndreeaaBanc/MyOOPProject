import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> listaNoastra = new ArrayList<>();
        listaNoastra.add("First");
        listaNoastra.add("Second");
        listaNoastra.add("Third");
        listaNoastra.set(0,"First-replaced");
        listaNoastra.remove(2);

        for (String element:listaNoastra){
            System.out.println(element);
        }
        System.out.println(listaNoastra.size());
        System.out.println(listaNoastra.contains("Second"));
        System.out.println(listaNoastra.indexOf("Second")); //pe ce pozitie este secondd

        ArrayList<String> listaCursuri = new ArrayList<>();
        listaCursuri.add("Testare automata");
        listaCursuri.add("Testare manuala");
        listaCursuri.add("Front-end");
        listaCursuri.add("Java");

        System.out.println(listaCursuri.get(1));
        System.out.println(listaCursuri.size());
        for (String curs:listaCursuri){
            System.out.println(curs);
        }
    }



}
