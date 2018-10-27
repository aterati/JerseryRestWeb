package com.rv.code.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.rv.code.entity.Employee;

@Path("/Employee")
public class RestFrontController {

	@GET
	@Path("/getEmployee")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Employee getStartedMethod(@QueryParam("id") int id) {
		Employee emp = new Employee(id,2000, "arv");
		return emp;
	}
	
}
