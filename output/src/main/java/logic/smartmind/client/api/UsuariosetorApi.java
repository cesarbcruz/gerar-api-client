package logic.smartmind.client.api;

import logic.smartmind.client.invoker.ApiClient;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-25T12:20:00.812-03:00")
@Component("logic.smartmind.client.api.UsuariosetorApi")
public class UsuariosetorApi {
    private ApiClient apiClient;

    public UsuariosetorApi() {
        this(new ApiClient());
    }

    @Autowired
    public UsuariosetorApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param login The login parameter
     * @param codigoSetor The codigoSetor parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void usuariosetorLoginCodigoSetorPost(String login, Integer codigoSetor) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'login' is set
        if (login == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'login' when calling usuariosetorLoginCodigoSetorPost");
        }
        
        // verify the required parameter 'codigoSetor' is set
        if (codigoSetor == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'codigoSetor' when calling usuariosetorLoginCodigoSetorPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("login", login);
        uriVariables.put("codigoSetor", codigoSetor);
        String path = UriComponentsBuilder.fromPath("/usuariosetor/{login}/{codigoSetor}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param login The login parameter
     * @param codigosetor The codigosetor parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void usuariosetorLoginCodigosetorDelete(String login, Integer codigosetor) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'login' is set
        if (login == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'login' when calling usuariosetorLoginCodigosetorDelete");
        }
        
        // verify the required parameter 'codigosetor' is set
        if (codigosetor == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'codigosetor' when calling usuariosetorLoginCodigosetorDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("login", login);
        uriVariables.put("codigosetor", codigosetor);
        String path = UriComponentsBuilder.fromPath("/usuariosetor/{login}/{codigosetor}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
