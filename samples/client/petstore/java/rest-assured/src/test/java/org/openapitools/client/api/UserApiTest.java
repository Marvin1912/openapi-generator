/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.model.User;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.UserApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static org.openapitools.client.GsonObjectMapper.gson;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private UserApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder().setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("http://petstore.swagger.io:80/v2"))).user();
    }

    /**
     * successful operation
     */
    @Test
    public void shouldSee0AfterCreateUser() {
        User user = null;
        api.createUser()
                .body(user).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee0AfterCreateUsersWithArrayInput() {
        List<User> user = null;
        api.createUsersWithArrayInput()
                .body(user).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee0AfterCreateUsersWithListInput() {
        List<User> user = null;
        api.createUsersWithListInput()
                .body(user).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Invalid username supplied
     */
    @Test
    public void shouldSee400AfterDeleteUser() {
        String username = null;
        api.deleteUser()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * User not found
     */
    @Test
    public void shouldSee404AfterDeleteUser() {
        String username = null;
        api.deleteUser()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterGetUserByName() {
        String username = null;
        api.getUserByName()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid username supplied
     */
    @Test
    public void shouldSee400AfterGetUserByName() {
        String username = null;
        api.getUserByName()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * User not found
     */
    @Test
    public void shouldSee404AfterGetUserByName() {
        String username = null;
        api.getUserByName()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterLoginUser() {
        String username = null;
        String password = null;
        api.loginUser()
                .usernameQuery(username)
                .passwordQuery(password).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid username/password supplied
     */
    @Test
    public void shouldSee400AfterLoginUser() {
        String username = null;
        String password = null;
        api.loginUser()
                .usernameQuery(username)
                .passwordQuery(password).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee0AfterLogoutUser() {
        api.logoutUser().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Invalid user supplied
     */
    @Test
    public void shouldSee400AfterUpdateUser() {
        String username = null;
        User user = null;
        api.updateUser()
                .usernamePath(username)
                .body(user).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * User not found
     */
    @Test
    public void shouldSee404AfterUpdateUser() {
        String username = null;
        User user = null;
        api.updateUser()
                .usernamePath(username)
                .body(user).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}