package com.example.demowithtests.service.passport;

import com.example.demowithtests.domain.Passport;
import com.example.demowithtests.repository.PassportRepository;
import com.example.demowithtests.util.exception.NoSuchEmployeeException;
import com.example.demowithtests.util.exception.NoSuchPassportException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.UUID;


@AllArgsConstructor
@Slf4j
@Service
public class PassportServiceBean implements PassportService {
    private final String LOG_START =
            "PassportService --> PassportServiceBean --> start of method:  ";
    private final String LOG_END =
            "PassportService --> PassportServiceBean --> finish of method:  ";

    private final PassportRepository passportRepository;

    //----------------------------------------------------------------------------------------------------
    //    todo:    Хотим serialNumber передавать в паспорта в момент создания бина
    //    @Transactional
    //    @PostConstruct
    //    public void init() {
    // passport.setSerialNumber(String.valueOf(UUID.randomUUID()));
    //    }

    //----------------------------------------------------------------------------------------------------
    @Override
    //    @CustomValidationAnnotations({MarkedAsDeleted.class})
    public Passport getPassport(Integer id) {
        log.debug(LOG_START + "Passport getPassport(Integer id = {})", id);
        Passport passport = passportRepository.findById(id)
                                              .orElseThrow(() -> new NoSuchEmployeeException(
                                                      "There is no passport with ID=" + id +
                                                              " in database"));
        log.debug(LOG_END + "Passport getPassport(Integer id = {}): result = {}", id, passport);
        return passport;
    }

    //----------------------------------------------------------------------------------------------------
    @Override
    public Passport createPassport(Passport passport) {
        log.debug(LOG_START + "Passport createPassport(Passport passport = {})", passport);
        passport.setSerialNumber(String.valueOf(UUID.randomUUID())); //-это костыль! todo: исправить
        Passport result = passportRepository.save(passport);
        log.debug(LOG_END + "Passport createPassport(Passport passport = {}): result = {}",
                passport, result);
        return result;
    }

    //----------------------------------------------------------------------------------------------------
    @Override
    //        @Transactional
    //        @CustomValidationAnnotations({MarkedAsDeleted.class, CountryMatchesAddressesVerification.class})
    public Passport patchPassport(Integer id, Passport newPassport) {
        log.debug(LOG_START + "Passport patchPassport(Integer id = {}, Passport passport = {})",
                id, newPassport);
        Passport passport = passportRepository.findById(id)
                                              .orElseThrow(() -> new NoSuchPassportException(
                                                      "There is no passport with ID=" + id +
                                                              " in database"));
        if (newPassport.getFirstName() != null &&
                !newPassport.getFirstName().equals(passport.getFirstName())) {
            passport.setFirstName(newPassport.getFirstName());
        }
        if (newPassport.getSecondName() != null &&
                !newPassport.getSecondName().equals(passport.getSecondName())) {
            passport.setSecondName(newPassport.getSecondName());
        }
        if (newPassport.getBirthDate() != null &&
                !newPassport.getBirthDate().equals(passport.getBirthDate())) {
            passport.setBirthDate(newPassport.getBirthDate());
        }
        if (newPassport.getExpirationDate() != null &&
                !newPassport.getExpirationDate().equals(passport.getExpirationDate())) {
            passport.setExpirationDate(newPassport.getExpirationDate());
        }
        //        if (newPassport.ge != null &&
        //                !newPassport.ge.equals(passport.ge)) {
        //            passport.se(newPassport.ge);
        //        }
        Passport result = passportRepository.save(passport);
        log.debug(LOG_END +
                        "Passport patchPassport(Integer id = {}, Passport passport = {}): result = {}",
                id, newPassport, result);
        return result;
    }

    //----------------------------------------------------------------------------------------------------
    @Override
    //        @Transactional
    //        @CustomValidationAnnotations({MarkedAsDeleted.class})
    public Passport updatePassport(Integer id, Passport newPassport) {
        log.debug(LOG_START + "Passport updatePassport(Integer id = {}, Passport newPassport = {})",
                id, newPassport);
        Passport passport = passportRepository.findById(id)
                                              .orElseThrow(() -> new NoSuchPassportException(
                                                      "There is no passport with ID=" + id +
                                                              " in database"));
        passport.setFirstName(newPassport.getFirstName());
        passport.setSecondName(newPassport.getSecondName());
        passport.setBirthDate(newPassport.getBirthDate());
        passport.setExpirationDate(newPassport.getExpirationDate());
        //        passport.se(newPassport.ge);
        Passport result = passportRepository.save(passport);
        log.debug(LOG_END +
                        "Passport updatePassport(Integer id = {}, Passport newPassport = {}): result = {}",
                id, newPassport, result);
        return result;
    }

    //----------------------------------------------------------------------------------------------------
    @Override
    public void deletePassport(Integer id) {
        log.debug(LOG_START + "void deleteEmployee(Integer id = {})", id);
        Passport passport = passportRepository.findById(id)
                                              .orElseThrow(
                                                      () -> new NoSuchPassportException(
                                                              "There is no passport with ID=" + id +
                                                                      " in database"));
        passportRepository.delete(passport);
        log.debug(LOG_END + "void deletePassport(Integer id): passport {} was deleted", passport);
    }

    //    //----------------------------------------------------------------------------------------------------
    //    @Override
    //    public void markEmployeeAsDeleted(Integer id) {
    //        log.debug(LOG_START + "void markEmployeeAsDeleted(Integer id = {}): ", id);
    //        Employee employee = passportRepository.findById(id)
    //                                              .orElseThrow(
    //                                                      () -> new NoSuchEmployeeException(
    //                                                              "There is no employee with ID=" + id +
    //                                                                      " in database"));
    //        employee.setIsDeleted(Boolean.TRUE);
    //        passportRepository.save(employee);
    //        log.debug(LOG_END +
    //                        "void markEmployeeAsDeleted(Integer id): employee = {} was marked as delete",
    //                employee);
    //    }
    //
    //    //----------------------------------------------------------------------------------------------------
    //    @Override
    //    public List<Employee> getAll() {
    //        log.debug(LOG_START + "List<Employee> getAll().");
    //        List<Employee> result = passportRepository.findAll();
    //        log.debug(LOG_END + "List<Employee> getAll(): result = {}", result);
    //        return result;
    //    }

    //----------------------------------------------------------------------------------------------------

}






