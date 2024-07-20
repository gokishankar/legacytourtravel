$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/admin/eclipse-workspace/cucumberlegacy/src/test/resources/Feature/forgotten.feature");
formatter.feature({
  "name": "To validate the Forgotten password in legacytour travel application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@morning"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "To validate the Invalid email for forgotten password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@morning"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to click the forgotten password",
  "keyword": "When "
});
formatter.match({
  "location": "forgottenstepdefinition.user_have_to_click_the_forgotten_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter Invalid email",
  "rows": [
    {
      "cells": [
        "fruits",
        "pine@123"
      ]
    },
    {
      "cells": [
        "actor",
        "suriya@46"
      ]
    },
    {
      "cells": [
        "flower",
        "jasmine@567"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "forgottenstepdefinition.user_have_to_enter_Invalid_email(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click reset password button",
  "keyword": "And "
});
formatter.match({
  "location": "forgottenstepdefinition.user_have_to_click_reset_password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to reach reset password page",
  "keyword": "Then "
});
formatter.match({
  "location": "forgottenstepdefinition.user_have_to_reach_reset_password_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the valid email for forgotten password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@morning"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to click the forgotten password",
  "keyword": "When "
});
formatter.match({
  "location": "forgottenstepdefinition.user_have_to_click_the_forgotten_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter valid email",
  "rows": [
    {
      "cells": [
        "S.NO",
        "NAME",
        "EMAIL"
      ]
    },
    {
      "cells": [
        "NO ONE",
        "fruits",
        "pine@123"
      ]
    },
    {
      "cells": [
        "NO TWO",
        "actor",
        "suriya@46"
      ]
    },
    {
      "cells": [
        "NO THRE",
        "flower",
        "jasmine@567"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "forgottenstepdefinition.user_have_to_enter_valid_email(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click reset password button",
  "keyword": "And "
});
formatter.match({
  "location": "forgottenstepdefinition.user_have_to_click_reset_password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to reach reset password page",
  "keyword": "Then "
});
formatter.match({
  "location": "forgottenstepdefinition.user_have_to_reach_reset_password_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});