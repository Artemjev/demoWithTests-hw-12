package com.example.demowithtests.service.passport;

import com.example.demowithtests.domain.Passport;

import java.util.List;


public interface PassportService {

    Passport getPassport(Integer id);

    Passport createPassport(Passport passport);

    Passport patchPassport(Integer id, Passport passport);

    Passport updatePassport(Integer id, Passport passport);

    void deletePassport(Integer id);

//    void markPassportAsDeleted(Integer id);
//
//    void deleteAll();
//
//    List<Passport> getAll();
//
    //---------------------------------------------------------------------------

    //    Page<Employee> getAllWithPagination(Pageable pageable);
    //
    //    Page<Employee> getAllActive(Pageable pageable);
    //
    //    Page<Employee> getAllDeleted(Pageable pageable);
    //
    //    List<Employee> getEmployeesByGenderAndCountry(Gender gender, String country);
    //
    //    Page<Employee> getEmployeesWithActiveAddressesInCountry(String country, Pageable pageable);
    //
    //    /**
    //     * @param country   Filter for the country if required
    //     * @param page      number of the page returned
    //     * @param size      number of entries in each page
    //     * @param sortList  list of columns to sort on
    //     * @param sortOrder sort order. Can be ASC or DESC
    //     * @return Page object with employees after filtering and sorting
    //     */
    //    Page<Employee> getByCountryAndSort(String country, int page, int size, List<String> sortList, String sortOrder);
    //
    //    /**
    //     * Get all the countries of all the employees.
    //     *
    //     * @return A list of all the countries that employees are from.
    //     */
    //    Set<String> getAllEmployeesCountries();
    //
    //    /**
    //     * It returns a list of countries sorted by name.
    //     *
    //     * @return A list of countries in alphabetical order.
    //     */
    //    List<String> getAllEmployeesCountriesSorted();
    //
    //    Optional<List<String>> getEmails();
    //
    //    List<Employee> handleEmployeesWithIsDeletedFieldIsNull();
    //
    //    List<Employee> handleEmployeesWithIsPrivateFieldIsNull();
    //
    //    List<Employee> handleEmployeesWithIsConfirmedFieldIsNull();
    //
    //    void sendMailConfirm(Integer id);
    //
    //    void confirm(Integer id);
    //
    //    void generateEntities(Integer quantity, Boolean clear);
    //
    //    void massTestUpdate();
    //
    //    List<Employee> findEmployeesWithExpiredPhotos();
    //
    //    void sendEmailToEmployeesWhosePhotoIsExpired();
    //
    //    Employee addPhoto(Integer employeeId, Photo photo);
    //
    //    Optional<Photo> getEmployeeActivePhoto(Integer employeeId);
}
