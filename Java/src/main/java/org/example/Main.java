package org.example;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many contact number do you add to contact");
        int n = sc.nextInt();
        sc.nextLine();
        String key;
        int value;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            System.out.println("Enter the name");
            key = sc.nextLine();
            System.out.println("Enter the number");
            value = sc.nextInt();
            sc.nextLine();
            map.put(key, value);
        }
        while(true){
            System.out.println("Enter the name whom do you want to find");
            String name = sc.nextLine();
            if (map.containsKey(name)) System.out.println(name
                    + "=" + map.get(name));
            else System.out.println("Not found");
        }
    }
}