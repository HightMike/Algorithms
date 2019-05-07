package stepik.NOD;

public class Nod {

    private int calculate (int a , int b) {

        System.out.println(a +" "+ b);

        int max =  Math.max(a, b);
        int min =  Math.min(a, b);




        if (a!=b && a!=0 && b!=0) {
            return calculate(min, max-min);
        }
        else if (b==0) {
            return b;
        }
        else if (a==0) {
            return a;
        }
        else {
            return a;
        }


    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        Nod nod = new Nod();
        System.out.println(nod.calculate(12234234,234234234));

        long finish = System.currentTimeMillis();

        System.out.println("Метод отработал за: " + (finish-start) + " ms");

    }

}
