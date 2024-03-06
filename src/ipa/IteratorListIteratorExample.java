package ipa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorListIteratorExample {
	public static void main(String[] args) {

		List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");

        // Using Iterator for forward iteration
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("=============================");
        // Using ListIterator for bidirectional iteration
        ListIterator<String> listIterator = myList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        
        System.out.println("=============================");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
	}
}
