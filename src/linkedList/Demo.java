package src.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<>();
        addInOrder(placeToVisit, "Canada");
        addInOrder(placeToVisit, "Russia");
        addInOrder(placeToVisit, "Portugal");
        addInOrder(placeToVisit, "Germany");
        addInOrder(placeToVisit, "Germany");

        printList(placeToVisit);

        addInOrder(placeToVisit, "Germany");
        addInOrder(placeToVisit, "Portugal");
        printList(placeToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
//        Iterator<String> i = linkedList.iterator();
//        while(i.hasNext()) {
//            System.out.println("Now visiting "+ i.next());
//        }
        for (String s : linkedList) {
            System.out.println("Now visiting " + s);
        }
        System.out.println("=================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0 ){
                // no room for duplicate
                System.out.printf("%s is already included \n", newCity);
                return false;
            } else if (comparison > 0) {
                // new city should be inserted after the current
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
}
