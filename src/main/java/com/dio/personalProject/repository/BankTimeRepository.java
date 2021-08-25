package com.dio.personalProject.repository;

import com.dio.accesscontrolapi.model.BankTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankTimeRepository extends JpaRepository<BankTime, BankTime.BankTimeId> {
}
