package com.sac;

import java.util.Stack;

public class TowersOfHanoi {

    private Towers[] towers;
    private static int counter = 0;


    class Towers{

         Stack<Integer> disks;
        private int index;

        public Towers(int index){
            disks = new Stack<>();
            this.index = index;
        }


        public void add(int n){
            if(!disks.isEmpty() && disks.peek() <= n){
                System.out.println("Disk addition is not possible");
            }else{
                disks.push(n);
            }
        }

        public void moveToTop(Towers destination){
            int disk = disks.pop();
            destination.add(disk);
        }

        public  void moveDisks(int n, Towers destination, Towers buffer){

            if(n>0) {
                counter++;
                moveDisks(n - 1, buffer, destination);
                moveToTop(destination);
                buffer.moveDisks(n - 1, destination, this);
            }

        }

    }

    public static void main(String[] args) {
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        towersOfHanoi.ComputeTowerOfHanoi(3);

        System.out.println("Disks in Destination");
        System.out.println(towersOfHanoi.towers[2].disks.peek());
        System.out.println("Counter" + counter);

    }

    public void ComputeTowerOfHanoi(int n) {

      towers = new Towers[n];

        for(int i = 0; i < n; i++){
            towers[i] = new Towers(i);
        }

        for(int i = n-1; i >= 0; i--){
            towers[0].add(i);
        }

        towers[0].moveDisks(n,towers[2],towers[1]);
    }


}
