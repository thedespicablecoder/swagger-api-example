/**
 * Swagger API Demo
 * Testing swagger platform
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import org.junit.Test;
import org.junit.Before;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {


    private DefaultApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://virtserver.swaggerhub.com/piyush-kumar/MySwaggerAPI/0.0.1", DefaultApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * 
     *
     * set employee records
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void employeesPostTest() {
        Integer id = null;
        String name = null;
        String location = null;
        String teamName = null;
        // InlineResponse2001 response = api.employeesPost(id, name, location, teamName);

        // TODO: test validations
    }
    
    /**
     * Get all names
     *
     * Details about employees
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllEmployeesGetTest() {
        // InlineResponse200 response = api.getAllEmployeesGet();

        // TODO: test validations
    }
    
}
