/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.autoresidence.residence.resources;

import br.com.autoresidence.residence.model.Cliente;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Lab-2
 */
@Path("clientes")
public class ClientesResource {
    
/*
    @Context
    private UriInfo context;
*/
    /**
     * Creates a new instance of ClientesResource
     */
    
    public ClientesResource() {
    }

    /**
     * Retrieves representation of an instance of br.com.autoresidence.residence.ClientesResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getMensagem(@QueryParam("usuario") String usuario) {
        
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cliente>Rubem</cliente>";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("list")
    public List<Cliente> listaClientes(){
        
        
        return null;
    }
    /**
     * PUT method for updating or creating an instance of ClientesResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
