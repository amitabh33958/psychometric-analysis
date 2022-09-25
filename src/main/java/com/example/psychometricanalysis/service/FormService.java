package com.example.psychometricanalysis.service;

import com.example.psychometricanalysis.dto.MediaFileDto;
import com.example.psychometricanalysis.dto.PsychometricFormDto;
import com.example.psychometricanalysis.entity.MediaFile;
import com.example.psychometricanalysis.entity.PsychometricForm;
import com.example.psychometricanalysis.mapper.PsychometricFormMapper;
import com.example.psychometricanalysis.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormService {

    @Autowired
    private PsychometricFormMapper mapper;

    @Autowired
    FormRepository formRepository;

    public PsychometricForm submitFormToDb(PsychometricFormDto psychometricForm) {
        PsychometricForm form = mapper.toPsychometricForm(psychometricForm);
        MediaFileDto mediaFileDto = psychometricForm.getQuestion3().get(0);
        MediaFile mediaFile = new MediaFile(mediaFileDto.getName(), mediaFileDto.getType(), mediaFileDto.getContent().getBytes());
        form.setMediaFile(mediaFile);
        return formRepository.save(form);
    }

    public PsychometricFormDto getFormFromDb(Long id) {
        Optional<PsychometricForm> formOptional = formRepository.findById(id);
        PsychometricFormDto psychometricFormDto = mapper.toPsychometricFormDto(formOptional.get());
        MediaFile mediaFile = formOptional.get().getMediaFile();
        psychometricFormDto.setQuestion3(List.of
                (new MediaFileDto(mediaFile.getName(), mediaFile.getType(), new String(mediaFile.getContent()))));
        return psychometricFormDto;
    }
}
