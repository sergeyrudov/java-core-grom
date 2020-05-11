package lesson19.HW;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception {
        File file1 = new File(10000000, "music", "mp3", 720);
        File file2 = new File(20000000, "text", "txt", 21);
        File file3 = new File(30000000, "video", "dvd", 1080);
        File file5 = new File(50000000, "audio", "mp3", 720);

        File[] files = {file1, file2, file3};
        File[] files2 = {file5, null};

        String[] formats = {"mp3", "mp4", "txt", "dvd", "jpeg"};

        Storage storage = new Storage(12311344, files, formats, "Test1", 1000);
        Storage storage2 = new Storage(31541344, files, formats, "Test2", 2000);
        Storage storage3 = new Storage(31265344, files, formats, "Test3", 3000);

        Storage[] storages = {storage, storage2};

        File newFile = new File(423426631, "picture", "jpeg", 4000);

        Controller controller = new Controller();

        System.out.println(Arrays.toString(storage.getFiles()));
        System.out.println();
        System.out.println(Arrays.toString(storage2.getFiles()));
        System.out.println();
        controller.transferAll(storage,storage2);
        System.out.println(Arrays.toString(storage3.getFiles()));

    }
}
