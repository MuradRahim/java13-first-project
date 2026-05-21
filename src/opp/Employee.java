package opp;

public class Employee extends AbstractHuman {
    private String address;
    private String phone;
    private String tabNumber;
    private String position;


    @Override
    void sayAboutYourself() {
        System.out.println("I am " + super.getFirstName() + " " + super.getLastName());
        System.out.println("I work like " + position + " in store");
    }




    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTabNumber() {
        return tabNumber;
    }

    public void setTabNumber(String tabNumber) {
        this.tabNumber = tabNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
