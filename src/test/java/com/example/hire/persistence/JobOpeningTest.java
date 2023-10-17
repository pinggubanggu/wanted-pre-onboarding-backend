package com.example.hire.persistence;

import com.example.hire.domain.company.Company;
import com.example.hire.domain.jobOpening.JobOpening;
import com.example.hire.persistence.mapper.JobOpeningMapper;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@MybatisTest
@Slf4j
@SpringBootTest
public class JobOpeningTest {

  @Autowired
  private JobOpeningMapper jobOpeningMapper;

  @Test
  @DisplayName("register Mapper Test")
  public void registerTest() {
    // given
    JobOpening job = new JobOpening();
    job.setJobPosition("백엔드 주니어 개발자");
    // job.setJobReward(0);
    job.setJobContent("원티드랩에서 백엔드 주니어 개발자를 채용합니다. 자격요건은..");
    job.setJobSkill("Python, Java");
    job.setRegDate(new Date());
    job.setCompanyId(1);

    // when
    jobOpeningMapper.register(job);

    // then, 등록된 채용공고id를 알고 싶은데...  어떻게 알지?
    Assertions.assertNotNull(jobOpeningMapper.findById(4,1));

  }


}
