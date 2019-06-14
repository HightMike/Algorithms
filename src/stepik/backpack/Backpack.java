package stepik.backpack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Backpack {

    class Item {
        int cost;
        int weight;

        private Item (int cost, int weight) {
            this.cost=cost;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "cost=" + cost +
                    ", weight=" + weight +
                    '}';
        }
    }

    public void run() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        String[] seg = str.split(" ");
        int n = Integer.parseInt(seg[0]);
        int W = Integer.parseInt(seg[1]);
        int i =0;
        Item[] items = new Item[n];
        while (bufferedReader.ready()) {

            String s = bufferedReader.readLine();
            items[i] = new Item(Integer.parseInt(s.split(" ")[0]), Integer.parseInt(s.split(" ")[1]));
            i++;
        }
        Arrays.sort(items, new Comparator<Item>() { // -1 - если первый объект меньше, 1 если больше и 0 если равны
            @Override
            public int compare(Item it1, Item it2) {
                double r1 = (double)it1.cost/it1.weight;
                double r2 = (double)it2.cost/it2.weight;
                return -Double.compare(r1,r2); // сортируем по убыванию
            }
        });
        double result =0;
        for (Item item: items) {
            if (item.weight<=W) {
                result+=item.cost;
                W-=item.weight;
            }
            else {
                result+=(double)item.cost*W/item.weight;
                break;
            }
        }
        for (Item m:items) {
            System.out.println(m);
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException{
        Backpack backpack = new Backpack();
        backpack.run();
    }
}
