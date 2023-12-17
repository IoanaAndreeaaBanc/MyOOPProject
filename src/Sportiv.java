abstract class Sportiv {
    String tara;
    String sport;
    Abilitate abilitate;

    public Sportiv(String tara, String sport) {
        this.tara = tara;
        this.sport = sport;
    }

    abstract void seAntreneaza();
    public void seOdihneste(){
        System.out.println("Sportivul se odihneste");
    }

}
