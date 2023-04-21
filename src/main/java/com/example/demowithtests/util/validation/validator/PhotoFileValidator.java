package com.example.demowithtests.util.validation.validator;


import com.example.demowithtests.util.validation.annotation.constraints.PhotoFileConstraint;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


//!!!!!!!!!!!!!!!!!!!    Currently not in use! !!!!!!!!!!!!!
public class PhotoFileValidator implements ConstraintValidator<PhotoFileConstraint, MultipartFile> {
    String fileType;

    @Override
    public void initialize(PhotoFileConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        fileType = constraintAnnotation.value();
        System.err.println("!!!!!!!!!!!!!!!!!  initialize  fileType = " + fileType);
    }

    @Override
    public boolean isValid(MultipartFile validatedFile, ConstraintValidatorContext context) {


//        return "image/jpeg".equals(validatedFile.getContentType());
                return fileType.equals(validatedFile.getContentType());

    }
}
