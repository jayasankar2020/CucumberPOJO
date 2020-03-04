Feature: verifying adactin details

  Scenario: verifying login and booking details.
    Given user is on adactin page
    When user enters details
      | userName   | passWord   |
      | jaya       | sdfghj     |
      | jayasankar | abcde12345 |
    And User should verify the message
    And user should search Hotels
      | location | Hotels       | roomType | numberOfRooms | adultsPerRoom | childrenPerRoom |
      | New York | Hotel Hervey | Deluxe   | 2-Two         | 2-Two         | 1-one           |
    And user should enter search button
    And user should click radio button
    And user should payment
      | firstName | lastName | billingAddress | creditCardNumber | creditCardType | expiryMonth | year | cvvNumber |
      | jaya      | sankar   | OMR            | 1234567891234561 | VISA           | July        | 2020 |       654 |
