package com.example.psychometricanalysis.controller;

import com.example.psychometricanalysis.dto.PsychometricFormDto;
import com.example.psychometricanalysis.entity.PsychometricForm;
import com.example.psychometricanalysis.service.FormService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class FormController {

    @Autowired
    private FormService formService;

    @PostMapping(value = "/form", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> submitForm(@RequestBody PsychometricFormDto psychometricForm) {
        try {
            PsychometricForm form = formService.submitFormToDb(psychometricForm);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body("Form submitted successfully with id: " + form.getFormId());
        } catch (Exception exception) {
            log.error("Exception while submitting form. Exception is: ", exception);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(exception.getMessage());
        }

    }

    @GetMapping(value = "form/{formId}")
    public ResponseEntity<PsychometricFormDto> getFormById(@PathVariable Long formId) {
        PsychometricFormDto form = formService.getFormFromDb(formId);
        return ResponseEntity.status(HttpStatus.OK)
                .body(form);

    }

}
