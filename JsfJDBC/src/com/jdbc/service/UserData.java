package com.jdbc.service;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.jdbc.model.Uye;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public List<Uye> getUyeler() throws ClassNotFoundException {
		ResultSet rs = null;
		PreparedStatement ps = null;
		Connection conn = getConnection();
		String query = "SELECT * FROM uye.uyeler";
		List<Uye> uyeler = new ArrayList<>();
		try {
			ps = conn.prepareStatement(query);
			ps.execute();
			rs = ps.getResultSet();
			while (rs.next()) {
				Uye uye = new Uye();
				uye.setId(rs.getInt("id"));
				uye.setAd(rs.getString("ad"));
				uye.setSoyad(rs.getString("soyad"));
				uye.setEmail(rs.getString("email"));
				uye.setPassword(rs.getString("password"));
				uyeler.add(uye);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		
		return uyeler;
	}

	public Connection getConnection() throws ClassNotFoundException {

		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/uye?useSSL=false&serverTimezone=UTC";
			String username = "root";
			String password = "12345";
			con = DriverManager.getConnection(url, username, password);

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
		return con;

	}

}
