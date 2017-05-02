package database;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ourKonnektor {

	ArrayList<datamodel> dataContainer;
	Connection connect =null;
	private PreparedStatement preparedStatement =null;
	private Statement statement = null;
	private ResultSet resultSet= null;
	
	
	public ourKonnektor(){
		
		dataContainer= new ArrayList<datamodel>();
		
		try{
			
			Class.forName("con.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://localhost/startrek?"
							+ "user-myblog&password=12345");
		} catch (ClassNotFoundException | SQLException e){
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
