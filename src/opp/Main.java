package opp;

public class Main {

    public static void main(String[] args) {
        Student student2 = new Student("Ажы", "Касымов", 24, "М", 2);

        student2.setYearOfStudy("01.07.2023-01.07.2028");
        student2.setBirthDate("02.07.2000");
        student2.setFaculty("Programming");
        student2.setBudget(true);

        student2.showInfo();
    }
}