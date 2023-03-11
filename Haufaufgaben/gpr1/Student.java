public class Student extends Person {
    private String Klassenname;

    public String getKlassenname() {
        return Klassenname;
    }

    public void setKlassenname(String Klassenname) {
        this.Klassenname = Klassenname;
    }

    @Override
    public String getVorstellungstext() {
        return super.getVorstellungstext()+" us de Klass "+getKlassenname();
    }

}
