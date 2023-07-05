package com.example.thismoduleveryneedsfortesting;

import org.springframework.http.ResponseEntity;

public interface NewsService {

  ResponseEntity<String> returnResponse(CheckNewsServiceRequest request);

}
