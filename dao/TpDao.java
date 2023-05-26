package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.dto.StudentTp;
import com.jsp.helper.HelperClass;

public class TpDao {
	HelperClass helperClass=new HelperClass();
	Connection connection=null;
  
	//save
	
	public StudentTp saveStudentTp(StudentTp studentTp) {
		connection=helperClass.getConnection();
		String sql="INSERT INTO tp values(?,?,?)";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, studentTp.getId());
			preparedStatement.setString(2, studentTp.getName());
			preparedStatement.setString(3, studentTp.getEmail());
			
			preparedStatement.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}return studentTp;
	}
	//delete
		
		public boolean deleteStudentTpById(int id) {
			connection=helperClass.getConnection();
			String sql="DELETE FROM tp WHERE id=?";
			boolean res=false;
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setInt(1, id);
			
			int res2=	preparedStatement.executeUpdate();
			if(res2>0) {
				res=true;
			}
			else {
				res=false;
			}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}return res;
		}
			
		//update
			
			public boolean updateStudentTpById(int id, String email) {
		       connection=helperClass.getConnection();
		       String sql="UPDATE tp set id=? email=?";
		       
		       try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, email);

				preparedStatement.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}return true;
		       
			}
			
	// GetAll
			
			public List<StudentTp> getAllStudent(){
				connection=helperClass.getConnection();
				String sql="SELECT * FROM tp";
		        ArrayList<StudentTp> al=null;
		        
				try {
					PreparedStatement preparedStatement=connection.prepareStatement(sql);
				ResultSet resultSet=    preparedStatement.executeQuery();
				al=new ArrayList<>();
				while(resultSet.next()) {
					int id=resultSet.getInt(1);
					String name=resultSet.getString(2);
					String email=resultSet.getString(3);
					StudentTp s=new StudentTp();
					s.setId(id);
					s.setName(name);
					s.setEmail(email);
					al.add(s);
					
				}
				
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return al;
			} 
			
	//Get Any One
			
			public StudentTp getStudentById(int id) {
				connection=helperClass.getConnection();
				String sql="SELECT * FROM tp WHERE id=?";
				StudentTp s2=new StudentTp();
				
				try {
					PreparedStatement preparedStatement=connection.prepareStatement(sql);
					preparedStatement.setInt(1, id);
					
				ResultSet resultSet=	preparedStatement.executeQuery();
				while(resultSet.next()) {
					int id2=resultSet.getInt(1);
					String name=resultSet.getString(2);
					String email=resultSet.getString(3);
					
					s2.setId(id2);
					s2.setName(name);
					s2.setEmail(email);
					
					
					
				}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}return s2;
				
				
			}
			
			
			
			
			
		
		
		
	}
