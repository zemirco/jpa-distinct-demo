package com.example.demo.Package;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepository extends JpaRepository<Package, Integer> {
  //   @QueryHints(
  //       value = {
  //         @QueryHint(name = org.hibernate.jpa.QueryHints.HINT_PASS_DISTINCT_THROUGH, value =
  // "false"),
  //       })
  @Query(value = "select p from Package p join p.versions v where v.license.name = :name")
  Page<Package> findByLicenseName(@Param("name") String name, Pageable pageable);
}
