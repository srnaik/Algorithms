package com.sac.inheritance;

 public class Shark extends Fish{

    private int numberOfFins = 8;
    protected int tailLength = 100;

    public Shark(int age){
        super(age);
        size = 4;
    }

    public static void helloShark(){
        System.out.println("Hello Shark");
    }

    public void displaySharkDetails(){
        System.out.println("Shark with age: " + super.getAge());
        System.out.println("And: " + super.size + " Meteres long");
        System.out.println("with: " + this.numberOfFins + " fins");
    }

    @Override
    public void displayTailEnd() {
        System.out.println(tailLength + " " + super.tailLength);
    }

    public static void main(String[] args) {
        Fish fish = new Shark(10);
        fish.helloShark();
        System.out.println(fish.tailLength);
        fish.displayTailEnd();
        Shark shark = (Shark) fish;
        System.out.println(shark.tailLength);
    }


}


 class Fish{

    protected int tailLength = 10;

    protected int size;
    private int age;

    public Fish(int age){
        this.age = age;
    }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     protected static void helloShark(){
         System.out.println("Hello Fish");
     }

     public void displayTailEnd(){
         System.out.println(tailLength);
     }
 }