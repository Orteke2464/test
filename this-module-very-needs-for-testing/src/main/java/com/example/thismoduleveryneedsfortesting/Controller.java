package com.example.thismoduleveryneedsfortesting;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
@RequiredArgsConstructor
public class Controller {

  private final NewsService newsService;

  @PostMapping("/")
  public ResponseEntity<String> sendRequest(@RequestBody CheckNewsServiceRequest request) {
    return newsService.returnResponse(request);
  }

}
