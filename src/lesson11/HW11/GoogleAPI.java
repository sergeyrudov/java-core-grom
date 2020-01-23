package lesson11.HW11;

public class GoogleAPI implements API {
    private Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] getRooms = getAllRooms();
        int i = 0;
        for (Room room : getRooms) {
            if (room.getHotelName() == hotel && room.getCityName() == city && room.getPrice() == price && room.getPersons() == persons) {
                i++;
            }
        }

        Room[] roomsFound = new Room[i];
        i = 0;

        for (Room room : getRooms) {
            if (room.getHotelName() == hotel && room.getCityName() == city && room.getPrice() == price && room.getPersons() == persons) {
                roomsFound[i] = room;
                i++;
            }
        }
        return roomsFound;
    }

    @Override
    public Room[] getAllRooms() {
        int i = 0;
        for (Room room : rooms) {
            if (room != null)
                i++;
        }

        Room[] allRooms = new Room[i];
        i = 0;

        for (Room room : rooms) {
            if (room != null) {
                allRooms[i] = room;
                i++;
            }
        }
        return allRooms;
    }

}
