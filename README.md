# Java Selenium Appium Mobile Automation

# Prerequisites

* JDK `11` or higher
* Selenium `4.7.0` or higher
* Appium Java Client `8.3.0` or higher
* Appium Server `1.22.3-4` or higher

# Dependency

* Test need to run on real device as it needs contact book.
* You have to have the first contact with valid number and name less than 3 character.
* You have to have the second contact with invalid number and valid name.
* You have to have at least 8 contact number on phonebook.

### How to run test and check the test report

1. Start Appium server from appium server app.
2. After cloning the project, go to the directory `tk_automation_java_appium`.
3. Connect your device with your machine through USB cable.
4. Build the automation project with gradle.
5. Serve the generated report with allure.

### Building with Gradle

```sh
$ gradle clean test
```

or if gradle is not installed in your device

```sh
$ gradlew clean test
```

### See the generated report with allure

```sh
$ allure serve ./build/allure-results/
```