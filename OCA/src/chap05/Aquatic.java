package chap05;

public interface Aquatic {

    public default int getNumberOfGrills(int input){
        return 2;
    }
}
