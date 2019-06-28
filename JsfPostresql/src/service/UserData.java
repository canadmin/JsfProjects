package service;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.print.attribute.standard.MediaSize.ISO;

import dao.DbConnection;
import model.Isimler;

@ManagedBean(name = "userData",eager = true)
@SessionScoped
public class UserData implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	private Connection conn=null;
	
	public List<Isimler> getUyeler() throws SQLException{
		DbConnection dbconnect=new DbConnection();
		conn=dbconnect.Baglan();
		PreparedStatement ps=conn.prepareStatement("select * from isimler");
		List<Isimler> isimlerList=new ArrayList<Isimler>();
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Isimler isimler=new Isimler();
			isimler.setId(rs.getInt("id"));
			isimler.setAd(rs.getString("ad"));
			isimlerList.add(isimler);
		}
		
		
		return isimlerList;
		
	}
	
	

}
