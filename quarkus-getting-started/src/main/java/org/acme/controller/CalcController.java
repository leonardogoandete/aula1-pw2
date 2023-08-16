package org.acme.rest.json;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/calc")
public class CalcController {

    public static final float FATOR_CONVERSAO = 0.621371;

    @POST
    public Float add(Float numero) {
        return (numero*FATOR_CONVERSAO);
    }
}