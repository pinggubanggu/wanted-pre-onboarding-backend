package com.example.hire.service;

import com.example.hire.domain.company.Company;
import com.example.hire.domain.jobOpening.JobOpening;
import com.example.hire.dto.HireListDto;
import com.example.hire.persistence.mapper.ApplicantMapper;
import com.example.hire.persistence.mapper.CompanyMapper;
import com.example.hire.persistence.mapper.JobOpeningMapper;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class HireServiceImpl implements HireService{

  private final JobOpeningMapper jobOpeningMapper;
  private final CompanyMapper companyMapper;
  private final ApplicantMapper applicantMapper;

  public HireServiceImpl(JobOpeningMapper jobOpeningMapper, CompanyMapper companyMapper, ApplicantMapper applicantMapper) {
    this.jobOpeningMapper = jobOpeningMapper;
    this.companyMapper = companyMapper;
    this.applicantMapper = applicantMapper;
  }

  @Override
  public void register(JobOpening jobOpening) {
    jobOpeningMapper.insert(jobOpening);
  }

  @Override
  public void modify(JobOpening jobOpening) {
    jobOpeningMapper.update(jobOpening);
  }

  @Override
  public boolean remove(int jobOpeningId, int companyId) {
    return jobOpeningMapper.delete(jobOpeningId, companyId) == 1;
  }

  @Override
  public HireListDto get(int jobOpeningId, int companyId) {
    HireListDto hireListDto = jobOpeningMapper.read(jobOpeningId, companyId);
    List<Integer> jobOpeningIdOfCompany = companyMapper.getJobOpeningIdOfCompany(companyId);
    hireListDto.setJobOpeningIdListOfCompany(jobOpeningIdOfCompany);

    return hireListDto;
  }

  @Override
  public List<HireListDto> getList() {
    return jobOpeningMapper.getList();
  }

  @Override
  public List<JobOpening> search(String searchWord) {
    return null;
  }

  @Override
  public void apply(String userId, int jobOpeningId) {
    applicantMapper.apply(userId, jobOpeningId);
  }


}
