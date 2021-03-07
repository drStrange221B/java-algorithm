package com.company.emrys.algorithm.linkedlist;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {

       LinkedList<Integer> linkedList = new LinkedList<>();
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
    }
}
