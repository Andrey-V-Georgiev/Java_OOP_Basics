package _02_DefiningClassesEX._09_Google;

class Company {
    private String companyName;
    private String department;
    private double salary;

    public Company(String companyName, String department, double salary) {
        setCompanyName(companyName);
        setDepartment(department);
        setSalary(salary);
    }

    public String getCompanyName(){
        return this.companyName;
    }

    public String getCompanyDepartment(){
        return this.department;
    }

    public double gerSalary(){
        return this.salary;
    }

    private void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private void setDepartment(String department) {
        this.department = department;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }
}
