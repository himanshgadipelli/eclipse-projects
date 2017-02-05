package org.pradeep.javaperks.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/test")

public class TestResource {
	@GET
//	@Path("/zipcode")
	public String methodName(){
		return "Hello Web Services- Restful";
	}
	
	@GET
	@Path("/zipcode")
	public String getWeatherDate(){
		return "Wether is good";
	}
	@GET
	@Path("/zipcode/{zipCd}")
	public String getWeatherDataByZipCode(@PathParam("zipCd")String postalCode){
		return "Wether is good at " + postalCode;
	}
	@GET
	@Path("/cityName/{cityName}")
	public String getWeatherDataByCityName(@PathParam("cityName")String cityName){
		return "Wether is good at " + cityName;
	}
}
