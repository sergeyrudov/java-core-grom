package lesson11.biginterfaceexample;

public class SimpleReader implements Readable {

    //Class object = new
    //object.
    //null - empty object

    static String test;

    public static void main(String[] args) {
        System.out.println(test);
        // null pointer exception appears if user tries to call methods with empty object
    }


    @Override
    public void readFilesFromStorage(Storage storage) {
        for (File file : storage.getFiles()) {
            if (file != null)
                System.out.println(file.getName());
            else
                System.out.println(file);
        }
    }
}
