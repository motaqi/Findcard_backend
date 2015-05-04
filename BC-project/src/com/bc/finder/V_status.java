package com.bc.finder;

import java.sql.SQLException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.codehaus.jettison.json.JSONArray;

import com.bc.finder.metier.Card;

@Path(value="/card")
@Provider
public class V_status{

	@GET
	@Path("/card_list")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONArray returnArraycard() throws SQLException{
		JSONArray json = null;
		Card card = new Card();
		json = card.getAllCards();
		return json;
	}
	
	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public String returnstring(){
		return "hello";
	}


  


}
