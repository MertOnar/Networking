package connectto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ourKonnektor {

	ArrayList<datamodel> dataContainer;
	private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;


	public ourKonnektor() {
		
		dataContainer=new ArrayList<datamodel>();
		try{
		Class.forName("com.mysql.jdbc.Driver");
        // Setup the connection with the DB
        connect = DriverManager
                        .getConnection("jdbc:mysql://localhost/feedback?"
                                        + "user=sqluser&password=sqluserpw");
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		
	}
}
