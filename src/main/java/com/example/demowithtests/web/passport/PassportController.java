package com.example.demowithtests.web.passport;

import com.example.demowithtests.dto.passport.PassportCreateDto;
import com.example.demowithtests.dto.passport.PassportPatchDto;
import com.example.demowithtests.dto.passport.PassportPutDto;
import com.example.demowithtests.dto.passport.PassportReadDto;

import java.util.List;


public interface PassportController {

    PassportReadDto getPassport(Integer id);

    PassportReadDto createPassport(PassportCreateDto createDto);

//    PassportReadDto patchPassport(Integer id, PassportPatchDto patchDto);
//
//    PassportReadDto putPassport(Integer id, PassportPutDto putDto);
//
//    void markPassportAsDeleted(Integer id);
//
//    void deletePassport(Integer id);
//
//    List<PassportReadDto> getAllPassports();
//
//    void removeAllPassports();




//    Page<EmployeeReadDto> getPageOfEmployees(int page, int size);
//
//    Page<EmployeeReadDto> getEmployeesByCountry(String country, int page, int size, List<String> sortList,
//            Sort.Direction sortOrder);
//
//    Set<String> getAllEmployeesCountries();
//
//    List<String> getAllEmployeesCountriesSorted();
//
//    Optional<List<String>> getAllEmployeesEmails();
//
//    List<EmployeeReadDto> getEmployeesByGenderAndCountry(Gender gender, String country);
//
//    Page<EmployeeReadDto> getEmployeesWithActiveAddressesInCountry(String country, int page, int size);
//
//    List<EmployeeReadDto> handleEmployeesWithIsDeletedFieldIsNull();
//
//    List<EmployeeReadDto> handleEmployeesWithIsPrivateFieldIsNull();
//
//    List<EmployeeReadDto> handleEmployeesWithIsConfirmedFieldIsNull();
//
//    Page<EmployeeReadDto> getAllActiveUsers(int page, int size);
//
//    Page<EmployeeReadDto> getAllDeletedUsers(int page, int size);
//
//    void sendConfirm(Integer id);
//
//    void confirm(Integer id);
//
//    Long generateEmployees(Integer quantity, Boolean clear);
//
//    Long employeeMassPutUpdate();
//
//    Long employeeMassPatchUpdate();
//
//    List<EmployeeReadDto> getEmployeesWithExpiredPhotos();
//
//    void sendEmailToEmployeesWhosePhotoIsExpired();
//
//    PhotoReadDto getEmployeeActivePhoto(Integer employeeId);
//
//    ResponseEntity<byte[]> getPhotoImage(Integer employeeId);
//
//    EmployeeReadDto uploadPhoto(Integer employeeId, MultipartFile file);
}
