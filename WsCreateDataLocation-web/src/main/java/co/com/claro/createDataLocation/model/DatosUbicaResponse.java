package co.com.claro.createDataLocation.model;

import co.com.claro.createDataLocation.entity.DatosUbicacion;
import java.util.List;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DatosUbicaResponse {

    @Getter
    @Setter
    private GenericResponse response;

    @Getter
    @Setter
    private List<DatosUbicacion> dataLocation;

}
