package com.bc.finder.metier;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jettison.json.JSONArray;

import com.bc.finder.Tojson.Tojson;
import com.bc.finder.dao.Connectdatabase;

public class Card {
	private int user_id;
	private int id_card;
	private int phone;
	private String site;
	private String email;
	private String title;
	private String adress;
	private String country;
	private String city;
	private Date date_card;


	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getId_card() {
		return id_card;
	}

	public void setId_card(int id_card) {
		this.id_card = id_card;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDate_card() {
		return date_card;
	}

	public void setDate_card(Date date_card) {
		this.date_card = date_card;
	}
      
	public JSONArray getAllCards() throws SQLException{
		JSONArray json = null;

		try(  Connection conn = Connectdatabase.getConnection();
				Statement Myst= conn.createStatement();
				ResultSet R =Myst.executeQuery("select *from cards");
				){ 
			Tojson tojson = new Tojson();
			json = tojson.toJSONArray(R);	
		}catch(Exception ex){

		}
		return json;
	}

//	public JSONArray SearchByCategeoryAndCity(String category,String city){
//		List<Card> card_list = new ArrayList<Card>();
//		Connection conn=null;
//		ResultSet R = null;
//		Statement Myst = null;
//		JSONArray json = null;
//
//		try{    
//			conn = Connectdatabase.getConnection();
//			Myst = conn.createStatement();
//			R=Myst.executeQuery("select *from cards where category");
//			Tojson tojson = new Tojson();
//			json = tojson.toJSONArray(R);
//		}catch(Exception ex){
//
//		}
//
//		return null;
//
//	}


}
