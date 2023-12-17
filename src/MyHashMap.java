import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> dictionarulNostru = new HashMap<>();
        dictionarulNostru.put(1, "First");
        dictionarulNostru.put(2, "Second");
        dictionarulNostru.put(3, "Third");
        dictionarulNostru.put(4, "Forth");
        dictionarulNostru.replace(3,"Third-replaced");
        System.out.println(dictionarulNostru.replace(3,"Third", "Third-replaced"));

        System.out.println(dictionarulNostru.get(3));
        System.out.println(dictionarulNostru.get(4));
        System.out.println(dictionarulNostru.keySet());
        System.out.println(dictionarulNostru.values());
        dictionarulNostru.remove(3);
        System.out.println(dictionarulNostru.size());
        System.out.println(dictionarulNostru.entrySet());
        dictionarulNostru.replace(2, "Second-replaced");
        System.out.println(dictionarulNostru.get(2));
        dictionarulNostru.containsValue("First");
        dictionarulNostru.containsKey(1);
        System.out.println(dictionarulNostru.containsValue("First"));
        System.out.println(dictionarulNostru.containsKey(1));

        for (int key: dictionarulNostru.keySet()) {
            System.out.println(key);
        }
        for (String value:dictionarulNostru.values()){
            System.out.println(value);
        }

        System.out.println(dictionarulNostru.entrySet());


        // Tema ex 2

        HashMap<String, Boolean> dictionarStudenti = new HashMap<>();
        dictionarStudenti.put("Ioana", true);
        dictionarStudenti.put("Andreea", false);
        dictionarStudenti.put("Mihai", true);
        dictionarStudenti.put("Paul", false);
        dictionarStudenti.put("Luca", true);

        afiseazaStudentiAdmisi(dictionarStudenti);


        HashMap<String, Integer> dictionarePersoane = new HashMap<>();
        dictionarePersoane.put("Rares", 40);
        dictionarePersoane.put("Andrei", 25);
        dictionarePersoane.put("Raluca", 17);
        dictionarePersoane.put("Irina", 64);
        dictionarePersoane.put("Luca", 4);

        System.out.println(dictionarePersoane.entrySet());
        for(String key:dictionarePersoane.keySet()){
            System.out.println(key + " are varsta " + dictionarePersoane.get(key));
        }

        HashMap<String, Integer>dictionarNote = new HashMap<>();
        dictionarNote.put("Ionescu", 7);
        dictionarNote.put("Popescu", 9);
        dictionarNote.put("Pop", 6);
        dictionarNote.put("Marin", 9);

        double mediaAritmetica = calculeazaMedia(dictionarNote);
        System.out.println(mediaAritmetica);

    }

    public static void afiseazaStudentiAdmisi(HashMap<String, Boolean> dictionarStudenti)
    {
        for (String key:dictionarStudenti.keySet()){
            if(dictionarStudenti.get(key))
            {
                System.out.println(key);
            }
        }

        System.out.println(dictionarStudenti.entrySet());

        for(Map.Entry<String,Boolean> keyValue:dictionarStudenti.entrySet())
        {
            if(keyValue.getValue()){
                System.out.println(keyValue.getKey());
            }
        }

    }

    public static double calculeazaMedia(HashMap<String, Integer> dictionarNote){
        int nrNote=dictionarNote.size();
        int sumaNote = 0;

        for(Integer nota:dictionarNote.values()){
            sumaNote = sumaNote + nota;
        }

        double mediaAritmetica = (double)sumaNote/nrNote;

        return mediaAritmetica;
    }
}