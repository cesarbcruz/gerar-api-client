/*
 * api
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package logic.smartmind.client.api;

import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsuariosetorApi
 */
@Ignore
public class UsuariosetorApiTest {

    private final UsuariosetorApi api = new UsuariosetorApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usuariosetorLoginCodigoSetorPostTest() {
        String login = null;
        Integer codigoSetor = null;
        api.usuariosetorLoginCodigoSetorPost(login, codigoSetor);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usuariosetorLoginCodigosetorDeleteTest() {
        String login = null;
        Integer codigosetor = null;
        api.usuariosetorLoginCodigosetorDelete(login, codigosetor);

        // TODO: test validations
    }
    
}
