package CompositePattern;

import java.util.ArrayList;

public class Box implements Component {
    String name;
    ArrayList<Component> contents;

    public Box(String name) {
        this.name = name;
        this.contents = new ArrayList<>();
    }

    @Override
    public double getTotalCost() {
        int totalCost = 0;
        for (Component c : contents) {
            totalCost += c.getTotalCost();
        }
        return totalCost;
    }

    @Override
    public int getTotalInventoryCount() {
        int count = 0;
        for(Component c  : contents) {
            count += c.getTotalInventoryCount();
        }
        return count;
    }

    public void showItems() {
        System.out.println("Opening " + name);
        System.out.println(name + " contains: ");
        for(Component c : contents) {
            c.showItems();
        }
    }

    public void addItem(Component item) {
        contents.add(item);
    }

    public void removeItem(Component item)  {
        contents.remove(item);
    }

}
