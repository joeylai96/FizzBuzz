package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000, 3,5);
        System.out.println(count);
    }

    public static int multiples(int n,int a,int b) {
        int count=0;
        for(int i=0;i<n;i++){
            boolean divisibleByA = i % a == 0;
            if (i % b == 0 || divisibleByA) {
                count++;
            }
        }
        return count;
    }
}
