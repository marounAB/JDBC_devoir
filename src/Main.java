
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/devoir";
		
		try {
			Connection cx = DriverManager.getConnection(url, "root", "12345");
			Statement statement = cx.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM Students");
			while (result.next()) {
				System.out.println("firstname = " + result.getString("firstname") + " lastname = " + result.getString("lastname"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
