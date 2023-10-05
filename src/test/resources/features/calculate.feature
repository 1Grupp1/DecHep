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

    #In this first field you select a discipline, but only track disciplines
  #In the second field you enter a result. One valid number then two invalid numbers.
  #In result you put one above the limit and one under the limit
  #In the field score you get the score from the previous activity and result
  #Last field you either get a message that says "yes" if its valid,
  #If its invalid you either get "No to slow time" or "No to fast time"


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

      #In the first field you want to register a name, you cant use a name with numbers or special characters
     #You either select Heptathlon or Decathlon
     #You save both the name and event
     #If you done everything correctly you will get a message that says that the name is valid
     #If you done it incorrectly you will get a message that says its invalid

  Scenario Outline: Field
    Given I choose selected <gren>
    And I type the <resultat>
    Then I control the <points>
    Then <validnumbers> is shown
    Examples:
      | gren               | resultat | points | validnumbers   |
      | "DecaDiscusThrow"  | 57       | 1017   | "Yes"          |
      | "DecaDiscusThrow"  | 88       | 1689   | "To far throw" |
      | "DecaDiscusThrow"  | 0        | 0      | "No points"    |
      | "DecaHighJump"     | 200      | 803    | "Yes"          |
      | "DecaHighJump"     | 270      | 1511   | "To high jump" |
      | "DecaHighJump"     | 50       | 0      | "No points"    |
      | "DecaJavelinThrow" | 60       | 738    | "Yes"          |
      | "DecaJavelinThrow" | 95       | 1276   | "To far throw" |
      | "DecaJavelinThrow" | 7        | 0      | "No points"    |
      | "DecaLongJump"     | 400      | 206    | "Yes"          |
      | "DecaLongJump"     | 1050     | 1752   | "To long jump" |
      | "DecaLongJump"     | 190      | 0      | "No points"    |
      | "DecaPoleVault"    | 490      | 880    | "Yes"          |
      | "DecaPoleVault"    | 710      | 1610   | "To high jump" |
      | "DecaPoleVault"    | 100      | 0      | "No points"    |
      | "DecaShotPut"      | 4        | 134    | "Yes"          |
      | "DecaShotPut"      | 28       | 1604   | "To far throw" |
      | "DecaShotPut"      | 1        | 0      | "No points"    |
      | "HeptHighJump"     | 120      | 312    | "Yes"          |
      | "HeptHighJump"     | 288      | 2539   | "To high jump" |
      | "HeptHighJump"     | 55       | 0      | "No points"    |
      | "HeptJavelinThrow" | 41       | 686    | "Yes"          |
      | "HeptJavelinThrow" | 99       | 1825   | "To far throw" |
      | "HeptJavelinThrow" | 3        | 0      | "No points"    |
      | "HeptLongJump"     | 455      | 441    | "Yes"          |
      | "HeptLongJump"     | 1022     | 2390   | "To long jump" |
      | "HeptLongJump"     | 213      | 0      | "No points"    |
      | "HeptShotPut"      | 12       | 661    | "Yes"          |
      | "HeptShotPut"      | 26       | 1610   | "To far throw" |
      | "HeptShotPut"      | 1        | 0      | "No points"    |

    #In the field gren you choose what discipline you want
    #In the second field you enter a resultat. One valid number then two invalid numbers.
    #In resultat you put one above the limit and one under the limit
    #The third field you combine the score from what discipline you choose and what resultat you got
    #In the last field you get "Yes" if you're points are valid
    #If they are invalid you either get "To far throw", "To high jump", "To long jump" or just "No points"



