package steps;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class ApiSteps {

    private Response response;

    @Given("la API está disponible")
    public void la_api_esta_disponible() {
        baseURI = "https://jsonplaceholder.typicode.com";
    }

    @When("hago una petición GET a {string}")
    public void hago_peticion_get(String endpoint) {
        response = get(endpoint);
    }

    @Then("el código de respuesta debe ser {int}")
    public void verificar_codigo_respuesta(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }

    @And("el campo {string} debe ser {int}")
    public void verificar_campo(String campo, int valorEsperado) {
        int valor = response.jsonPath().getInt(campo);
        assertEquals(valorEsperado, valor);
    }

    @And("el campo {string} debe ser {string}")
    public void verificar_name(String campo, String valorEsperado) {
    String valor = response.jsonPath().getString(campo);
    assertEquals(valorEsperado, valor);
}
}
