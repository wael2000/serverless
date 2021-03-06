package org.redhat;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.DefaultValue;
import io.quarkus.logging.Log;

@Path("/")
public class Serverless {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String,Double> net(@QueryParam("growth") @DefaultValue("0") Integer growth) {
        Map<String,Double> map= new HashMap<>();
        map.put("salary", growth*0.5);
        return map;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String,Double> net( Map<String,Double> map) {
        map.put("salary", map.get("growth")*0.6);
        Log.info(map);
        return map;
    }

    

}