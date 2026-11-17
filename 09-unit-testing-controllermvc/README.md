# 09 - Unit Testing Controller Endpoints with MockMvc

## Faculty-style project structure

- `MS1Application.java` - Spring Boot application entry point
- `MS1Controller.java` - handles the `/ms1/add` GET endpoint
- `MS1Service.java` - contains addition business logic
- `MS1ControllerUnitTest.java` - tests the controller using MockMvc and Mockito

## Endpoint

`GET /ms1/add?a=5&b=10`

Expected HTTP response:

- Status: `200 OK`
- Body: `MS 1.1 - Addition = 15`

## Run in Spring Tool Suite 4

1. Extract this ZIP file.
2. Open STS4.
3. Select **File -> Import -> Maven -> Existing Maven Projects**.
4. Browse to the extracted `09-unit-testing-controllermvc` folder.
5. Select the `pom.xml` and click **Finish**.
6. Right-click the project -> **Maven -> Update Project**.
7. To execute the unit test, right-click `MS1ControllerUnitTest.java` -> **Run As -> JUnit Test**.
8. To start the application, right-click `MS1Application.java` -> **Run As -> Spring Boot App**.

No database setup is required for this question.

## Note

The controller test uses `@WebMvcTest` and `MockMvc`, so it tests the web layer without starting the full application server. The service is mocked with Mockito.
