package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class StepDefinitionsTrack {

    //Here we put in the score from the calculate.feature
    int scoredec = 651;
    int scorehep = 1108;
    int score400M = 1634;
    int scoreH200 = 1079;
    int score1500M = 1260;
    int score800M = 693;
    int score110M = 975;

    //In this part of the code we put in the result from the calculate.feature
    int resultdec = 13;
    int resulthep = 12;
    int result400 = 35;
    int resultH200 = 23;
    int result1500M = 201;
    int result800M = 150;
    int result110M = 14;

    //In this first given you choose the discipline
    //You choose from a variety of diffrent track disciplines
    //You choose either heptathlon or decathlon
    @Given("I have selected {string}")
    public void iselected(String gren) {
        if (gren.equalsIgnoreCase("Deca100M")) {
            System.out.println("Selected discipline is: " + gren);
        }
        if (gren.equalsIgnoreCase("Hep100MH")) {
            System.out.println("Selected discipline is: " + gren);
        }
        if (gren.equalsIgnoreCase("Deca400M")) {
            System.out.println("Selected discipline is: " + gren);
        }
        if (gren.equalsIgnoreCase("Hep200M")) {
            System.out.println("Selected discipline is: " + gren);
        }
        if (gren.equalsIgnoreCase("Deca1500M")) {
            System.out.println("Selected discipline is: " + gren);
        }
        if (gren.equalsIgnoreCase("Hep800M")) {
            System.out.println("Selected discipline is: " + gren);
        }
        if (gren.equalsIgnoreCase("Deca110MH")) {
            System.out.println("Selected discipline is: " + gren);
        }
    }

    //In this class you enter you're result
    //One valid result and two invalid results
    //The two invalid results are one above the limit and one under the limit.
    @And("I enter the {double}")
    public void enterresult(double resultInput) {
        if (resultInput == resultdec) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == 18.5) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == 4.3) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == resulthep) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == 27) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == 3) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == result400) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == 105) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == 15) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == resultH200) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == 45) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == 11) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == result1500M) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == 460) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == 33) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == result800M) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == 255) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == 60) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == result110M) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == 30) {
            System.out.println("The result is: " + resultInput);
        }
        if (resultInput == 8) {
            System.out.println("The result is: " + resultInput);
        }
    }

    //In this class you verify the score to see if you get any points or not
    @Then("I verify the {int}")
    public void iverify(int scoreInput) {
        if (scoreInput == scoredec) {
            System.out.println("The score is: " + scoreInput);
            assertEquals(scoredec, scoreInput);
        }
        if (scoreInput == 0) {
            System.out.println("invaild numbers");
        }
        if (scoreInput == 3019) {
            System.out.println("invaild numbers");
        }
        if (scoreInput == scorehep) {
            System.out.println("The score is: " + scoreInput);
            assertEquals(scorehep, scoreInput);
        }
        if (scoreInput == 12) {
            System.out.println("invaild numbers");
        }
        if (scoreInput == 2882) {
            System.out.println("invaild numbers");
        }
        if (scoreInput == score400M) {
            System.out.println("The score is: " + scoreInput);
            assertEquals(score400M, scoreInput);
        }
        if (scoreInput == 3105) {
            System.out.println("The score is: " + scoreInput);
        }
        if (scoreInput == scoreH200) {
            System.out.println("The score is: " + scoreInput);
            assertEquals(scoreH200, scoreInput);
        }
        if (scoreInput == 2571) {
            System.out.println("The score is: " + scoreInput);
        }
        if (scoreInput == score1500M) {
            System.out.println("The score is: " + scoreInput);
            assertEquals(scoreInput, score1500M);
        }
        if (scoreInput == 9) {
            System.out.println("The score is: " + scoreInput);
        }
        if (scoreInput == 3014) {
            System.out.println("The score is: " + scoreInput);
        }
        if (scoreInput == score800M) {
            System.out.println("The score is: " + scoreInput);
            assertEquals(scoreInput, score800M);
        }
        if (scoreInput == 2238) {
            System.out.println("The score is: " + scoreInput);
        }
        if (scoreInput == score110M) {
            System.out.println("The score is: " + scoreInput);
            assertEquals(scoreInput, score110M);
        }
        if (scoreInput == 1895) {
            System.out.println("The score is: " + scoreInput);
        }

    }

    //In this class you either get a invalid message or you get a valid message
    @Then("errormessage is shown {string}")
    public void errormessageIsShown(String text) {

        System.out.println("valid numbers: " + text);

    }
}



