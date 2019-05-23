package stepik.segment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class segment {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(bufferedReader.readLine());
        int k = 0;
        SortedMap<Integer, Integer> sortedMapL =  new TreeMap<>();
        SortedMap<Integer, Integer> sortedMapR =  new TreeMap<>();
        Integer b = 5;
        int c = b+1;

        SortedSet<Integer> setR = new TreeSet<>();


        while (k < first) {
            k++;
            String str = bufferedReader.readLine();
            String[] seg = str.split(" ");
            int one = Integer.parseInt(seg[0]);
            int two = Integer.parseInt(seg[1]);
            sortedMapL.put(one,k);
            sortedMapR.put(two, k);
        }
        System.out.println(sortedMapL);
        System.out.println(sortedMapR);

        setR.addAll(sortedMapR.keySet());

        try {
            for (Map.Entry<Integer, Integer> mapR : sortedMapR.entrySet()) {
                for (Map.Entry<Integer, Integer> mapL : sortedMapL.entrySet()) {
                    if (mapR.getKey()>=mapL.getKey() && !mapR.getValue().equals(mapL.getValue())) {
                        RemoveFromSet(setR, mapR.getKey());
                    }
                }
            }
        } catch (Exception e) {

        }
        System.out.println(setR.size());
        for (Integer integer:setR) {
            System.out.print(integer+" ");
        }


    }

    static void RemoveFromSet(SortedSet sortedSet, Integer integer) {
            Iterator<Integer> iterator = sortedSet.iterator();

            while (iterator.hasNext()) {
                Integer n = iterator.next();
                if (integer.equals(n)) {
                    iterator.next();
                    iterator.remove();
                }
            }
    }

    public static SortedMap RemoveWithValue(SortedMap<Integer, Integer> map, Integer integer) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Integer i = (int) it.next();
            if (i.equals(integer)){
                it.remove();
                break;
            }
        }
        return map;
    }
}
