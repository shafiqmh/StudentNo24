package com.qa.practicesql;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class DBManager {
	Constants c = new Constants();
	
    Connection conn = null;
    Statement stmt = null;
        String sql;

    
    Scanner input = new Scanner(System.in);
    
    
    public void access_db() throws ClassNotFoundException, SQLException {
        Class.forName(c.JDBC_DRIVER);
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(c.DB_URL,c.USER,c.PASS);
        System.out.println("Creating statement...");
        stmt = conn.createStatement();
        System.out.println("Enter name of database you wish to access:");
        String dbname = input.next();
        stmt.executeUpdate("USE " + dbname);
    }
    
    public void create_all() throws SQLException {
    	System.out.println("Inserting records into the table...");
    	try {
            System.out.println("Enter name of team you wish to add:");
            String team = input.next();
            System.out.println("Enter popularity level (0-9) of the new team:");
            int popularity = input.nextInt();
    		String sql = "INSERT INTO footyteams(team, popularity) VALUES('"+team+"', '"+popularity+"')";
    		stmt.executeUpdate(sql);
    		System.out.println("Records Inserted");
    		}
    	catch (SQLException sqle) {
    		sqle.printStackTrace();
    	}
    }
		
		public void read_all() {
			sql = "SELECT * FROM footyteams";
			try {
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					int id  = rs.getInt("id");
					String team = rs.getString("team");
					int popularity = rs.getInt("popularity");
					//Display values
					System.out.print("ID: " + id + " Team: " + team + " Popularity " + popularity + "\r\n");
					}
				rs.close();
				}
			catch (SQLException sqlex) {
				sqlex.printStackTrace();
			}
		}
		
		public void updateRecord() {
			System.out.println("Creating statement...");
			try {
				
	            System.out.println("Enter name of the field you wish to update:");
	            String field_name = input.next();
	            System.out.println("Enter desired change:");
	            String change_made = input.next();
	            System.out.println("Enter id you wish to change:");
	            String id_ = input.next();
				
				
				String sql = "UPDATE footyteams SET '"+field_name+"' = '"+change_made+"' WHERE id = '"+id_ + "'";
				/////////////////////////////////////
				stmt.executeUpdate(sql);
			}
			catch (SQLException sqlexp) {
				sqlexp.printStackTrace();
			}
		}
}

	
/*		stmt.close();
		conn.close();
	

		
	
	public void delRecord() {
		System.out.println(“Creating statement...”);
		stmt = conn.createStatement();
		String sql4 = “DELETE FROM Languages ” + “WHERE id = 1”;
		stmt.executeUpdate(sql4);
	}*/
