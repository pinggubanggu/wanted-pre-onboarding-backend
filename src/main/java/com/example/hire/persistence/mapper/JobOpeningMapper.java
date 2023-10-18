package com.example.hire.persistence.mapper;

import com.example.hire.domain.company.Company;
import com.example.hire.domain.jobOpening.JobOpening;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;

@Mapper
public interface JobOpeningMapper {

  // 1) 채용공고 생성, 2) 채용공고 수정, 3) 채용공고 삭제, 4)채용공고 목록 가져오기, 5) 채용공고 상세 페이지 불러오기, 6) 채용공고 검색기능
  void insert(JobOpening jobOpening);

  void update(JobOpening jobOpening);

  void delete(int jobOpenginId, int companyId);

  // 채용공고 목록 가져오기
  List<JobOpening> getList();

  // 채용공고 상세 페이지 불러오기
  JobOpening read(int jobOpeningId, int companyId);
  
  // 채용공고 검색기능 -- 채용공고 목록 가져오는 것과 같이 제네릭써서 뭘로 받아올건지 객체 정해주기
  List<JobOpening> search(String searchWord);

}
