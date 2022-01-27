package classwork;

public class Student {
    private String firstName;
    private String secondName;
    private String adress;

        public Student(String firstName,String secondName,String adress) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.adress = adress;
        }
        public void compareStudent(Student two) {
            if (this.firstName.equals(two.firstName) && this.secondName.equals(two.secondName)) {
                System.out.println("Студенты одинаковые");
            }
            else {
                System.out.println("Студенты разные");
            }
        }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAdress() {
        return adress;
    }
}
