package com.example.hire.dto;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HireListDto {

  private int companyId;

  private String companyName;

  private String nation;

  private String region;

  private int jobOpeningId;

  private String jobPosition;

  private int jobReward;

  private String jobContent;

  private String jobSkill;

  private List<Integer> jobOpeningIdListOfCompany;
}
