package petApi.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import petApi.models.Pet;

public class PetRequester {

    public static Pet createPet(Pet pet) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(pet)
                .when()
                .post("/pet")
                .then()
                .assertThat().statusCode(HttpStatus.SC_OK)
                .extract().as(Pet.class);
    }

    public static Pet getPet(int id) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .get("/pet/" + id)
                .then()
                .assertThat().statusCode(HttpStatus.SC_OK)
                .extract().as(Pet.class);
    }

    public static Pet updatePet(Pet updatedPet) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(updatedPet)
                .when()
                .put("/pet")
                .then()
                .assertThat().statusCode(HttpStatus.SC_OK)
                .extract().as(Pet.class);
    }

    public static void deletePet(int id) {
        RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .delete("/pet/" + id)
                .then()
                .assertThat().statusCode(HttpStatus.SC_OK);
    }
}
