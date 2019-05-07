package stepik.NOD;

public class Nod {

    private int calculate (int a , int b) {

        int max =  Math.max(a, b);

        int result = 0;

        for (int i=1; i<=max; i++) {
            if (a%i==0 && b%i==0) {
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Nod nod = new Nod();
        System.out.println(nod.calculate(1234234232,426423423));

        long finish = System.currentTimeMillis();

        System.out.println("Метод отработал за: " + (finish-start) + " ms");

    }

}
