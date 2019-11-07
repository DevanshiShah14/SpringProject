package com.apex.user.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.apex.user.vo.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

@Repository
public class UserDAOImpl implements UserDAO {

	//private JdbcTemplate jdbcTemplate;

	public UserDAOImpl() {
	}

	/*public UserDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}*/

	public static Connection getConnection() throws Exception {
		Connection dbConn = null;
		try {
			String url = "jdbc:mysql://localhost:3306/test";
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbConn = DriverManager.getConnection(url, "root", "root");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			throw sqle;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return dbConn;
	}

	@Override
	public void addUser(User user) throws Exception {
		System.out.println("DAO starts");
		Connection dbConn = null;
		PreparedStatement pStmt = null;
		int rowsInserted = 0;
		try {
			dbConn = getConnection();
			pStmt = dbConn.prepareStatement("INSERT INTO information (firstname,middlename, lastname,gender, address, city,state,country,phone,bankname,account,ssn) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
			pStmt.setString(1, user.getFirstName());
			pStmt.setString(2, user.getMiddleName());
			pStmt.setString(3, user.getLastName());
			pStmt.setString(4, user.getGender());
			pStmt.setString(5, user.getAddress());
			pStmt.setString(6, user.getCity());
			pStmt.setString(7, user.getState());
			pStmt.setString(8, user.getCountry());
			pStmt.setString(9, user.getPhone());
			pStmt.setString(10, user.getBankName());
			pStmt.setString(11, user.getAccount());
			pStmt.setString(12, user.getSSN());
			rowsInserted = pStmt.executeUpdate();
			if (rowsInserted != 1) {
				throw new Exception("Error in inserting the row");
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				pStmt.close();
				dbConn.close();
			} catch (SQLException e) {
			}
		}

		System.out.println("DAO ends");
		/*
		 * Object[] oa = new Object[3]; oa[0] = user.getFirstName(); oa[1] =
		 * user.getLastName(); oa[2] = user.getMiddleName();
		 * 
		 * this.jdbcTemplate.update("INSERT INTO usr(firstname, lastname, middlename)" +
		 * " VALUES  (?,?,?)", oa);
		 */

	}


	@Override
	public void delUser(String firstName) throws Exception {
		 Connection dbConn = null;
		    PreparedStatement pStmt = null;
		    int rowsDeleted = 0;

		     try{
			dbConn = getConnection();
			pStmt = dbConn.prepareStatement("DELETE FROM information WHERE firstname = ?"); 
			pStmt.setString(1, firstName);
			
	   		rowsDeleted = pStmt.executeUpdate();

			if (rowsDeleted != 1) {
				throw new Exception("Error in deleting the row");

	   		}
		     }catch (SQLException sqle) {
			   sqle.printStackTrace();
			   throw sqle;
			}
	             catch(Exception e) {
			   e.printStackTrace();
			   throw e;
			}
		     finally {
			pStmt.close();
			dbConn.close();
		     }
			return;
		
	}

	@Override
	public ArrayList getUser() throws Exception {
		Connection dbConn = null;
	    PreparedStatement pStmt = null;
            ResultSet rs = null;
	    ArrayList personalList = new ArrayList();
	    User user = null;

	     try{
		dbConn = getConnection();
		pStmt = dbConn.prepareStatement("SELECT firstname,middlename,lastname,gender,address,city,state,country,phone,bankname,account,ssn FROM information");

   		rs = pStmt.executeQuery();

		while (rs.next()) {
			user = new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12));
			personalList.add(user);

   		}
	     }catch (SQLException sqle) {
		   sqle.printStackTrace();
		   throw sqle;
		}
             catch(Exception e) {
		   e.printStackTrace();
		   throw e;
		}
	     finally {
		rs.close();
		pStmt.close();
		dbConn.close();
	     }
		return personalList;
	}

	@Override
	public void updateUser(User user) throws Exception {
		 Connection dbConn = null;
		    PreparedStatement pStmt = null;
		    int rowsUpdated = 0;

		     try{
			dbConn = getConnection();
			pStmt = dbConn.prepareStatement("UPDATE information SET middlename = ?, lastname = ?, gender=?, address = ?, city = ?, state = ?, country = ?, phone = ?, bankname = ?,account = ?, ssn = ?  WHERE firstname=?");
			pStmt.setString(1, user.getMiddleName());
			pStmt.setString(2, user.getLastName());
			pStmt.setString(3, user.getGender());
			pStmt.setString(4, user.getAddress());
			pStmt.setString(5, user.getCity());
			pStmt.setString(6, user.getState());
			pStmt.setString(7, user.getCountry());
			pStmt.setString(8, user.getPhone());
			pStmt.setString(9, user.getBankName());
			pStmt.setString(10, user.getAccount());
			pStmt.setString(11, user.getSSN());
			pStmt.setString(12, user.getFirstName());
			rowsUpdated = pStmt.executeUpdate();

			if (rowsUpdated != 1) {
				throw new Exception("Error in updating the row");

	   		}
		     }catch (SQLException sqle) {
			   sqle.printStackTrace();
			   throw sqle;
			}
	             catch(Exception e) {
			   e.printStackTrace();
			   throw e;
			}
		     finally {
			pStmt.close();
			dbConn.close();
		     }
			return;
	}

}
