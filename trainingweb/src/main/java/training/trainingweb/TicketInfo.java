package training.trainingweb;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/info")
public class TicketInfo{
	@Path("/insertpath/{ticket_type}/{name}/{location}/{price}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String recieveTicketinfo(@PathParam("ticket_type") String type,
			@PathParam("name")String name,
			@PathParam("location")String location, 
			@PathParam("price") String price)
	{
		if(type!=null&& name!=null&&location!=null&&price!=null)
		{
		System.out.println(type+" "+name+" "+location+" "+price);
		return "succsess";
		}
		else
			return "fail";
		
	}
}

