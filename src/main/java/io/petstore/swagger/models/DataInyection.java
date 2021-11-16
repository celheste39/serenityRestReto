package io.petstore.swagger.models;
import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInyection {
    Faker faker= new  Faker (new Locale("en-US"));
    //declaración de variables
    private String url, headers, bodyUser, bodyOrden;
    private final int RESPONSECODE;
    //constructor
    public DataInyection(){
        this.url = "https://petstore.swagger.io/v2/user";
        this.headers = "application/json";
        this.bodyUser = "{\n" +
                "  \"id\": 0,\n" +
                "  \"username\": \"string\",\n" +
                "  \"firstName\": \"string\",\n" +
                "  \"lastName\": \"string\",\n" +
                "  \"email\": \"string\",\n" +
                "  \"password\": \"string\",\n" +
                "  \"phone\": \"string\",\n" +
                "  \"userStatus\": 0\n" +
                "}";
        this.bodyOrden= "{\n" +
                "  \"id\": 0,\n" +
                "  \"petId\": 0,\n" +
                "  \"quantity\": 1,\n" +
                "  \"shipDate\": \"2021-11-16T19:30:01.318Z\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true\n" +
                "}";
        this.RESPONSECODE = 200;
    }

    //getters
    public String getUrl() {
        return url;
    }
    public String getHeaders() {
        return headers;
    }
    public String getBodyUser() {
        return bodyUser;
    }
    public String getBodyOrden() {
        return bodyOrden;
    }
    public int getRESPONSECODE() {
        return RESPONSECODE;
    }
}
