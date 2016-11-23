package myroutes;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Created by Zoli on 23/11/2016.
 */
public class StartApp {

    // just standard way to start camel context and add our route to it
    public static void main(String ... args ) throws Exception{
        CamelContext context = new DefaultCamelContext();
        MyRouteBuilder mr = new MyRouteBuilder();
        context.addRoutes(mr);
        context.start();
        Thread.sleep(2000);
        context.stop();
    }
}
