import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

class JDBCDriver
{
		
	    static Connection con;
		static Statement st;

	public static void main(String[] args) 
	{
		
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded and resister Successfully");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			System.out.println("connection done");
			System.out.println(con.getClass());
			
 
			st=con.createStatement();
			System.out.println(st.getClass());
			System.out.println("statement ready");
		
		}catch(ClassNotFoundException e1 )
		{
			System.out.println("class not found");
		}
		catch(SQLException e2 )
		{
			System.out.println("sql exception");
		}
		finally
		{
			try{
						con.commit();
					   if(con!=null)con.close();
						if(st!=null)st.close();
						
					   System.out.println("disconnect successfull");
					   
				}catch(SQLException e){
					System.out.println(e);
				}
		}
	}
}
