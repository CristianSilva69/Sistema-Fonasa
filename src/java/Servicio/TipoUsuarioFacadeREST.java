/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Modelo.TipoUsuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author Lenovo 2019 Y730
 */
@Stateless
@Path("modelo.tipousuario")
public class TipoUsuarioFacadeREST extends AbstractFacade<TipoUsuario> {
    @PersistenceContext(unitName = "Sistema_CajaPU")
    private EntityManager em;

    public TipoUsuarioFacadeREST() {
        super(TipoUsuario.class);
    }

    @POST
    @Override
    @Consumes({ "application/json"})
    public void create(TipoUsuario entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({ "application/json"})
    public void edit(@PathParam("id") String id, TipoUsuario entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({ "application/json"})
    public TipoUsuario find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/json"})
    public List<TipoUsuario> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({ "application/json"})
    public List<TipoUsuario> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
