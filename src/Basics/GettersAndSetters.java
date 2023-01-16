package Basics;

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class GettersAndSetters {
    public static void main (String[] args){
        Human person = new Human();
        person.setAge(18);
        person.setName("Rishabh");

        System.out.println(person.getAge() + " : " + person.getName());
    }
}
