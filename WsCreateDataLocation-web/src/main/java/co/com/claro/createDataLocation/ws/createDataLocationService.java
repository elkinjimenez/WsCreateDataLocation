/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.createDataLocation.ws;

import co.com.claro.createDataLocation.entity.DatosUbicacion;
import co.com.claro.createDataLocation.facade.DatosUbicacionFacade;
import co.com.claro.createDataLocation.model.DatosUbicaResponse;
import co.com.claro.createDataLocation.model.GenericResponse;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import java.util.List;

/**
 *
 * @author omarMad
 */
@Path("createDataLocation")
@Stateless
@TransactionManagement
public class createDataLocationService {

    @EJB
    private DatosUbicacionFacade datosUbiFacade;

    public createDataLocationService() {
    }

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("test")
    public DatosUbicaResponse test() {
        DatosUbicaResponse response = new DatosUbicaResponse();
        try {
            List<DatosUbicacion> em = datosUbiFacade.listado();
            response.setDataLocation(em);
            GenericResponse responseG = new GenericResponse(true, "Listado correcto.");
            response.setResponse(responseG);
        } catch (Exception e) {
            GenericResponse responseG = new GenericResponse(false, "Error: " + e);
            response.setResponse(responseG);
        }
        return response;
    }
    
//    @GET
//    @Consumes("application/json")
//    @Produces("application/json")
//    @Path("searchCode")
//    public ParameterResponse searchCode(@QueryParam("code") String code) {
//        ParameterResponse response = new ParameterResponse();
//        try {
//            code = code.replaceAll("\"", "");
//            code = code.replaceAll("\'", "");
//            List<CodigoscvcOtp> codigos = codigosCVCFacade.searchCode(code);
//            if (codigos.size() > 0) {
//                GenericResponse responseG = new GenericResponse(true, "Código " + code + " encontrado satisfactoriamente.");
//                response.setCodesCVC(codigos);
//                response.setResponse(responseG);
//            } else {
//                GenericResponse responseG = new GenericResponse(false, "El código " + code + " no fue encontrado.");
//                response.setResponse(responseG);
//            }
//        } catch (Exception e) {
//            GenericResponse responseG = new GenericResponse(false, "Error inesperado en la consulta: " + e);
//            response.setResponse(responseG);
//        }
//        return response;
//    }
}
