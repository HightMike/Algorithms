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
        SortedSet<Integer> setL = new TreeSet<>();


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
        setL.addAll(sortedMapL.keySet());


        try {
            for (Map.Entry<Integer, Integer> mapR : sortedMapR.entrySet()) {
                for (Map.Entry<Integer, Integer> mapL : sortedMapL.entrySet()) {
                    if (mapR.getKey()>=mapL.getKey() && !mapR.getValue().equals(mapL.getValue())) {
//                        RemoveWithValue(sortedMapL,mapL.getValue());
//                        RemoveWithValue(sortedMapR,mapR.getValue()+1);
                        //RemoveFromSet(setR, mapR.getKey());
                    }
//                    else if (mapR.getValue().equals(mapL.getValue())){
//                        RemoveWithValue(sortedMapL,mapL.getValue());
//                    }

                }
            }
        } catch (Exception e) {

        }
        System.out.println(sortedMapR.keySet());
//        System.out.println(setR.size());
//        for (Integer integer:setR) {
//            System.out.print(integer+" ");
//        }


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

    public static void RemoveWithValue(SortedMap<Integer, Integer> map, Integer integer) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Integer i = (int) it.next();
            if (i.equals(integer)){
                it.remove();
                break;
            }
        }
    }
}
