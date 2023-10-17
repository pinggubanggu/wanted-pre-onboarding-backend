package com.example.hire.domain.company;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

  private int companyId;

  private String nation;

  private String region;

  private String companyPhoneNumber;

  private Date regDate;

  private String companyName;
}
