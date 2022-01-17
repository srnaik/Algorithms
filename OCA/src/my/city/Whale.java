package my.city;

public abstract class Whale {

    protected String str = "Parent class";

    public Whale(String str){
        this.str = str;
    }


    protected abstract void sing();
}
