public class Zaposleni {
    //atributi opisuju stanje objekta klase
    //private polja su nedostupna van ove klase
//vrednost atributa tipa string u startu null a tipa int npr je 0
    //konstruktor je specijalna metoda

    private String ime;
    private String prezime;
    private String radnoMesto;
    private double plata;

    public Zaposleni(String ime, String prezime, String radnoMesto, double plata) {
        this.ime = ime;
        this.prezime = prezime;
        this.radnoMesto = radnoMesto;
        this.plata = plata;
    }

    public Zaposleni(){

    }

    //get metode
   public String getIme() {
        return ime;
   }
   public String getPrezime() {
        return prezime;
   }
   public String getRadnoMesto() {
        return radnoMesto;
   }
   public double getPlata() {
        return plata;
   }

   //set metode
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public void setRadnoMesto(String radnoMesto) {
        this.radnoMesto = radnoMesto;
    }
    public void setPlata(double plata) {
        this.plata = plata;
    }

    //toString
    public String toString() {
        return ime+" "+prezime+" "+radnoMesto+" "+plata;
    }

    public  void ispisPodataka(){
        System.out.println(ime+" "+prezime+" "+radnoMesto+" "+plata);
    }

}
