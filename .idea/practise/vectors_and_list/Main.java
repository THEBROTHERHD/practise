import java.util.*;

public class Main {
    public static void main(String[] args) {
        int max = 10000000;

        Vector<String> vector = new Vector<String>();
        for (int i = 0; i < max; i++) {
            vector.add("Entry" + i);
        }
        long startTime = System.currentTimeMillis();
        for (String s : vector) {
            String s1 = s;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for first for-each loop: " + (endTime - startTime) + "ms for " + max + " entries using Vector enhanced for loop");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < vector.size(); i++) {
            String s = vector.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for first for loop: " + (endTime - startTime) + "ms for " + max + " entries using Vector for loop");

        List<String> list = vector;

        startTime = System.currentTimeMillis();
        for (String s : list) {
            String s1 = s;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for second for-each loop: " + (endTime - startTime) + "ms for " + max + " entries using List enhanced for loop");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for third for loop: " + (endTime - startTime) + "ms for " + max + " entries using List for loop");

        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < max; i++) {
            arrayList.add("Entry" + i);
        }
        startTime = System.currentTimeMillis();
        for (String s : arrayList) {
            String s1 = s;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for third for-each loop: " + (endTime - startTime) + "ms" + " for " + max + " entries using ArrayList enhanced for loop");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for fifth for loop: " + (endTime - startTime) + "ms for " + max + " entries using ArrayList for loop");
    }
}