package prog_obj;

public class Pracownik {
//dziedziczenie
    
String imie,nazwisko;
int wyplata;
    
public Pracownik(){
    imie="";
    nazwisko="";
    wyplata=0;
}

public Pracownik(String imie, String nazwisko, int wyplata) {
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.wyplata = wyplata;
}

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWyplata() {
        return wyplata;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWyplata(int wyplata) {
        this.wyplata = wyplata;
    }

    @Override //przeciazenie metody dla pracownika
    public String toString(){
        return "Pracownik{" + "imie: "+imie+", nazwisko: "+nazwisko+", wyplata: "+wyplata+"}";
    }
    
}