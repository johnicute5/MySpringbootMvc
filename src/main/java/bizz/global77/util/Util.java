package bizz.global77.util;

import bizz.global77.model.Employee;
import bizz.global77.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class Util {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    Employee myEmployee;

    public Employee findLearnerAndExceptionIfNotFound(String employeeId) {
        Employee employee;
        Optional<Employee> mySearchEmployee = employeeRepository.findById(employeeId);
        if (mySearchEmployee.isPresent()) {
            employee = mySearchEmployee.get();
        } else {
            throw new NullPointerException("Learner Not Found");
        }
        return employee;

    }
    public String findEmployeeNumberByLastNameOrLastNameByEmployeeNumber
            (String employeeLastName, String employeeNumber) {
        Optional<Employee> mySearchEmployeeLastName = employeeRepository.findById(employeeLastName);
        Optional<Employee> mySearchEmployeeNumber = employeeRepository.findById(employeeNumber);
        if (mySearchEmployeeLastName.isPresent()) {
            return mySearchEmployeeNumber.toString();
        } else {
            if (mySearchEmployeeNumber.isPresent()) {
                return mySearchEmployeeLastName.toString();
            } else {
                return "Doe";
            }
        }
    }
}
