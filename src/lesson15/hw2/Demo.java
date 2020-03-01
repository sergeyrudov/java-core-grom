package lesson15.hw2;

public class Demo {

    public static void main(String[] args) {
        Room room1 =  new Room(123,111,3,null,"ABC","Kharkov");
        Room room2 =  new Room(456,222,4,null,"DEF","Kiev");
        Room room3 =  new Room(789,333,5,null,"G","Dnepropetrovsk");
        Room room4 =  new Room(001,444,6,null,"342rg","Kherson");

        Room[] allRooms = {room1,room2,room3,room4};


        System.out.println(removeDuplicates(allRooms)[0]);
        System.out.println(removeDuplicates(allRooms)[1]);
        System.out.println(removeDuplicates(allRooms)[2]);
        System.out.println(removeDuplicates(allRooms)[3]);
    }


    public static Room[] removeDuplicates(Room[] array){
        if(array.length == 1)
            return array;
        if(array.length == 0)
            return new Room[0];
        int unique = 1;
        for(int i = 1; i < array.length; i++){
            if(array[i] != array[i - 1]){
                unique++;
            }
        }
        Room[] result = new Room[unique];
        int r = 0;
        if(result.length > 0){
            result[r++] = array[0];
        }
        for(int i = 1; i < array.length; i++){
            if(array[i] != array[i - 1]){
                result[r++] = array[i];
            }
        }
        return result;
    }
}
