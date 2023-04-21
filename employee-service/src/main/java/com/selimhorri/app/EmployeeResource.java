package com.selimhorri.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Path("/api/employees")
@Produces(MediaType.APPLICATION_JSON)
@Slf4j
@RequiredArgsConstructor
public class EmployeeResource {
	
	@GET
	@Path("/hi")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHi() {
		log.info("** Im here employee");
		return "Hi employee";
	}
	
}




