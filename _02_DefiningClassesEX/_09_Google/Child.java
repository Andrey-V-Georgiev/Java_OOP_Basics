package _02_DefiningClassesEX._09_Google;

class Child {
    private String childName;
    private String childBirthday;

    public Child(String childName, String childBirthday) {
        setChildName(childName);
        setChildBirthday(childBirthday);
    }

    public String getChildName() {
        return childName;
    }

    public String getChildBirthday() {
        return childBirthday;
    }

    private void setChildName(String childName) {
        this.childName = childName;
    }

    private void setChildBirthday(String childBirthday) {
        this.childBirthday = childBirthday;
    }
}
