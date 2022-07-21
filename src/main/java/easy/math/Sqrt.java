package easy.math;

public class Sqrt {

    public int sqrt(int x) {
        return (int) Math.sqrt(x);
    }

    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        int low = 1;
        int height = num;
        while (low < height) {
            int middle = low + (height - low) / 2;
            if (
                    num % low == 0 && num / low == low ||
                    num % middle == 0 && num / middle == middle ||
                    num % height == 0 && num / height == height
            ) return true;
            if (num / middle < middle ) {
                height = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return false;
    }
}
