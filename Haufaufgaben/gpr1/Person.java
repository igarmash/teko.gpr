public class Person {
    private String name;
    private String vorstellungstext = "Ech be de ";

    /**
    Ein String mit dem Vorstellungstext generieren
     */
    public String getVorstellungstext() {
        return vorstellungstext+name;
    }

    /**
    Die Person stellt sich vor
     */
    public void stellDichVor() {
        System.out.println(getVorstellungstext());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
