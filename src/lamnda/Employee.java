package lamnda;

class Employee {
    private String name;
    private String secondName;
    private int age;
    private String address;
    private String phone;
    private String position;
    private double salary;

    public Employee(String name, double salary) {
        this.salary = salary;
        this.name = name;
    }

    public Employee(String name, String secondName, int age, String address, String phone, String position, double salary) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
