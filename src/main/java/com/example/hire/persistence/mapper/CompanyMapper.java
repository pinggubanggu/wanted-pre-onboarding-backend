package com.example.hire.persistence.mapper;

import com.example.hire.domain.company.Company;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyMapper {
  public Company get(int companyId);

  public List<Integer> getJobOpeningIdOfCompany(int companyId);
}
