import java.util.ArrayList;
import java.util.List;

public class PlusOne {

    public void plusOne(List<Integer> digits) {
        for (int i = digits.size() - 1; i >= 0; i--) {
            int digit = digits.get(i);
            if (digit < 9) {
                digits.set(i, digit + 1);
                return;
            } else {
                digits.set(i, 0);
            }
        }
        digits.add(0);
        digits.set(0, 1);
    }


    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(9);
        list.add(9);

        plusOne.plusOne(list);
        System.out.println(list);
    }
}
