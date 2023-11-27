# Java Selenium Appium Mobile Automation

## Prerequisites

- JDK `11` or higher
- Selenium `4.7.0` or higher
- Appium Java Client `8.3.0` or higher
- Appium Server `1.22.3-4` or higher

## Dependency

- Test need to run on real device as it needs contact book.
- You have to have the first contact with valid number and name less than 3 character.
- You have to have the second contact with invalid number and valid name.
- You have to have at least 8 contact number on phonebook.

## How to run test and check the test report

1. Clone the project and go to the directory `tk_automation_java_appium`.
2. Create a file named **.env** in the root folder of the project.
3. Copy all the elements from **.env.example** file and provide appropriate value to the empty variables.
4. Start Appium server from Appium server app.
5. Connect your device with your machine through USB cable.
6. Build the automation project with gradle.
7. Serve the generated report with allure.

## Building with Gradle

- ### Run

  ```sh
  $ gradle clean test
  ```

  or if gradle is not installed in your device

  ```sh
  $ gradlew clean test
  ```

  #### N.B: Currently only tally tab will run with these commands. Please edit the master-suite file to run all the suites.

### See the generated report with allure

```sh
$ allure serve ./build/allure-results/
```
