package com.codegym;

public class MyArrayListTest {
    public static void main(String[] args) {
        Mylist<String> list = new MyArrayList<>();
        list.addElement("Hung");
        list.addElement("Dinh");
        list.addElement("Duc");
        list.add(4,"Duc");

        System.out.println("Pre-List:");
        printList(list);

        list.remove(2);

        System.out.println("After-List:");
        printList(list);
    }

    private static void printList(Mylist list){
        System.out.println("--------List items----------");
        for (int i = 0; i < list.lastIndexOf(); i++){
            System.out.print(list.get(i) + ", ");
        }
        System.out.print(list.get(list.lastIndexOf())+".");
        System.out.println();
    }

}
