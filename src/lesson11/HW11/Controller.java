package lesson11.HW11;

public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room[] rooms1 = apis[0].findRooms(price, persons, city, hotel);
        Room[] rooms2 = apis[1].findRooms(price, persons, city, hotel);
        Room[] rooms3 = apis[2].findRooms(price, persons, city, hotel);

        Room[] allRooms = new Room[rooms1.length + rooms2.length + rooms3.length];

        for (int i = 0; i <= allRooms.length; i++) {
            allRooms[i] = rooms1[i];
            if (i > rooms1.length)
                allRooms[i] = rooms2[i];
            if (i > rooms1.length + rooms2.length)
                allRooms[i] = rooms3[i];
        }

        return removeDuplicates(allRooms);
    }

    public Room[] check(API api1, API api2) {

        Room[] roomsApi1 = api1.getAllRooms();
        Room[] roomsApi2 = api2.getAllRooms();

        int count = 0;
        for (Room roomApi1 : roomsApi1) {
            for (Room roomApi2 : roomsApi2) {
                if (roomApi1.getPrice() == roomApi2.getPrice() && roomApi1.getHotelName() == roomApi2.getHotelName() &&
                        roomApi1.getPersons() == roomApi2.getPersons() && roomApi1.getCityName() == roomApi2.getCityName()) {
                    count++;
                }
            }
        }

        Room[] res = new Room[count];
        int index = 0;
        for (Room roomApi1 : roomsApi1) {
            for (Room roomApi2 : roomsApi2) {
                if (roomApi1.getPrice() == roomApi2.getPrice() && roomApi1.getHotelName() == roomApi2.getHotelName() &&
                        roomApi1.getPersons() == roomApi2.getPersons() && roomApi1.getCityName() == roomApi2.getCityName()) {
                    res[index] = roomApi1;
                }
            }
        }

        return res;
    }


    public Room[] removeDuplicates(Room[] array) {
        if (array.length == 1) return array;
        if (array.length == 0) return new Room[0];

        int data = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                data++;
            }
        }
        Room[] result = new Room[data];
        int c = 0;
        if (result.length > 0) {
            result[c++] = array[0];
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                result[c++] = array[i];
            }
        }
        return result;
    }
}
