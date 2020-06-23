public class UmowaSprzedaży extends Dokument {
    private String imieKupującego;
    private String nazwiskoKupującego;
    private String nazwaArtykułu;
    private int kwota;
    public UmowaSprzedaży(){

    }

    public UmowaSprzedaży(String imieWystawcy, String nazwiskowystawcy, int dzienWystawienia, int mieisacnWystawienia, int rokWystawienia, String imieKupującego, String nazwiskoKupującego, String nazwaArtykułu, int kwota) {
        super(imieWystawcy, nazwiskowystawcy, dzienWystawienia, mieisacnWystawienia, rokWystawienia);
        this.imieKupującego = imieKupującego;
        this.nazwiskoKupującego = nazwiskoKupującego;
        this.nazwaArtykułu = nazwaArtykułu;
        this.kwota = kwota;
    }

    public String getImieKupującego() {
        return imieKupującego;
    }

    public void setImieKupującego(String imieKupującego) {
        this.imieKupującego = imieKupującego;
    }

    public String getNazwiskoKupującego() {
        return nazwiskoKupującego;
    }

    public void setNazwiskoKupującego(String nazwiskoKupującego) {
        this.nazwiskoKupującego = nazwiskoKupującego;
    }

    public String getNazwaArtykułu() {
        return nazwaArtykułu;
    }

    public void setNazwaArtykułu(String nazwaArtykułu) {
        this.nazwaArtykułu = nazwaArtykułu;
    }

    public int getKwota() {
        return kwota;
    }

    public void setKwota(int kwota) {
        this.kwota = kwota;
    }

    @Override
    public String toString() {
        return "UmowaSprzedaży{" +
                "imieKupującego='" + imieKupującego + '\'' +
                ", nazwiskoKupującego='" + nazwiskoKupującego + '\'' +
                ", nazwaArtykułu='" + nazwaArtykułu + '\'' +
                ", kwota=" + kwota +
                "} " + super.toString();
    }

    static public int ilePowyżej(UmowaSprzedaży [] tablica, int kwota){
        int wynik = 0;
        for (int i = 0;i < tablica.length;i++){
            if(tablica[i].kwota > kwota && tablica[i].podpisany== true){
                wynik++;
            }
        }
        return wynik;
    }
}
