package my.city;

public  class HumpbackWhale extends Whale{

    public HumpbackWhale(String str) {
        super(str);
    }

    @Override
    protected void sing() {

        System.out.println("This is Humpbackwhale in the sam epackage " + str);
    }

    public static void main(String[] args) {
        Whale whale = new HumpbackWhale("Hello");
        whale.sing();
    }
}