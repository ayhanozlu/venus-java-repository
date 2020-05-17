package com.barbershop;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;


@Path("/helloWorld")
public class HelloWorldRestService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{name}")
	
	public String deneme(@Context HttpHeaders httpHeaders,@PathParam("name") String name) {
		
		String result = "Hello "+name;
		return result;
		
	}


}
