public class Dokument {
    private String imieWystawcy;
    private String nazwiskowystawcy;
    private int dzienWystawienia;
    private int mieisacnWystawienia;
    private int rokWystawienia;
    boolean podpisany;

    public Dokument(){

    }

    public Dokument(String imieWystawcy, String nazwiskowystawcy, int dzienWystawienia, int mieisacnWystawienia, int rokWystawienia) {
        this.imieWystawcy = imieWystawcy;
        this.nazwiskowystawcy = nazwiskowystawcy;
        this.dzienWystawienia = dzienWystawienia;
        this.mieisacnWystawienia = mieisacnWystawienia;
        this.rokWystawienia = rokWystawienia;
        podpisany = false;
    }


    public String getImieWystawcy() {
        return imieWystawcy;
    }

    public void setImieWystawcy(String imieWystawcy) {
        this.imieWystawcy = imieWystawcy;
    }

    public String getNazwiskowystawcy() {
        return nazwiskowystawcy;
    }

    public void setNazwiskowystawcy(String nazwiskowystawcy) {
        this.nazwiskowystawcy = nazwiskowystawcy;
    }

    public int getDzienWystawienia() {
        return dzienWystawienia;
    }

    public void setDzienWystawienia(int dzienWystawienia) {
        this.dzienWystawienia = dzienWystawienia;
    }

    public int getMieisacnWystawienia() {
        return mieisacnWystawienia;
    }

    public void setMieisacnWystawienia(int mieisacnWystawienia) {
        this.mieisacnWystawienia = mieisacnWystawienia;
    }

    public int getRokWystawienia() {
        return rokWystawienia;
    }

    public void setRokWystawienia(int rokWystawienia) {
        this.rokWystawienia = rokWystawienia;
    }

    public void setPodpisany(boolean podpisany) {
        this.podpisany = podpisany;
    }

    public boolean isPodpisany() {
        if(podpisany == false){
            System.out.println("Podpisano Dokument");
            return !podpisany;
        }else{
            System.out.println("Dokument jest juz podpisany");
        return podpisany;
        }

    }

    @Override
    public String toString() {
        return "Dokument{" +
                "imieWystawcy='" + imieWystawcy + '\'' +
                ", nazwiskowystawcy='" + nazwiskowystawcy + '\'' +
                ", dzienWystawienia=" + dzienWystawienia +
                ", mieisacnWystawienia=" + mieisacnWystawienia +
                ", rokWystawienia=" + rokWystawienia +
                '}';
    }
}

