package com.kravchenko.service.convert;

import java.io.IOException;

public interface JobConverter {

    Job convertMe(String json) throws IOException;
}
