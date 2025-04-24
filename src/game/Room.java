package game;

import java.util.ArrayList;

public class Room {
    private Room northRoom;
    private Room eastRoom;
    private Room southRoom;
    private Room westRoom;

    private String name;
    private String description;
    private ArrayList<Item> items;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    // Convenience methods for creating and adding Item
    public void addItem(String description) {
        this.addItem(new Item(description));
    }

    // Convenience methods for creating and adding Item with custom short name
    public void addItem(String description, String name) {
        this.addItem(new Item(description, name));
    }

    public Room getNorthRoom() {
        return this.northRoom; //TODO
    }

    public void setNorthRoom(Room northRoom) {
        this.northRoom = northRoom;
       //TODO
    }

    public Room getEastRoom() {
        return eastRoom; //TODO
    }

    public void setEastRoom(Room eastRoom) { this.eastRoom = eastRoom;
        //TODO
    }

    public Room getSouthRoom() {
        return southRoom; //TODO
    }

    public void setSouthRoom(Room southRoom) { this.southRoom = southRoom;
       //TODO
    }

    public Room getWestRoom() {
        return westRoom; //TODO
    }

    public void setWestRoom(Room westRoom) { this.westRoom = westRoom;
        //TODO
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Item removeItem(String itemName) {
        if (itemName == null || itemName.trim().isEmpty()) {
            return null;
        }

        Item itemToBeRemoved = findItem(itemName);
        if (itemToBeRemoved != null) {
            items.remove(itemToBeRemoved);
            return itemToBeRemoved;
        }
        return null;
    }

    public Item findItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {

                return item;
                //TODO
            }
        }
        return null;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
