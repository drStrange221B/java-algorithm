package com.company.emrys.algorithm.linkedlist;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

       LinkedListData<Integer> linkedList = new LinkedListData<>();
       linkedList.add( new Node(5));
        linkedList.add( new Node(5));
        linkedList.add( new Node(6));

        System.out.println(linkedList.getSize());
        System.out.println(linkedList.getElementCount());

        System.out.println(linkedList.toString());

        System.out.println(linkedList.contains(6));
        System.out.println(linkedList.contains(10));

        linkedList.insertAtN(2,10);

        System.out.println(linkedList.toString());

        linkedList.deleteNth(2);
        System.out.println(linkedList.toString());


        System.out.println(13%10);


    }
}
