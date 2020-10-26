/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.createDataLocation.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jimenezelkg
 */
@Entity
@Table(name = "DATOS_UBICACION", schema = "FRAUDE")
@NamedQueries(
        @NamedQuery(name = "DatosUbicacion.findAll", query = "SELECT d.nombreORazonSocial, d.numeroIdentificacion, d.tipoIdentificacion FROM DatosUbicacion d"))
public class DatosUbicacion implements Serializable {

    @Getter
    @Setter
    @Id
    @Size(max = 10)
    @Column(name = "NUMERO_IDENTIFICACION")
    private String numeroIdentificacion;

    @Getter
    @Setter
    @Size(max = 1)
    @Column(name = "TIPO_IDENTIFICACION")
    private String tipoIdentificacion;

    @Getter
    @Setter
    @Size(max = 100)
    @Column(name = "NOMBRE_O_RAZON_SOCIAL")
    private String nombreORazonSocial;

}
