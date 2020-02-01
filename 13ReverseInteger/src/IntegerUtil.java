public class IntegerUtil {


    public int reverseInt(int number){

        int reverse = 0;

        while(number != 0){
            reverse = reverse * 10 + number %10;
            number /= 10;
        }
        return reverse;
    }


    public static void main(String[] args){

        IntegerUtil integerUtil = new IntegerUtil();
        int number = integerUtil.reverseInt(1334);
        System.out.println("Reversed Integer " + number);
    }
}
