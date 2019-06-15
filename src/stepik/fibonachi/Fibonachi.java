package stepik.fibonachi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Fibonachi {

    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) throws Exception{


        arrayList.add(0);
        arrayList.add(1);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        Fibonachi fibonachi = new Fibonachi();
        //System.out.println(arrayList.get(1));
        System.out.println(fibonachi.calculate(n));

    }

    public int calculate(Integer n) {

//        double f = 1/Math.sqrt(5)* ( Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n));
//        return (int) f%10;

        int f = 0;

        for (int i=2; i<=n;i++) {
            f = (arrayList.get(i-1))%10 + (arrayList.get(i-2))%10;
            arrayList.add(f);
        }
        return f%10;
    }
}
