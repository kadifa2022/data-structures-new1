package com.cydeo.Day28_OOP_concepts.encapsulation;

public class Student {
   private String name;//we use private to

    private int age;//restricting with private access modifier

    public String getName() {
        if(name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {//takes one argument
        boolean hasDigit = false;
        for(char each: name.toCharArray()){//condition
            if (Character.isDigit(each)) {
                hasDigit = true;
                break;
            }
        }
        if(hasDigit){
            System.err.println("Invalid name:" + name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge(){ //READ ONLY
        if(age == 0){
            System.err.println("Age has been  not set");
            System.exit(1);
        }
        return age;
    }

    public void setAge(int age){//WRITE ONLY
        if(age < 1 || age > 100){//condition-if age ids invalid
            System.out.println("Invalid age:" +age);
         //   return;//exiting the method
            System.exit(1);//program gets terminated

        }
        this.age = age;

    }

}
