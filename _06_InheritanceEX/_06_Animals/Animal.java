package _06_InheritanceEX._06_Animals;

class Animal {
    private String type;
    private String name;
    private int age;
    private String gender;

    public Animal() {
    }

    public Animal(String type, String name, String age, String gender) throws Exception {
        setType(type);
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getType() {
        return this.type;
    }

    private void setType(String type) throws Exception {
       if(type.isEmpty()){
           throw new Exception();
       }
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) throws Exception {
        if(name.isEmpty()){
            throw new Exception();
        }
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(String age) throws Exception {
        if(age.isEmpty() || Integer.parseInt(age) < 0){
            throw new Exception();
        }
        this.age = Integer.parseInt(age);
    }

    public String getGender() {
        return this.gender;
    }

    private void setGender(String gender) throws Exception {
        if(gender.equals("Male") || gender.equals("Female")){
            this.gender = gender;
        } else {
            throw new Exception();
        }
    }

    public String getData(){
        return String.format("%s %d %s", this.name, this.age, this.gender);
    }

    public void produceSound() {
        System.out.println("Not implemented!");
    }
}
