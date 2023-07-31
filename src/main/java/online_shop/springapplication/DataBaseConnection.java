package online_shop.springapplication;

import javax.xml.crypto.Data;

public class DataBaseConnection {
    private String host;
    private final String usrename;
    private String username;
    private String password;

    public DataBaseConnection(String host, String usrename, String password){
        this.host = host;
        this.usrename = usrename;
        this.password = password;
    }
}
