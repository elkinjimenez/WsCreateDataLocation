/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.createDataLocation.model;

import co.com.claro.createDataLocation.entity.DatosUbicacion;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jimenezelkg
 */
public class DatosUbicaResponse {

    @Getter
    @Setter
    private GenericResponse response;

    @Getter
    @Setter
    private List<DatosUbicacion> dataLocation;

}
