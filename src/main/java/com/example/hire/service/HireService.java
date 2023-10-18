package com.example.hire.service;

import com.example.hire.domain.jobOpening.JobOpening;
import com.example.hire.dto.HireListDto;
import java.util.List;

public interface HireService {

  // 1) 채용공고 생성, 2) 채용공고 수정, 3) 채용공고 삭제, 4)채용공고 목록 가져오기, 5) 채용공고 상세 페이지 불러오기, 6) 채용공고 검색기능
  public void register(JobOpening jobOpening);

  public void modify(JobOpening jobOpening);

  public boolean remove(int jobOpeningId, int companyId);

  // 채용공고 상세 페이지 불러오기
  public HireListDto get(int jobOpeningId, int companyId);

  // 채용공고 목록 가져오기
  public List<HireListDto> getList();

  // 채용공고 검색기능 -- 채용공고 목록 가져오는 것과 같이 제네릭써서 뭘로 받아올건지 객체 정해주기
  public List<JobOpening> search(String searchWord);

  public void apply(String userId, int jobOpeningId);

}
