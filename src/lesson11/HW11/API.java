package lesson11.HW11;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAllRooms();
}


//starting from java v8 - default
// or private с 9 версии TDD