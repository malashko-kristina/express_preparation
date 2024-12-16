package complexTasks.autotests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

public class UserTest {
    String BASE_URI = "https://ca3d54a1869ca5362ae8.free.beeceptor.com/api/users/";

    @Test
    public void userShouldBeAbleToCreateUser() {
        User user = new User(700, "Alex");
        User createdUser = RestAssured.given().contentType(ContentType.JSON).accept(ContentType.JSON).body(user)
                .when().post(BASE_URI)
                .then().assertThat().statusCode(HttpStatus.SC_CREATED).extract().as(User.class);
        assert createdUser.equals(user);
    }
}
