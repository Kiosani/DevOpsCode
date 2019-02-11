package com.kravchenko.service.convert;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class JobConverterImpl implements JobConverter {

    private final ObjectMapper mapper;

    @Autowired
    public JobConverterImpl(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public Job convertMe(String json) throws IOException {
        Job job = mapper.readValue(json, Job.class);
        return job;
    }
}
