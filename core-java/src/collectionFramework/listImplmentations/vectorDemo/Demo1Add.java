package collectionFramework.listImplmentations.vectorDemo;

import java.util.Vector;

public class Demo1Add {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("abc");
        vector.add("abc");
        vector.add(null);
        vector.add(null);
        vector.add(null);
        vector.add(123);
        vector.add(true);
        System.out.println(vector);


    }
}