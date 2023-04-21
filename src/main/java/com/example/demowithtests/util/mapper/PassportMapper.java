package com.example.demowithtests.util.mapper;

import com.example.demowithtests.domain.Passport;
import com.example.demowithtests.dto.passport.PassportCreateDto;
import com.example.demowithtests.dto.passport.PassportPatchDto;
import com.example.demowithtests.dto.passport.PassportReadDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface PassportMapper {

    PassportReadDto passportToPassportReadDto(Passport passport) ;


    Passport passportCreateDtoToPassport(PassportCreateDto passportCreateDto);

    Passport passportPatchDtoToPassport(PassportPatchDto passportPatchDto);

    Passport passportReadDTOToPassport(PassportCreateDto passportReadDto);

}