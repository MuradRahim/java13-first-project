package opp;

public class Human extends AbstractHuman {
    private String colorOfHair;
    private String tall;
    private String city;
    private String colorOfEyes;

    @Override
    void sayAboutYourself() {
        System.out.println("I am " + super.getFirstName() + " " + super.getLastName());
        System.out.println("I live in "+ city);
    }

    public String getColorOfHair() {
        return colorOfHair;
    }

    public void setColorOfHair(String colorOfHair) {
        this.colorOfHair = colorOfHair;
    }

    public String getTall() {
        return tall;
    }

    public void setTall(String tall) {
        this.tall = tall;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getColorOfEyes() {
        return colorOfEyes;
    }

    public void setColorOfEyes(String colorOfEyes) {
        this.colorOfEyes = colorOfEyes;
    }
}
