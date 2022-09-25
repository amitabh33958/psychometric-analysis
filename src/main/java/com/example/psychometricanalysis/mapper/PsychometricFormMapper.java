package com.example.psychometricanalysis.mapper;

import com.example.psychometricanalysis.dto.PsychometricFormDto;
import com.example.psychometricanalysis.entity.PsychometricForm;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PsychometricFormMapper {

    PsychometricForm toPsychometricForm(PsychometricFormDto psychometricFormDto);

    PsychometricFormDto toPsychometricFormDto(PsychometricForm psychometricForm);
}
