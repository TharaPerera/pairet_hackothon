package com.pairet.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/users")
public class UserService {
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
	@GET
	@Path("/get")
	public Response getMsg() {
 
		String output = "output";
 
		return Response.status(200).entity(output).build();
 
	}
 
}