package com.pairet.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.pairet.entity.FitUser;
import com.pairet.entity.User;

@Path("/resource")
public class ResourceMapperService {
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		String message = "[ { \"id\": 1, \"name\": \"Jack - 50%\" }, { \"id\": 2, \"name\": \"Paul - 40%\" } ]";
		
		if(msg.contentEquals("java")){
			message = "[ { \"id\": 3, \"name\": \"Charmi - 70%\" }, { \"id\": 2, \"name\": \"Paul - 30%\" }, { \"id\": 7, \"name\": \"Mahesh - 29%\" } ]";
				
		}
		if(msg.contentEquals("wso2")){
			message = "[ { \"id\": 4, \"name\": \"Nuwan - 58%\" }, { \"id\": 2, \"name\": \"Paul - 8%\" } ]";
				
		}
		if(msg.contentEquals("cucumber")){
			message = "[ { \"id\": 5, \"name\": \"Yasas - 78%\" }, { \"id\": 4, \"name\": \"Nuwan - 55%\" } ]";
				
		}
		if(msg.contentEquals("gradle")){
			message = "[ { \"id\": 6, \"name\": \"Thara - 43%\" }, { \"id\": 2, \"name\": \"Paul - 7%\" }, { \"id\": 3, \"name\": \"Yasas - 3%\" } ]";
				
		}
		if(msg.contentEquals("AWS")){
			message = "[ { \"id\": 3, \"name\": \"Charmi - 34%\" }, { \"id\": 2, \"name\": \"Paul - 9%\" } ]";
				
		}
		String output = message;
 
		return Response.status(200).entity(output).build();
 
	}
	@GET
	@Path("/get")
	public Response getMsg(){
		String message = "[{'id': 1,'title': 'test'}, {'id: 2,'title': 'test'}]";
		
		

		
		String output = message;
		
 
		return Response.status(200).entity(output).build();
 
	}
	
	@POST
	@Path("/post")
	@Consumes({ MediaType.TEXT_PLAIN, MediaType.TEXT_PLAIN })
	@Produces(MediaType.TEXT_PLAIN)
	public Response createCustomer(@PathParam("a") String searchStoryDescription,@PathParam("b") String searchKeywords) {
		ArrayList<String> searchKeywordsList=new ArrayList<String>();
		searchKeywordsList.add("A");
		
		//return dataService.getBestFit(searchStoryDescription, searchKeywordsList);
		String output = searchStoryDescription +":"+searchKeywords;
		
		 
		return Response.status(200).entity(output).build();
	}
 
}