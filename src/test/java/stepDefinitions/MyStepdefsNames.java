package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class MyStepdefsNames {
    String nameInput = "Elin";
    String nameNumber = "name2";
    String nameNumbers = "123Elin";
    String nameWithBlank = "Fabian Horlin";
    String nameWithNumbers = "Elin123";
    String nameWithSpecial = "Elin?";

    @Given("I want to register {string}")
    public void iWantToRegister(String name) {
        if (name.equalsIgnoreCase("Elin")) {
            System.out.println("The name is " + name);
        } else if (name.matches("1234567890")) {
            System.out.println("The name is invalid");
        } else if (name.matches("!?,")) {
            System.out.println("The name is invalid");
        } else if (name.matches(" ")) {
            System.out.println("The name is valid");

        }

    }

    @And("I select the {string} in step")
    public void iSelectTheInStep(String event) {
        if (event.equalsIgnoreCase("Heptathlon")) {
            System.out.println("You chose : " + event);

        } else if (event.equalsIgnoreCase("Decathlon")) {
            System.out.println("You chose : " + event);

        }
    }

    @When("I save the {string} and {string}")
    public void iSaveTheAnd(String name, String event) {
        if (name.equalsIgnoreCase("Elin")) {
            System.out.println("When I save " + name + " " + event);
            assertEquals(name, nameInput);
        } else if (name.equalsIgnoreCase("name2")) {
            System.out.println("When I save " + name + " " + event);
            assertEquals(name, nameNumber);
        } else if (name.equalsIgnoreCase("123Elin")) {
            System.out.println("When I save " + name + " " + event);
            assertEquals(name, nameNumbers);
        } else if (name.equalsIgnoreCase("Fabian Horlin")) {
            System.out.println("When I save " + name + " " + event);
            assertEquals(name, nameWithBlank);
        } else if (name.equalsIgnoreCase("Elin123")) {
            System.out.println("When I save " + name + " " + event);
            assertEquals(name, nameWithNumbers);
        } else if (name.equalsIgnoreCase("Elin?")) {
            System.out.println("When I save " + name + " " + event);
            assertEquals(name, nameWithSpecial);
        }

    }


    @Then("The {string} is shown")
    public void theIsShown(String error) {
        System.out.println("The name is " + error);


    }
}