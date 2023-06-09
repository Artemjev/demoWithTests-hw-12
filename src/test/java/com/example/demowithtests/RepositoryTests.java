package com.example.demowithtests;

import org.junit.Ignore;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@Ignore
@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RepositoryTests {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Test
//    @Order(1)
//    @Rollback(value = false)
//    public void saveEmployeeTest() {
//
//        Employee employee = Employee.builder().name("Mark").country("England").build();
//
//        employeeRepository.save(employee);
//
//        Assertions.assertThat(employee.getId()).isGreaterThan(0);
//        Assertions.assertThat(employee.getId()).isEqualTo(1);
//    }
//
//    @Test
//    @Order(2)
//    public void getEmployeeTest() {
//
//        Employee employee = employeeRepository.findById(1).orElseThrow();
//
//        Assertions.assertThat(employee.getId()).isEqualTo(1);
//
//    }
//
//    @Test
//    @Order(3)
//    public void getListOfEmployeeTest() {
//
//        List<Employee> employeesList = employeeRepository.findAll();
//
//        Assertions.assertThat(employeesList.size()).isGreaterThan(0);
//
//    }
//
//    @Ignore
//    @Test
//    @Order(4)
//    @Rollback(value = false)
//    public void updateEmployeeTest() {
//
//        Employee employee = employeeRepository.findById(1).get();
//
//        employee.setName("Martin");
//        Employee employeeUpdated = employeeRepository.save(employee);
//
//        Assertions.assertThat(employeeUpdated.getName()).isEqualTo("Martin");
//
//    }
//
//    @Test
//    @Order(5)
//    @Rollback(value = false)
//    public void deleteEmployeeTest() {
//        Employee employee = employeeRepository.findById(1).get();
//        employeeRepository.delete(employee);
//        //repository.deleteById(1L);
//        Employee employee1 = null;
//        Optional<Employee> optionalAuthor = Optional.ofNullable(employeeRepository.findByName("Martin"));
//        if (optionalAuthor.isPresent()) {
//            employee1 = optionalAuthor.get();
//        }
//        Assertions.assertThat(employee1).isNull();
//    }

}
