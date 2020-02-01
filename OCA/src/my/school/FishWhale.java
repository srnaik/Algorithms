package my.school;

import my.city.Whale;

public class FishWhale extends Whale{

    public FishWhale(String str) {
        super(str);
    }

    @Override
    public void sing() {
        System.out.println("This is FishWhale");
    }

    public static void main(String[] args) {
        Whale whale = new FishWhale("Hello From Fish Whale");
    }
}
