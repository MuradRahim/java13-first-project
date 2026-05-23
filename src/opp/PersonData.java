package opp;

/**
 * todo Document type opp.PersonData
 */
public class PersonData {
    String fullName;
    int age;
    double money;
    String email;

    @Override
    public String toString() {
        return "opp.PersonData{" +
            "fullName='" + fullName + '\'' +
            ", age=" + age +
            ", money=" + money +
            ", email='" + email + '\'' +
            '}';
    }
}
