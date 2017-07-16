package Model;

import Client.LoginFrame;

/**
 * Created by Lee on 2015-05-03.
 */
public class Main {

    public static final int portDB = 3306;
    public static final int portChat = 561;
    public static final int portUpload = 562;
    public static final int portPlay = 563;
    public static final int portDelete = 566;

    public static final String ip = "localhost";

    public static final String driverName = "org.mariadb.jdbc.Driver";
    public static final String DBurl = "jdbc:mariadb://"+ip+":"+portDB+"/MusicManage";
    public static final String subUrl = "jdbc:mariadb://"+ip+":"+portDB+"/mysql";
    public static final String rootId = "root";
    public static final String rootPassword = "qwe098";


    public static final String fileRoot = "/root/Server/MusicManager";
    public static void main(String[] args){
        LoginFrame frm = new LoginFrame();
    }
}
