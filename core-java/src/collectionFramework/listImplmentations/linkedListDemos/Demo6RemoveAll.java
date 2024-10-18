package collectionFramework.listImplmentations.linkedListDemos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo6RemoveAll {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(100);
        linkedList.add(100);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add("abc");
        linkedList.add("abc");
        linkedList.add(10.5f);
        linkedList.add(true);

        ArrayList removalList = new ArrayList();
        removalList.add("abc");
        removalList.add(10.5f);

        System.out.println("Before removal");
        System.out.println(linkedList);
        System.out.println("Before removal size " + linkedList.size());

        linkedList.removeAll(removalList);
        System.out.println("after removal");
        System.out.println(linkedList);
        System.out.println("After removal size " + linkedList.size());
    }
}