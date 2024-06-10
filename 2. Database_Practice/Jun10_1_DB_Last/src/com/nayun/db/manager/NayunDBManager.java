package com.nayun.db.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NayunDBManager {
		
	public static Connection connect() throws SQLException {
		String addr = "jdbc:oracle:thin:@192.168.0.125:1521:xe";
		return DriverManager.getConnection(addr, "choco", "1718");
	}
	
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();				// C, U, D때는 필요없고, R때만 필
		} catch (Exception e) {		// insert하게 되면 NullPointerException이 발생
									// 모든 exception이 잡히도록 할 것 (try-catch)
//			e.printStackTrace();	// 메시지 안보려고 ! 
		}							
		try {
			pstmt.close();
		} catch (Exception e) {
		}
		try {
			con.close();
		} catch (Exception e) {
		}
	}
}
