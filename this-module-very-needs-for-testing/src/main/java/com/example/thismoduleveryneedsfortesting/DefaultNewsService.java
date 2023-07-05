package com.example.thismoduleveryneedsfortesting;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DefaultNewsService implements NewsService {

  @Override
  public ResponseEntity<String> returnResponse(CheckNewsServiceRequest request) {
    if (request.getServiceIsBlocked()) {
      return ResponseEntity.status(HttpStatus.FORBIDDEN).body("This way to get information blocked");
    } else if (request.getWayToGetInformation().equals(WayToGetInformation.ONLINE_NEWSPAPER)) {
      return ResponseEntity.ok("New online newspaper");
    } else if (request.getWayToGetInformation().equals(WayToGetInformation.NEWSPAPER)) {
      return ResponseEntity.ok("New newspaper");
    }
    return ResponseEntity.ok("New news app");
  }

}