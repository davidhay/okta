package com.ealanta.okta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private static Logger LOG = LoggerFactory.getLogger(HelloController.class);

  @RequestMapping("/hello")
  public String hello(OAuth2AuthenticationToken auth){
    LOG.info("auth {}",auth);
    LOG.info("principal {}",auth.getPrincipal());
    return "hello" + auth.getPrincipal();
  }
}
