package bounds;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BoundsExample {


    class Flyer {
        void fly(){

        };
    }

    class HangGlider extends Flyer{

        @Override
        public void fly() {

        }
    }

    class Goose extends Flyer {

        @Override
        public void fly() {

        }
    }

    class Value<T> {

    }

    private void UnBoundedWilCard(List<?> unboundedList){

        for (Object object: unboundedList) {
            System.out.println(object);
        }
    }

    private void groupOfFlyers(List<? extends Flyer> flyer){
        for (Flyer o: flyer) {
            System.out.println(o);
        }
    }


    private void lowerBoundWildCard(List<? super Flyer> flyerList, BoundsExample boundsExample){

        if(flyerList != null){
            flyerList.add(boundsExample.new Goose());
            flyerList.add(boundsExample.new Flyer());
        }

        for (Object o: flyerList) {
            System.out.println("Lower Bound "+ o);
        }
    }
    public static void main(String[] args) {
        BoundsExample boundsExample = new BoundsExample();
        List<String> keywords = new ArrayList<>();
        keywords.add("Hello World");
        boundsExample.UnBoundedWilCard(keywords);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        boundsExample.UnBoundedWilCard(integerList);

        LinkedList linkedList = new LinkedList();

        integerList.iterator();

        List list = new ArrayList();
        list.add(boundsExample.new HangGlider());
        boundsExample.groupOfFlyers(list);
        boundsExample.lowerBoundWildCard(list,boundsExample);
    }


}
