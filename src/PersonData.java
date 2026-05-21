/**
 * todo Document type PersonData
 */
public class PersonData {
    String fullName;
    int age;
    double money;
    String email;

    @Override
    public String toString() {
        return "PersonData{" +
            "fullName='" + fullName + '\'' +
            ", age=" + age +
            ", money=" + money +
            ", email='" + email + '\'' +
            '}';
    }
}
