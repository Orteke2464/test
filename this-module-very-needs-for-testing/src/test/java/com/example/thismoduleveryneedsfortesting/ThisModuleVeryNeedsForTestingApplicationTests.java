package com.example.thismoduleveryneedsfortesting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT, properties = "server.port=8080")
class ThisModuleVeryNeedsForTestingApplicationTests {

  @Test
  void contextLoads() {
  }

}
