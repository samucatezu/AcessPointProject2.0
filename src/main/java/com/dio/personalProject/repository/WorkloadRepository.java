package com.dio.personalProject.repository;

import com.dio.personalProject.model.Workload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkloadRepository extends JpaRepository<Workload, Long> {
}
