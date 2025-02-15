package oop.inheritance;

public class Animal {

   public  String name;
   public String bread;
   public char gender;
   public int age;
   public String size;
   public String color;

    public Animal(String name, String bread, char gender, int age, String size, String color) {
        this.name = name;
        this.bread = bread;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void sleep(){
       System.out.println(name + " is sleeping");
   }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
