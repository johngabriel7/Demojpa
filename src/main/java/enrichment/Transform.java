package enrichment;

import org.apache.camel.Exchange;

import model.Csvxmljpa;

public class Transform {
	
	public void covertcsvobject(Exchange excahge)
	{
		
		Csvxmljpa con=(Csvxmljpa) excahge.getIn().getBody();
		con.setName("John");
	}

}
