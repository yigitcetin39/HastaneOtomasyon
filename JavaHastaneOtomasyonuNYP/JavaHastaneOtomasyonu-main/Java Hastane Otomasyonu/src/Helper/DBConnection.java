package Helper;
import java.sql.*;
public class DBConnection {
	Connection c = null;
	/*bu s�n�f yaln�zca veritaban� ba�lant�lar� i�in kullan�lmaktad�r kod tekrar�n�n �n�ne ge�mek ve daha h�zl� �al��an bir program 
	  �retebilmek ad�na sadece ihtiya� duyulan yerlerde �al��mas� i�in
	  nesne �retilerek kullan�l�yor.
	*/
	public DBConnection() {
		
	}
	public Connection connDb() {
		try {
			this.c = DriverManager.getConnection("jdbc:mariadb://localhost:3306/hospital?user=root&password=12345"); //veritaban� ba�lant�m�z
			return c;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
}
