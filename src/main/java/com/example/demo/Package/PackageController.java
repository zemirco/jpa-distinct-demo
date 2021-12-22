package com.example.demo.Package;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/packages")
public class PackageController {

  @Autowired PackageRepository packageRepository;

  @GetMapping
  public Page<Package> foo(Pageable pageable) {
    return packageRepository.findByLicenseName("mit", pageable);
  }
}
