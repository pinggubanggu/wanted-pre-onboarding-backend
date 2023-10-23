package com.example.hire.service;

import com.example.hire.domain.jobOpening.JobOpening;
import com.example.hire.dto.HireListDto;
import com.example.hire.persistence.mapper.ApplicantMapper;
import com.example.hire.persistence.mapper.CompanyMapper;
import com.example.hire.persistence.mapper.JobOpeningMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HireService {

  // 1) 채용공고 생성, 2) 채용공고 수정, 3) 채용공고 삭제, 4)채용공고 목록 가져오기, 5) 채용공고 상세 페이지 불러오기, 6) 채용공고 검색기능
  @Autowired
  private JobOpeningMapper jobOpeningMapper;
  @Autowired
  private CompanyMapper companyMapper;
  @Autowired
  private ApplicantMapper applicantMapper;


  public void register(JobOpening jobOpening) {
    jobOpeningMapper.insert(jobOpening);
  }

  public void modify(JobOpening jobOpening) {
    jobOpeningMapper.update(jobOpening);
  }

  public boolean remove(int jobOpeningId, int companyId) {
    return jobOpeningMapper.delete(jobOpeningId, companyId) == 1;
  }

  public HireListDto get(int jobOpeningId, int companyId) {
    HireListDto hireListDto = jobOpeningMapper.read(jobOpeningId, companyId);
    List<Integer> jobOpeningIdOfCompany = companyMapper.getJobOpeningIdOfCompany(companyId);
    hireListDto.setJobOpeningIdListOfCompany(jobOpeningIdOfCompany);

    return hireListDto;
  }

  public List<HireListDto> getList() {
    return jobOpeningMapper.getList();
  }

  public List<JobOpening> search(String searchWord) {
    return null;
  }

  public void apply(String userId, int jobOpeningId) {
    applicantMapper.apply(userId, jobOpeningId);
  }


}
