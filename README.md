# Calculator Online Tests

Project Calculator Online Tests is designed for testing [Calculator Online](https://thecalculatoronline.com) application
It uses Page Object Pattern and executes tests with Google Chrome browser.

## Execution

### Execution with Maven

```
mvn clean test -DTestSuite=nameOfTestSuite
```

e.g.:

```shell
mvn clean test -DTestSuite=BasicSuiteTestNG
```

## Browser setup

### Chrome

#### Download url

[Official Chrome Website](https://www.google.com/chrome)

#### How to update chromedriver to latest version?

1. Open [ChromeDriver availability Page](https://googlechromelabs.github.io/chrome-for-testing/)
2. Look for the stable version
3. Find matching binary to your platform
4. Copy download link
5. Download zip
6. Unzip
7. Copy unzipped chromedriver to the project to the path:

```
src/main/resources/drivers/
```

## Wikis

- [Page Object Pattern](https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/)
- [Selenium development page](https://www.selenium.dev/)
- [Selenium FindBy](https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/FindBy.html)