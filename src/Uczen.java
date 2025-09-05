public class Uczen extends Osoba{
    private static int liczbaUczniow;
    private  int numerUcznia;


    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        liczbaUczniow++;
        numerUcznia=liczbaUczniow;
    }

    public int getNumerUcznia() {
        return numerUcznia;
    }

    public void setNumerUcznia(int numerUcznia) {
        this.numerUcznia = numerUcznia;
    }

    public int getLiczbaUczniow() {
        return liczbaUczniow;
    }

    public void setLiczbaUczniow(int liczbaUczniow) {
        this.liczbaUczniow = liczbaUczniow;
    }

    @Override
    public String toString() {
        return "Uczen{" + getImie()+" " + getNazwisko() +" "+
                "liczbaUczniow=" + liczbaUczniow +
                ", numerUcznia=" + numerUcznia +
                '}';
    }
}
