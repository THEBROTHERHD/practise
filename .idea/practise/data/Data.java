package data;

import java.util.ArrayList;

public class Data {
    public static int[] getNumbers(int amount){
        int[] numbers = new int[amount];
        for (int i = 0; i < amount; i++) {
            numbers[i] = i;
        }
        return numbers;
    }

    public static ArrayList<Integer> getNumbersList(int amount){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    public static int[] getRandomNumbers(int amount){
        int[] numbers = new int[amount];
        for (int i = 0; i < amount; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        return numbers;
    }

    public static ArrayList<Integer> getRandomNumbersList(int amount){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        return numbers;
    }

    public static String[] getProducts(int amount){
        String[] products = new String[amount];
        for (int i = 0; i < amount; i++) {
            products[i] = "Product " + i;
        }
        return products;
    }

    public static ArrayList<String> getProductsList(int amount){
        ArrayList<String> products = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            products.add("Product " + i);
        }
        return products;
    }

}
