package io.petstore.swagger.steps;

import io.petstore.swagger.models.DataInyection;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CrearPetSteps {
    DataInyection dataInyection = new DataInyection();

    //solicitudes a los servicios de crear usuario y crear orden
    @Step
    public void crearUser(){
        SerenityRest.given().baseUri(dataInyection.getUrl()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyUser()).post();
        System.out.println(SerenityRest.lastResponse().asString());
    }
    @Step
    public void crearOrden(){
        SerenityRest.given().baseUri(dataInyection.getUrl()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyOrden()).post();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    //verificación del status code de los response
    @Step
    public void validarUser(){
        SerenityRest.lastResponse().then().statusCode(dataInyection.getRESPONSECODE());
    }
    @Step
    public void validarOrden(){
        SerenityRest.lastResponse().then().statusCode(dataInyection.getRESPONSECODE());
    }
}
