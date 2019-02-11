package com.kravchenko.beans.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Igor on 07.11.2017.
 */
@Service
public class WebServiceImpl implements WebService {

    private final String url;

    public WebServiceImpl(@Value("${server.url}") String prop) {
        this.url = prop;
    }

   @Override
    public void printWebSettings(){
       System.out.println(url);
   }

}
