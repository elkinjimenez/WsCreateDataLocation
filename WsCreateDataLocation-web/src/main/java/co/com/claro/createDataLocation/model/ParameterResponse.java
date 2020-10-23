package co.com.claro.createDataLocation.model;

import co.com.claro.createDataLocation.entity.CodigoscvcOtp;
import java.util.List;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ParameterResponse {

    @Getter
    @Setter
    private GenericResponse response;

    @Getter
    @Setter
    private List<CodigoscvcOtp> codesCVC;

}
