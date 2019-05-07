package stepik.NOD;

public class Nod {

    private int calculate (int a , int b) {

        System.out.println(a +" "+ b);

        if (a==0) {
            return b;
        }

        if (b==0) {
            return a;
        }

        if (a>=b) {
            return calculate(a%b, b);
        }
        else {
            return calculate(a, b%a);
        }

    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        Nod nod = new Nod();
        System.out.println(nod.calculate(12234234,23434));

        long finish = System.currentTimeMillis();

        System.out.println("Метод отработал за: " + (finish-start) + " ms");

    }

}
