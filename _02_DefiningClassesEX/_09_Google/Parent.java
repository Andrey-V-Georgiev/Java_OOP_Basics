package _02_DefiningClassesEX._09_Google;

class Parent {
    private String parentName;
    private String parentBirthday;

    public Parent(String parentName, String parentBirthday) {
        setParentName(parentName);
        setParentBirthday(parentBirthday);
    }

    public String getParentName() {
        return this.parentName;
    }

    private void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentBirthday() {
        return this.parentBirthday;
    }

    private void setParentBirthday(String parentBirthday) {
        this.parentBirthday = parentBirthday;
    }
}
