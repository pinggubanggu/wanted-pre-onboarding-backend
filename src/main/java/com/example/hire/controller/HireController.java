package com.example.hire.controller;

import com.example.hire.domain.jobOpening.JobOpening;
import com.example.hire.dto.HireListDto;
import com.example.hire.service.HireService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hire/*")
public class HireController {

  @Autowired
  private HireService service;

  @PostMapping("/register")
  public void register(JobOpening jobOpening) {
    service.register(jobOpening);
  }

  @PostMapping("/modify")
  public void modify(JobOpening jobOpening) {
    service.modify(jobOpening);
  }

  @PostMapping("/remove")
  public boolean remove(int jobOpeningId, int companyId) {
    return service.remove(jobOpeningId, companyId);
  }

  @GetMapping("/get")
  public HireListDto get(int jobOpeningId, int companyId) {
    return service.get(jobOpeningId,companyId);
  }

  @RequestMapping(value = "/list")
  public List<HireListDto> list() {
    return service.getList();
  }

  @PostMapping("/apply")
  public void apply(String userId, int jobOpeningId) {
    service.apply(userId,jobOpeningId);
  }


}
