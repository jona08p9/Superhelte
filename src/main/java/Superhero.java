public class Superhero {

    private String navn;
    private String helteAlias;
    private String power;
    private String origin;
    private int year;
    private double strength;

    public Superhero(String navn, String helteAlias, String power, String origin, int year, double strength){
        this.navn = navn;
        this.helteAlias = helteAlias;
        this.power = power;
        this.origin = origin;
        this.year =  year;
        this.strength = strength;

    }
    //getter
    public String getNavn() {
        return navn;
    }
    public String getHelteAlias() {
        return helteAlias;
    }
    public String getPower() {
        return power;
    }
    public String getOrigin() {
        return origin;
    }

    public int getYear() {
        return year;
    }

    public double getStrength() {
        return strength;
    }

}
