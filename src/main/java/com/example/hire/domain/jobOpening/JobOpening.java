package com.example.hire.domain.jobOpening;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobOpening {

  private int jobOpeningId;

  private String jobPosition;

  private int jobReward;

  private String jobContent;

  private String jobSkill;

  private Date regDate;

  private int companyId;

  public JobOpening(int jobOpeningId, String jobPosition, String jobContent,
    String jobSkill, Date regDate, int companyId) {
    this.jobOpeningId = jobOpeningId;
    this.jobPosition = jobPosition;
    this.jobContent = jobContent;
    this.jobSkill = jobSkill;
    this.regDate = regDate;
    this.companyId = companyId;
  }

}
