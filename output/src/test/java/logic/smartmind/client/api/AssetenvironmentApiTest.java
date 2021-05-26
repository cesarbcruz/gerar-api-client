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

import logic.smartmind.client.model.AssetEnvironment;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssetenvironmentApi
 */
@Ignore
public class AssetenvironmentApiTest {

    private final AssetenvironmentApi api = new AssetenvironmentApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void assetenvironmentAssetidDeleteTest() {
        String assetid = null;
        api.assetenvironmentAssetidDelete(assetid);

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
    public void assetenvironmentAssetidGetTest() {
        String assetid = null;
        AssetEnvironment response = api.assetenvironmentAssetidGet(assetid);

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
    public void assetenvironmentAssetidPatchTest() {
        String assetid = null;
        AssetEnvironment body = null;
        api.assetenvironmentAssetidPatch(assetid, body);

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
    public void assetenvironmentGetTest() {
        List<AssetEnvironment> response = api.assetenvironmentGet();

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
    public void assetenvironmentPostTest() {
        AssetEnvironment body = null;
        api.assetenvironmentPost(body);

        // TODO: test validations
    }
    
}
