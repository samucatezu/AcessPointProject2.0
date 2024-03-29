package com.dio.personalProject.service;

import com.dio.personalProject.model.Workload;
import com.dio.personalProject.repository.WorkloadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkloadService {

    @Autowired
    WorkloadRepository workloadRepository;

    public List<Workload> findAll() {
        return workloadRepository.findAll();
    }

    public Workload save(Workload workload) {
        return workloadRepository.save(workload);
    }

    public Optional<Workload> findById(Long id) {
        return workloadRepository.findById(id);
    }

    public Optional<Workload> update(Workload workload, Long id) {
        return workloadRepository.findById(id)
                .map(w -> workloadRepository.save(workload));
    }

    public Boolean delete(Long id) {
        return workloadRepository.findById(id)
                .map(w -> {
                    workloadRepository.deleteById(id);
                    return true;
                }).orElse(false);
    }
}
