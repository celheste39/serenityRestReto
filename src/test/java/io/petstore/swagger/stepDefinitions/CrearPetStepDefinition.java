package io.petstore.swagger.stepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import io.petstore.swagger.steps.CrearPetSteps;
import net.thucydides.core.annotations.Steps;

public class CrearPetStepDefinition {
    @Steps
    CrearPetSteps objeto = new CrearPetSteps();

    /*No es necesario el metodo Dado, porque para automatizar servicios
    *no se requiere levantar un navegador web
    */

    @Cuando("^se envien las operaciones de los servicios$")
    public void seEnvienLasOperacionesDeLosServicios() {
        objeto.crearUser();
        objeto.crearOrden();
    }

    @Entonces("^valida que le codigo de status sea (\\d+)$")
    public void validaQueLeCodigoDeStatusSea(int arg1) {
        objeto.validarUser();
        objeto.crearOrden();
    }

}
