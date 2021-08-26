package com.dio.personalProject.service;

import com.dio.personalProject.model.Calendar;
import com.dio.personalProject.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarService {

    @Autowired
    CalendarRepository CalendarRepository;

    public List<Calendar> findAll() {
        return CalendarRepository.findAll();
    }

    public Calendar save(Calendar calendar) {
        return CalendarRepository.save(calendar);
    }

    public Optional<Calendar> findById(Long id) {
        return CalendarRepository.findById(id);
    }

    public Optional<Calendar> update(Calendar c) {
        return CalendarRepository.findById(c.getId())
                .map(calendar -> CalendarRepository.save(c));
    }

    public Boolean delete(Long id) {
        return CalendarRepository.findById(id)
                .map(c -> {
                    CalendarRepository.deleteById(id);
                    return true;
                }).orElse(false);
    }
}
