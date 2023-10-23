package com.example.hire;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootTest
class HireApplicationTests {

  @Autowired
  private ApplicationContext context;

  @Autowired
  private SqlSessionFactory sessionFactory;

  @Test
  void contextLoads() {

  }

  @Test
  public void testByApplicationContext() {
    try {
      log.info("sqlSessionFactory : {}", context.getBean("sqlSessionFactory"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
