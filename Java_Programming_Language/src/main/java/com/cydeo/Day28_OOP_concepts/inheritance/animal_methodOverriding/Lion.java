package com.cydeo.Day28_OOP_concepts.inheritance.animal_methodOverriding;

public class Lion extends Animal{

    private boolean isAfricanLion;

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);//parent constructor
       setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }


    @Override
    public void eat() {
        System.out.println("Lion " + getName() + " is eating deer");
    }

    public void roar(){
        System.out.println("Lion " + getName() + " is roaring");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") + //another way of calling toString()->using super.
//        return getClass().getSimpleName() + "{" +
//                "name='" + getName()+ '\'' +
//                ", breed='" + getBreed() + '\'' +
//                ", gender=" + getGender() +
//                ", age=" + getAge() +
//                ", size='" + getSize() + '\'' +
//                ", color='" + getColor() + '\'' +
                ", AfricanLion='" + isAfricanLion + '\'' +
                '}';
    }
}
