package stepik.fibonachi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class fibonachi {

    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) throws Exception{


        arrayList.add(0);
        arrayList.add(1);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        fibonachi fibonachi = new fibonachi();
        System.out.println(arrayList.get(1));
        System.out.println(fibonachi.calculate(n));

    }



    public int calculate(Integer n) {

        if (n==1) {
            return 1;
        }

        else {
            int k = 0;

            for ( int i = 2; i<=n; i++) {

                k = arrayList.get(i-1) + arrayList.get(i-2);
                arrayList.add(k);

            }
            return k;
        }
    }
}
