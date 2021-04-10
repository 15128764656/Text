package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
 /**
 * <p>Description:DbUtil.java</p>
 * @author jzy
 * @version v1
 * @date 2021年1月5日 上午10:34:37
 */
public class DbUtil {
	public static Connection getCon(){
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:orcl","root","root");
			System.out.println("conn="+conn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) {
		getCon();
	}
}
