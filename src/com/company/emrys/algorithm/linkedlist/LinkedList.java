package com.company.emrys.algorithm.linkedlist;

public class LinkedList<T extends Comparable> {

    private Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    //Add node at the end of the LinkedList
    public void add(Node<T> node){
        if(head !=null){
           Node<T> currentHead = this.head;

           while(currentHead.getNext() !=null){
               currentHead = currentHead.getNext();
           }
           currentHead.setNext(node);
           size++;
        }else {
            head = node;
            size++;
        }
    }

    //get the size of  LinkedList
    public int getSize(){
        return size;
    }

//    get the size of LinkedList using traversal
    public int getElementCount(){
        if(head==null)
        {
            return 0;
        }
        else{
            Node<T> current = head;
            int size = 0;

            while(current.getNext()!=null){
                current = current.getNext();
                size++;
            }
            size++;

            return size;
        }
    }
//add node to LinkedList head
    public void addHead(Node<T> node){
        Node<T> temp = head.getNext();
        head=node;
        head.setNext(temp);
    }

//    return all data in LinkedList
    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        if(head ==null){
            return null;
        }
        else{
            Node<T> current = head;

        while(current !=null) {
            stringBuilder.append(current.getData());
            current = current.getNext();

            if(current !=null) {
                stringBuilder.append(", ");
            }

         }
        }

           return stringBuilder.toString();
        }


        // Insert Node to particular index
    public boolean insertAtN(int n, T data){
        if(n>getSize()){
            return false;
        }else if(n==0){
            Node<T> node = new Node<>(data);
            Node<T> temp = head.getNext();
            node.setNext(temp);
            head = node;
            return true;
        }else{
            int i = 0;
            Node<T> current = head;
            while(i<n-1){
                current = current.getNext();
                i++;
            }
            Node<T> node = current.getNext();
            current.setNext(new Node<>(data));
            current.getNext().setNext(node);
            return true;
        }
    }

//    delete LinkedList
    public void deleteAll(){
        head = null;
    }

// check if the date or element contains in the Linked List and return the index if present else -1

    public int contains(T data){
        if(head ==null){
            return -1;
        }
        else{
            Node<T> current = head;
            int index = 0;
            while(current !=null){
                if(current.getData().equals(data))
                {
                    return index;
                }

                current = current.getNext();
                index++;
            }
        }
        return -1;
    }

//    delete element at particular index

    public void deleteNth(int n){
        if(n>getSize()){
            return;
        }else{
            Node<T> current = head;
            int index = 0;
            while(index<n-1){
                current = current.getNext();
                index++;
            }
            current.setNext(current.getNext().getNext());
        }

    }

}
