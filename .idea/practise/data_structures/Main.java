import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }

        System.out.println("Summe: " + sum);


        for (int i = 1; i < list.size(); i += 2) {
            list.remove(i);
        }


        for (int i = 0; i < 5; i++) {
            list.add((int) (Math.random() * 100));
        }

        System.out.println("added random numbers");

        int sum2 = 0;
        for (Integer integer : list) {
            sum2 += integer;
        }
        System.out.println("Average: " + sum2 / list.size());

        int max = 0;
        int min = 0;
        for (Integer integer : list){
            if (integer > max){
                max = integer;
            }
            if (integer < min){
                min = integer;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
        System.out.println("Reversed list: " + list);

        System.out.println("Hello world!");
    }
}