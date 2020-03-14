$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/LoginPage.feature");
formatter.feature({
  "name": "verifying adactin details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verifying login and booking details.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStAdactin.user_is_on_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters details",
  "rows": [
    {
      "cells": [
        "userName",
        "passWord"
      ]
    },
    {
      "cells": [
        "jaya",
        "sdfghj"
      ]
    },
    {
      "cells": [
        "jayasankar",
        "abcde12345"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStAdactin.user_enters_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should verify the message",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStAdactin.user_should_verify_the_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should search Hotels",
  "rows": [
    {
      "cells": [
        "location",
        "Hotels",
        "roomType",
        "numberOfRooms",
        "adultsPerRoom",
        "childrenPerRoom"
      ]
    },
    {
      "cells": [
        "New York",
        "Hotel Hervey",
        "Deluxe",
        "2-Two",
        "2-Two",
        "1-one"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStAdactin.user_should_search_Hotels(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter search button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStAdactin.user_should_enter_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click radio button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStAdactin.user_should_click_radio_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should payment",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "billingAddress",
        "creditCardNumber",
        "creditCardType",
        "expiryMonth",
        "year",
        "cvvNumber"
      ]
    },
    {
      "cells": [
        "jaya",
        "sankar",
        "OMR",
        "1234567891234561",
        "VISA",
        "July",
        "2020",
        "654"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStAdactin.user_should_payment(DataTable)"
});
formatter.result({
  "status": "passed"
});
});