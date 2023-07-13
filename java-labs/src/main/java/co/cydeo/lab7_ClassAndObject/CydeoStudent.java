package co.cydeo.lab7_ClassAndObject;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public boolean isEmployed;
    public boolean isMarried;
    public String batch;
    public int groupNumber;
    public String programingLanguage;

    public void setInfo(String name, int age, char gender, boolean isEmployed, boolean isMarried, String batch, int groupNumber, String programingLanguage) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isEmployed = isEmployed;
        this.isMarried = isMarried;
        this.batch = batch;
        this.groupNumber = groupNumber;
        this.programingLanguage = programingLanguage;
    }

    public void study(){
        System.out.println(name + "is studying " +programingLanguage);
    }

    @Override
  public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batch='" + batch + '\'' +
                ", programingLanguage='" + programingLanguage + '\'' +
                '}';
    }
}
