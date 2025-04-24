package game;

public class Map {

    private Room startRoom;

    public void buildMap() {
        //create room
        Room room1 = new Room("Outside", "forrest outside a cave - the cave-entrance splits in two different directions.");
        Room room2 = new Room("Narrow cave", "narrow cave that seems to bend up and down almost infinitely");
        Room room3 = new Room("Large grotto", "large grotto with an opening very far above where sunlight shines through.");
        Room room4 = new Room("A crystal hallway ", "A crystal hallway with crystals protruding from the walls, ceiling and floor");
        Room room5 = new Room("Forgotten camp", "scattered remains of an old expedition — broken gear and burnt-out torches litter the ground.");
        Room room6 = new Room("Flooded passage", "ankle-deep, icy water slows your steps — something just brushed past your leg.");
        Room room7 = new Room("Mushroom grove", "bioluminescent fungi light the room in shifting purples and blues.");
        Room room8 = new Room("Collapsed hallway", "piles of rubble block most paths, but a narrow crawlspace remains.");
        Room room9 = new Room("Ancient sanctum", "a stone altar stands in the center, inscribed with runes and old blood.");
        //create items
        room1.addItem("an old rusty flashlight", "flashlight");
        room1.addItem("a crinkly paper map with a big X in the middle", "map");
        room2.addItem("a dusty old clock, with the hands pointing to 03:00", "clock");
        room3.addItem("a wicker bird cage", "birdcage");
        room4.addItem("a shard of crystal pulsing with a soft blue light", "crystal");
        room5.addItem("a waterlogged journal with unreadable ink", "journal");
        room6.addItem("a bottle filled with oddly warm cave water", "strange bottle");
        room7.addItem("a glowing mushroom that gently twitches", "glowing mushroom");
        room8.addItem("a pickaxe stuck in a crack, handle snapped", "broken pickaxe");
        room9.addItem("a ritual dagger with dried blood in the grooves", "ritual dagger");
        //TODO create rest of the 9 rooms in cave

        // Connect rooms
        room1.setNorthRoom(room2); // Outside -> Narrow Cave
        room2.setEastRoom(room3);  // Narrow Cave -> Large Grotto
        room3.setSouthRoom(room4); // Grotto -> Crystal Hallway
        room4.setSouthRoom(room5); // Crystal Hallway -> Forgotten Camp
        room5.setSouthRoom(room6); // Forgotten Camp -> Flooded Passage
        room6.setWestRoom(room7);  // Flooded Passage -> Mushroom Grove
        room6.setEastRoom(room8);  // Flooded Passage -> Collapsed Hallway
        room8.setSouthRoom(room9); // Collapsed Hallway -> Ancient Sanctum
        //TODO connect all rooms according to the specified map

        startRoom = room1;
        //TODO Set start room to room1
    }

    public Room getStartRoom() {
        return startRoom;
    }
}
