Feature: Decathlon100M
  I want to use this template for my feature file

  Scenario Outline: Track
    Given I have selected <discipline>
    And I enter the <result>
    Then I verify the <score>
    Then errormessage is shown <vaildnummbers>
    Examples:
      | discipline  | result | score | vaildnummbers     |
      | "Deca100M"  | 13     | 651   | "yes"             |
      | "Deca100M"  | 18.5   | 0     | "No to slow time" |
      | "Deca100M"  | 4.3    | 3019  | "No to fast time" |
      | "Hep100MH"  | 12     | 1108  | "yes"             |
      | "Hep100MH"  | 27     | 12    | "No to slow time" |
      | "Hep100MH"  | 3      | 2882  | "No to fast time" |
      | "Deca400M"  | 35     | 1634  | "yes"             |
      | "Deca400M"  | 105    | 0     | "No to slow time" |
      | "Deca400M"  | 15     | 3105  | "No to fast time" |
      | "Hep200M"   | 23     | 1079  | "yes"             |
      | "Hep200M"   | 45     | 0     | "No to slow time" |
      | "Hep200M"   | 11     | 2571  | "No to fast time" |
      | "Deca1500M" | 201    | 1260  | "yes"             |
      | "Deca1500M" | 460    | 9     | "No to slow time" |
      | "Deca1500M" | 33     | 3014  | "No to fast time" |
      | "Hep800M"   | 150    | 693   | "yes"             |
      | "Hep800M"   | 255    | 0     | "No to slow time" |
      | "Hep800M"   | 60     | 2238  | "No to fast time" |
      | "Deca110MH" | 14     | 975   | "yes"             |
      | "Deca110MH" | 30     | 0     | "No to slow time" |
      | "Deca110MH" | 8      | 1895  | "No to fast time" |


  Scenario Outline: Names
    Given I want to register "<name>"
    And I select the "<event>" in step
    When I save the "<name>" and "<event>"
    Then The "<error>" is shown

    Examples:
      | name          | event      | error   |
      | Elin          | Heptathlon | Valid   |
      | name2         | Decathlon  | Invalid |
      | 123Elin       | Heptathlon | Invalid |
      | Fabian Horlin | Decathlon  | Valid   |
      | Elin123       | Heptathlon | Invalid |
      | Elin?         | Heptathlon | Invalid |

   Scenario Outline: Field
    Given I have selected <discipline>
    And I enter the <result>
    Then I verify the <score>
    Then errormessage is shown <vaildnummbers>
    Examples:
      | discipline | result | score | vaildnummbers |
      | "hhalk"    |        |       |               |
      |            |        |       |               |
      |            |        |       |               |
      |            |        |       |               |
      |            |        |       |               |
      |            |        |       |               |
      |            |        |       |               |
      |            |        |       |               |
      |            |        |       |               |

