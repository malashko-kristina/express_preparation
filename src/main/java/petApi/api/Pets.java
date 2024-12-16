package petApi.api;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import petApi.models.Category;
import petApi.models.Pet;

public class Pets {

    @BeforeAll
    public static void setupApi() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }

    @Test
    public void userShouldBeAbleToCreateAPet() {
        Category category = Category.builder().id(17).name("Nana").build();
        Pet pet1 = Pet.builder().id(1999).name("Kira").category(category).status("available").build();
        Pet createdNewPet = PetRequester.createPet(pet1);
        Assertions.assertEquals(pet1, createdNewPet);
    }

    @Test
    public void userShouldbeAbleToGetAPet() {
        Category category = Category.builder().id(8).name("Kelly").build();
        Pet pet1 = Pet.builder().id(898).name("doggie").category(category).status("unavailable").build();

        Pet createdPet = PetRequester.createPet(pet1);
        Assertions.assertEquals(pet1, createdPet);

        Pet getCreatedPet = PetRequester.getPet(pet1.getId());
        Assertions.assertEquals(pet1, getCreatedPet);
    }

    @Test
    public void userShouldBeAbleToUpdateCreatedPet() {
        Category category = Category.builder().id(11).name("Hoi").build();
        Pet pet1 = Pet.builder().id(111).name("catty").category(category).status("unavailable").build();

        Pet createdPet = PetRequester.createPet(pet1);
        Assertions.assertEquals(pet1, createdPet);

        Category categoryNew = Category.builder().id(11).name("Ahahah").build();
        Pet petNew = Pet.builder().id(111).name("catty").category(categoryNew).status("available").build();

        Pet updatedPet = PetRequester.updatePet(petNew);
        Assertions.assertEquals(petNew, updatedPet);
    }

    @Test
    public void userShouldBeAbleToDeleteCreatedPet() {
        Category category = Category.builder().id(11).name("Hoi").build();
        Pet pet1 = Pet.builder().id(111).name("catty").category(category).status("unavailable").build();

        Pet createdPet = PetRequester.createPet(pet1);
        Assertions.assertEquals(pet1, createdPet);

        PetRequester.deletePet(pet1.getId());

        RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .get("%s".formatted(pet1.getId()))
                .then()
                .assertThat().statusCode(HttpStatus.SC_NOT_FOUND);
    }
}
