public class Person {
    private String name;
    private String vorstellungstext = "Ech be de ";

    /**
     * Die Person stellt sich vor.
     */

    public String getVorstellungstext() {
        return vorstellungstext+name;
    }

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
