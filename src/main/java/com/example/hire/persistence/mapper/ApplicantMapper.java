package com.example.hire.persistence.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ApplicantMapper {

  // 지원자 - 1) 지원
  void apply(String userName, int jobOpeningId);
}
