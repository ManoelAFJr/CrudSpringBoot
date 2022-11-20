package net.java.springboot;

import net.java.springboot.model.Employee;
import net.java.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

   public static void main(String[] args) {
      SpringApplication.run(SpringbootBackendApplication.class, args);
   }

   @Autowired
   private EmployeeRepository employeeRepository;

   @Override
   public void run(String... args) throws Exception {
//      Employee employee = new Employee();
//      employee.setFirstName("Manoel");
//      employee.setLastName("Junior");
//      employee.setEmailId("manoeljr@gmail.com");
//      employeeRepository.save(employee);
//
//      Employee employee1 = new Employee();
//      employee1.setFirstName("Iris");
//      employee1.setLastName("Cristina");
//      employee1.setEmailId("iriscris@gmail.com");
//      employeeRepository.save(employee1);
   }
}
