$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/F001_Login.feature");
formatter.feature({
  "name": "Leaftab login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "test the login function with positive credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Enter the username as \u003cusername\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter the password as \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "When "
});
formatter.step({
  "name": "Homepage should be display",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "demosalesmanager",
        "crmsfa"
      ]
    },
    {
      "cells": [
        "democsr",
        "crmsfa"
      ]
    }
  ]
});
formatter.scenario({
  "name": "test the login function with positive credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as demosalesmanager",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.enterUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage should be display",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verifyHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "test the login function with positive credential",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as democsr",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.enterUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage should be display",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verifyHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/F002_CreateLead.feature");
formatter.feature({
  "name": "Create the new lead functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "test create lead with mandatory fields",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.step({
  "name": "Enter the username as demosalesmanager",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter the password as crmsfa",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "When "
});
formatter.step({
  "name": "Homepage should be display",
  "keyword": "Then "
});
formatter.step({
  "name": "click on crmsfa link",
  "keyword": "When "
});
formatter.step({
  "name": "click leads option",
  "keyword": "And "
});
formatter.step({
  "name": "Click createlead option",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the companyname as \u003cCompanyname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the firstname as \u003cFirstname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the lastname as \u003cLastname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Click Createlead Button",
  "keyword": "And "
});
formatter.step({
  "name": "ViewLead page shouldbe appeared",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Companyname",
        "Firstname",
        "LastName"
      ]
    },
    {
      "cells": [
        "Hermatic",
        "jaya",
        "Praksh"
      ]
    },
    {
      "cells": [
        "Vernalis",
        "Jayaprakash",
        "jp"
      ]
    },
    {
      "cells": [
        "Exela",
        "Jp",
        "devaraj"
      ]
    }
  ]
});
formatter.scenario({
  "name": "test create lead with mandatory fields",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as demosalesmanager",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.enterUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage should be display",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verifyHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on crmsfa link",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickcrmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click leads option",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.clickMylead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click createlead option",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.clickCreateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the companyname as Hermatic",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.enterCompanyName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the firstname as jaya",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.enterFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the lastname as \u003cLastname\u003e",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.enterlastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Createlead Button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.clickCreatelead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ViewLead page shouldbe appeared",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.viewLeadPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "test create lead with mandatory fields",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as demosalesmanager",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.enterUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage should be display",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verifyHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on crmsfa link",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickcrmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click leads option",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.clickMylead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click createlead option",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.clickCreateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the companyname as Vernalis",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.enterCompanyName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the firstname as Jayaprakash",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.enterFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the lastname as \u003cLastname\u003e",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.enterlastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Createlead Button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.clickCreatelead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ViewLead page shouldbe appeared",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.viewLeadPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "test create lead with mandatory fields",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as demosalesmanager",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.enterUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage should be display",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verifyHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on crmsfa link",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickcrmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click leads option",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.clickMylead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click createlead option",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.clickCreateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the companyname as Exela",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.enterCompanyName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the firstname as Jp",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.enterFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the lastname as \u003cLastname\u003e",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.enterlastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Createlead Button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.clickCreatelead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ViewLead page shouldbe appeared",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.viewLeadPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/F003_EditLead.feature");
formatter.feature({
  "name": "Leaftab login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "test create lead with mandatory fields",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as demosalesmanager",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.enterUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage should be display",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verifyHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on crmsfa link",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickcrmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click leads option",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.clickMylead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click FindLead option",
  "keyword": "And "
});
formatter.match({
  "location": "EditLead.clickFindBy()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click phone option in findby section",
  "keyword": "When "
});
formatter.match({
  "location": "EditLead.clickPhoneOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter phone number as 77",
  "keyword": "And "
});
formatter.match({
  "location": "EditLead.enterPhoneNo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click findleads button in findby section",
  "keyword": "And "
});
formatter.match({
  "location": "EditLead.clickFindleads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click lead in result section",
  "keyword": "And "
});
formatter.match({
  "location": "EditLead.clickUpdateLead()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027x-grid3-cell-inner x-grid3-col-partyId\u0027]/a\"}\n  (Session info: chrome\u003d86.0.4240.198)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0-alpha-6\u0027, revision: \u00275f43a29cfc\u0027\nSystem info: host: \u0027DESKTOP-KC0JV2H\u0027, ip: \u0027192.168.43.97\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\HP\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:54097}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 0de9539efda341642ab4a87b76cde06b\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027x-grid3-cell-inner x-grid3-col-partyId\u0027]/a}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:333)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:451)\r\n\tat steps.EditLead.clickUpdateLead(EditLead.java:35)\r\n\tat ✽.Click lead in result section(file:src/test/java/features/F003_EditLead.feature:16)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click Edit button in leftside",
  "keyword": "And "
});
formatter.match({
  "location": "EditLead.clickeditButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "change compant name as Vernalis",
  "keyword": "And "
});
formatter.match({
  "location": "EditLead.updateCompanyName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Update Button",
  "keyword": "And "
});
formatter.match({
  "location": "EditLead.clickUpdateButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "ViewLead page shouldbe appeared",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLead.viewLeadPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/F004_DeleteLead.feature");
formatter.feature({
  "name": "Leaftab login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "test create lead with mandatory fields",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as demosalesmanager",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.enterUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage should be display",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verifyHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on crmsfa link",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickcrmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click leads option",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLead.clickMylead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click FindLead option",
  "keyword": "And "
});
formatter.match({
  "location": "EditLead.clickFindBy()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click phone option in findby section",
  "keyword": "When "
});
formatter.match({
  "location": "EditLead.clickPhoneOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter phone number as 77",
  "keyword": "And "
});
formatter.match({
  "location": "EditLead.enterPhoneNo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click findleads button in findby section",
  "keyword": "And "
});
formatter.match({
  "location": "EditLead.clickFindleads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the particular lead ID and click it",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteLead.selectLeadWithDetails()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027x-grid3-cell-inner x-grid3-col-partyId\u0027]/a\"}\n  (Session info: chrome\u003d86.0.4240.198)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0-alpha-6\u0027, revision: \u00275f43a29cfc\u0027\nSystem info: host: \u0027DESKTOP-KC0JV2H\u0027, ip: \u0027192.168.43.97\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\HP\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:54119}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 2585acf4882bbd4deebf69bb7ff57a51\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027x-grid3-cell-inner x-grid3-col-partyId\u0027]/a}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:333)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:451)\r\n\tat steps.DeleteLead.selectLeadWithDetails(DeleteLead.java:11)\r\n\tat ✽.Select the particular lead ID and click it(file:src/test/java/features/F004_DeleteLead.feature:15)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click delete button in left side",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteLead.clickDelete()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click FindLead option",
  "keyword": "And "
});
formatter.match({
  "location": "EditLead.clickFindBy()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter the deleted lead ID in LeadID text field",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteLead.enterDeletedleadID()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click findleads button in findby section",
  "keyword": "And "
});
formatter.match({
  "location": "EditLead.clickFindleads()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "deleted lead should not present",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteLead.checkDeletedLeadInResult()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});