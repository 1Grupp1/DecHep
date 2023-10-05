package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefsField {

    //In this part of the code we put in the result from the calculate.feature

    int resultdisc = 57;
    int resultatHShot = 12;
    int resultatHLong = 455;
    int resultatHJavelin = 41;
    int resultatHHigh = 120;
    int resultHigh = 200;
    int resultJavelin = 60;
    int resultPole = 490;
    int resultatDLong = 400;
    int resultatShot = 4;

    //Here we put in the points from the calculate.feature
    int pointsdisc = 1017;
    int pointsHHigh = 312;
    int pointsHJavelin = 686;
    int pointsHigh = 803;
    int pointsHShot = 661;
    int pointsJavelin = 738;
    int pointsPole = 880;
    int pointsDLong = 206;
    int pointsHLong = 441;
    int pointsShotPut = 134;


    //In this first given you choose the discipline
    //You choose from a variety of diffrent disciplines
    //You choose either heptathlon or decathlon
    @Given("I choose selected {string}")
    public void iChooseSelected(String discepline) {
        if (discepline.equalsIgnoreCase("DecaDiscusThrow")) {
            System.out.println("Selected discepline is " + discepline);
        }
        if (discepline.equalsIgnoreCase("DecaHighJump")) {
            System.out.println("Selected discepline is " + discepline);
        }
        if (discepline.equalsIgnoreCase("DecaJavelinThrow")) {
            System.out.println("Selected discepline is " + discepline);
        }
        if (discepline.equalsIgnoreCase("DecaLongJump")) {
            System.out.println("Selected discepline is " + discepline);
        }
        if (discepline.equalsIgnoreCase("DecaPoleVault")) {
            System.out.println("Selected discepline is " + discepline);
        }
        if (discepline.equalsIgnoreCase("DecaShotPut")) {
            System.out.println("Selected discepline is " + discepline);
        }
        if (discepline.equalsIgnoreCase("HeptHighJump")) {
            System.out.println("Selected discepline is " + discepline);
        }
        if (discepline.equalsIgnoreCase("HeptJavelinThrow")) {
            System.out.println("Selected discepline is " + discepline);
        }
        if (discepline.equalsIgnoreCase("HeptLongJump")) {
            System.out.println("Selected discepline is " + discepline);
        }
        if (discepline.equalsIgnoreCase("HeptShotPut")) {
            System.out.println("Selected discepline is " + discepline);
        }
    }


    //In this class you enter you're result
    //One valid result and two invalid results
    //The two invalid results are one above the limit and one under the limit.
    @And("I type the {int}")
    public void iTypeThe(int resultat) {
        if (resultat == resultdisc) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 88) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 0) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == resultHigh) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 270) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 50) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == resultJavelin) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 95) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 7) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == resultatDLong) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 1050) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 190) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == resultPole) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 710) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 100) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == resultatShot) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 28) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 1) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == resultatHHigh) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 288) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 55) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == resultatHJavelin) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 99) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 3) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == resultatHLong) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 1022) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 213) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == resultatHShot) {
            System.out.println("The result is: " + resultat);
        }
        if (resultat == 26) {
            System.out.println("The result is: " + resultat);
        }
    }


    //In this class you verify the score to see if you get any points or not
    @Then("I control the {int}")
    public void iVerify(int score) {
        if (score == pointsdisc) {
            System.out.println("The score is: " + score);
        }
        if (score == 1689) {
            System.out.println("The score is: " + score);
        }
        if (score == 0) {
            System.out.println("The score is: " + score);
        }
        if (score == pointsHigh) {
            System.out.println("The score is: " + score);
        }
        if (score == 1511) {
            System.out.println("The score is: " + score);
        }
        if (score == pointsJavelin) {
            System.out.println("The score is: " + score);
        }
        if (score == 1276) {
            System.out.println("The score is: " + score);
        }
        if (score == pointsDLong) {
            System.out.println("The score is: " + score);
        }
        if (score == 1752) {
            System.out.println("The score is: " + score);
        }
        if (score == pointsPole) {
            System.out.println("The score is: " + score);
        }
        if (score == 1610) {
            System.out.println("The score is: " + score);
        }
        if (score == pointsShotPut) {
            System.out.println("The score is: " + score);
        }
        if (score == 1604) {
            System.out.println("The score is: " + score);
        }
        if (score == pointsHHigh) {
            System.out.println("The score is: " + score);
        }
        if (score == 2539) {
            System.out.println("The score is: " + score);
        }
        if (score == pointsHJavelin) {
            System.out.println("The score is: " + score);
        }
        if (score == 1825) {
            System.out.println("The score is: " + score);
        }
        if (score == pointsHLong) {
            System.out.println("The score is: " + score);
        }
        if (score == 2390) {
            System.out.println("The score is: " + score);
        }
        if (score == pointsHShot) {
            System.out.println("The score is: " + score);
        }
    }


    //In this class you either get a invalid message or you get a valid message
    @Then("{string} is shown")
    public void isShown(String validnumbers) {
        System.out.println("valid number: " + validnumbers);
    }
}
