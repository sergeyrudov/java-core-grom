package lesson10.abstractfirstexample;

public class MySQLProvider extends DbProvider{

    /*public MySQLProvider(String dbHost) {
        super(dbHost);
    }*/

    @Override
    void connectToDb(){
        //logic for MySQL
    }

    @Override
    void disconnectFromDb() {

    }
}
