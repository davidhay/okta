package com.ealanta.okta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
  private static Logger LOG = LoggerFactory.getLogger(HelloController.class);

  @GetMapping("/info")
  String helloUser(@AuthenticationPrincipal OidcUser user) {
    LOG.info("attribute names {}",user.getAttributes().keySet());
    return "Hello " + user.getAttributes().get("email");
  }
}
