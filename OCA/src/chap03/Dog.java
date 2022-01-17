package chap03;

 class Dog extends Animal{

     private String breed;

     Dog(String name, String breed) {
         super(name);
         this.breed = breed;
     }

     public String getBreed() {
         return breed;
     }
}
