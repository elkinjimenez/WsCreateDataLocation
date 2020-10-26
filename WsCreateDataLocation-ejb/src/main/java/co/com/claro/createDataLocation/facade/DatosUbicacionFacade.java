/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.createDataLocation.facade;

import co.com.claro.createDataLocation.entity.DatosUbicacion;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jimenezelkg
 */
@Stateless
public class DatosUbicacionFacade extends AbstractFacade<DatosUbicacion> {

    @PersistenceContext(unitName = "DataLocationPersistense")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DatosUbicacionFacade() {
        super(DatosUbicacion.class);
    }

    public List<DatosUbicacion> listado() {
        List<DatosUbicacion> lista = (List<DatosUbicacion>) em.createQuery("SELECT d FROM DatosUbicacion d").getResultList();
        return lista;
    }
}
