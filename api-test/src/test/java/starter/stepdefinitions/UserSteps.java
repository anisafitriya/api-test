package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Get;
import starter.user.Post;

public class UserSteps {
    @Steps
    Get get;

    @Steps
    Post post;



    @Given("I set GET api endpoints")
    public void iSetGetApiEndpoints(){
        get.setGetEndpoints();

    }
    @When("I send GET HTTP request")
    public void iSendGetHttpRequest(){
        get.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200")
    public void iReceiveValidHttpResponseCode200(){
        get.validateHttpResponseCode200();
    }
    @And("I receive valid data for detail user")
    public void receiveValidDataForDetailUser(){
        get.validateDataDetailUser();
    }


    @Given("I set POST api endpoints")
    public void setPostApiEndpoints(){
        post.setPostApiEndpoints();
    }

    @When("I send POST HTTP request")
    public void sendPostHttpRequest(){
        post.sendPostHttpRequest();
    }

    @Then("I receive valid response code 201")
    public void receiveValidHttp201(){
        post.receiveHttpResponseCode201();
    }

    @And("I receive valid data for new user")
    public void validateDataNewUser(){
        post.receiveDataNewUser();
    }


}
