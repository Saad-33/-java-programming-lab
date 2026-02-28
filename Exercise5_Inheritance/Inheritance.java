package oops;

public class Inheritance {
    public static void main(String[] args) {
       Animal generic=new Animal("Generic");
       generic.speak();
       Dog d=new Dog("Buddy","Alice");
       d.speak();
       d.play();
       d.info();
       d.wagtail();
       Animal pet= new Dog("Rex","Bob");
       pet.speak();
       
       if (pet instanceof Pet) {
    	   ((Pet) pet).play();
           System.out.println("2462618");
       }
    }
}