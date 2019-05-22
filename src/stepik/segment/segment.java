package stepik.segment;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class segment {

    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(bufferedReader.readLine());
        int k=0;
        List<Integer> list = new ArrayList<>();

        while (k<first) {
            k++;
            String str = bufferedReader.readLine();
            String[] seg = str.split(" ");
            int one = Integer.parseInt(seg[0]);
            int two = Integer.parseInt(seg[1]);
            list.add(one);
            list.add(two);
        }
        System.out.println(list);
    }

    public static void choose(List<Integer> list, Integer n) {
        int i=1;

        for (int l=1; l<list.size();l=l+2) {

            if (list.get(i)>=list.get(l+1)) {
                n++;

            }
        }

    }




}
