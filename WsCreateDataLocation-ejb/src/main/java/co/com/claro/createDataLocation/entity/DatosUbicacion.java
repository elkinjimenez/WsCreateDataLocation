/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.createDataLocation.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jimenezelkg
 */
@Entity
@Table(name = "DATOS_UBICACION")
@XmlRootElement
public class DatosUbicacion {

    @Getter
    @Setter
    @Size(max = 1)
    @Column(name = "TIPO_IDENTIFICACION")
    private String tipoIdentificacion;

    @Getter
    @Setter
    @Size(max = 10)
    @Column(name = "NUMERO_IDENTIFICACION")
    private String numeroIdentificacion;

    @Getter
    @Setter
    @Size(max = 100)
    @Column(name = "NOMBRE_O_RAZON_SOCIAL")
    private String nombreORazonSocial;

    @Getter
    @Setter
    @Column(name = "FECHA_CARGUE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date FechaCargue;

}
