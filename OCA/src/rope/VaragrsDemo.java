package rope;

public class VaragrsDemo {


    public void vargargs(int start, Object... nums){
        System.out.println(nums.length);
    }


    public static void main(String[] args) {
        VaragrsDemo varagrsDemo = new VaragrsDemo();
        varagrsDemo.vargargs(1,1);
    }
}
