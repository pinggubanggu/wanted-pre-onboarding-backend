package com.example.hire.persistence;

import com.example.hire.domain.company.Company;
import com.example.hire.domain.jobOpening.JobOpening;
import com.example.hire.dto.HireListDto;
import com.example.hire.persistence.mapper.JobOpeningMapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
    job.setJobReward(0);
    job.setJobContent("원티드랩에서 백엔드 주니어 개발자를 채용합니다. 자격요건은..");
    job.setJobSkill("Python, Java");
    job.setRegDate(new Date());
    job.setCompanyId(1);

    // when
    jobOpeningMapper.insert(job);

    // then
    log.info(String.valueOf(job.getJobOpeningId()));
    //Assertions.assertEquals(jobOpeningMapper.read(job.getJobOpeningId(), job.getCompanyId()),  );

  }

  @Test
  public void updateTest() {

    //given
    JobOpening job = new JobOpening();
    job.setJobOpeningId(23);
    job.setJobPosition("백엔드 주니어 개발자");
    job.setJobReward(100000);
    job.setJobSkill("Java");
    job.setRegDate(new Date());
    job.setCompanyId(1);
    job.setUpdateDate(new Date());

    //when
    jobOpeningMapper.update(job);

    //then
    HireListDto hireListDto = jobOpeningMapper.read(23, 1);
    Assertions.assertEquals("Java", hireListDto.getJobSkill());
  }

  @Test
  public void deleteTest() {

    // given
    JobOpening job = new JobOpening();
    job.setJobOpeningId(23);
    job.setCompanyId(1);

    // when
    jobOpeningMapper.delete(job.getJobOpeningId(), job.getCompanyId());

    // then
    Assertions.assertNull(jobOpeningMapper.read(23,1));
  }

  @Test
  public void getListTest() {

    // given

    // when
    List<HireListDto> list = jobOpeningMapper.getList();

    // then

  }


}
