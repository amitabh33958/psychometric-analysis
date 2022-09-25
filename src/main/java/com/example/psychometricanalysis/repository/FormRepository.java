package com.example.psychometricanalysis.repository;

import com.example.psychometricanalysis.entity.PsychometricForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends JpaRepository<PsychometricForm, Long> {
}
