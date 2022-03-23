package src.arraylists;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryLists = new ArrayList<>();

    public ArrayList<String> getGroceryLists() {
        return groceryLists;
    }

    public void addGroceryItems(String item) {
        groceryLists.add(item);
    }

    private int findGroceryItem(String searchItem) {
        return groceryLists.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findGroceryItem(searchItem);
        return position >= 0;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryLists.size() + " items in your grocery lists");
        for (int i = 0; i < groceryLists.size(); i++) {
            System.out.println((i + 1) + ". " + groceryLists.get(i));
        }
    }

    public void updateGroceryItem(String currentItem, String newItem) {
        int position = findGroceryItem(currentItem);
        if (position >= 0) {
            updateGroceryItem(position, newItem);
        }
    }

    private void updateGroceryItem(int position, String newItem) {
        groceryLists.set(position, newItem);
        System.out.println("Grocery Item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findGroceryItem(item);
        if (position < 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryLists.remove(position);
    }
}
