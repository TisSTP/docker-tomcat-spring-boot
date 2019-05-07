package com.tstp.docker.dockertomcatspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tisstp (T.STP)
 * @since 07-05-2019, 23:01
 */
@RestController
public class HomeController {

  @RequestMapping("/")
  public String home() {
    return "Spring Boot war deployment in Tomcat Docker Container successfull";
  }

}
