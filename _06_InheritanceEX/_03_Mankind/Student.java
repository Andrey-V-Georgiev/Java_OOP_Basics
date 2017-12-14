package _06_InheritanceEX._03_Mankind;

class Student extends Human{
    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        setFacultyNumber(facultyNumber);
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    private void setFacultyNumber(String facultyNumber) {
       if(facultyNumber.length() < 5 || facultyNumber.length() > 10){
           throw new IllegalArgumentException("Invalid faculty number!");
       }
        this.facultyNumber = facultyNumber;
    }
}
