package com.kravchenko.web;

import com.kravchenko.RestTemplateExample;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RestTemplateExample.class)
public class TestControllerTest {

    public static final String BEO_REQUEST_BODY = "{ \"username\": \"aoadmin\", \"password\": \"bmcAdm1n\" }";
    public static final String BAO_URL = "https://clm-aus-017138.bmc.com:38080/baocdp/rest/login";

    private static final String BLOG_SERVICE_URL = "http://localhost:3001";
    @Autowired
    private RestTemplate restTemplate = new RestTemplate();

    /**
     * Working when you start server
     */
    @Test
    @Ignore
    public void callToMyself() {
        ResponseEntity<ArrayList> forEntity = restTemplate.getForEntity(BLOG_SERVICE_URL + "/blogs", ArrayList.class, Collections.emptyMap());

        Assert.assertEquals(HttpStatus.OK, forEntity.getStatusCode());
        Assert.assertEquals("[{blogName=one, id=null, posts=[]}, {blogName=two, id=null, posts=[]}, {blogName=three, id=null, posts=[]}]", forEntity.getBody().toString());
    }

    @Test
    @Ignore
    public void someTest() {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> entity = buildHttpEntity();
        ResponseEntity<String> response = restTemplate.exchange(BAO_URL, HttpMethod.POST, entity, String.class);
        System.out.println(response.getStatusCode().toString());
    }

    private HttpEntity<String> buildHttpEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new HttpEntity<>(BEO_REQUEST_BODY, headers);
    }
}