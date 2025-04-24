package game;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private Room currentRoom;
    private ArrayList<Item> inventory;

    public Player() {
        inventory = new ArrayList<>();
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room startRoom) {
        this.currentRoom = startRoom;
    }

    public boolean move(Direction direction) {
        Room requestedRoom = null;

        switch (direction) {
            case NORTH:
                requestedRoom = currentRoom.getNorthRoom();
                break;
            case SOUTH:
                requestedRoom = currentRoom.getSouthRoom();
                //TODO
                break;
            case EAST:
                requestedRoom = currentRoom.getEastRoom();
                //TODO
                break;
            case WEST:
                requestedRoom = currentRoom.getWestRoom();
                //TODO
                break;
        }
        if (requestedRoom != null) { // tjekker om der faktisk er et tilgængeligt rum i den retning
            currentRoom = requestedRoom; // sætter currentRoom til requestedRoom
            return true;
        }
        return false;

        // TODO if (requestedRoom != null) make currentRoom the requestedRoom;
        // TODO return whether move was possible
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public boolean takeItem(String itemName) {
        Item pickupFromRoom = currentRoom.removeItem(itemName);
        if (pickupFromRoom != null) {
            inventory.add(pickupFromRoom);
            currentRoom.removeItem(String.valueOf(pickupFromRoom));
            return true;
        }
        return false;
    }
}
