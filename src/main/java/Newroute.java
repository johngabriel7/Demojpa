import org.apache.camel.builder.RouteBuilder;

public class Newroute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		from("direct:test").to("log:test?level=info");

	}

}
