package bizz.global77.controller;

import bizz.global77.model.Employee;
import bizz.global77.model.Learner;
import bizz.global77.model.Manager;
import bizz.global77.repository.EmployeeRepository;
import bizz.global77.repository.LearnerRepository;
import bizz.global77.repository.ManagerRepository;
import bizz.global77.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeRepository empRepository;


    //show employees
    @RequestMapping(value = "/listEmployee")
    public String listEmployee(@Valid @ModelAttribute("listEmployee") Employee employee, BindingResult result,
                               ModelMap model) {
        List<Employee> mylistEmp = empRepository.findAll();
        model.addAttribute("mylistEmp", mylistEmp);
        return "list_employee";
    }
    //delete Employee
//    @GetMapping("/deleteEmployee")
//    public String delete(@RequestParam String employeeId) {
//        empRepository.deleteById(employeeId);
//        return "redirect:/listEmployee";
//    }

    //search
    @RequestMapping(value = "/searchEmployee", method = RequestMethod.POST)
    public String showLearnerEmployee(@Valid @ModelAttribute("myEmp") Employee employee,
                                      BindingResult result
            , ModelMap model) {
        Optional<Employee> optionalEmployee = empRepository.findById(employee.getEmployeeNumber());
        Employee myEmployee;
        String error = "";
        if (optionalEmployee.isPresent()) {
            myEmployee = optionalEmployee.get();
        } else {
            error = "Employee Not Found!";
            model.addAttribute("error", error);
            return "error";
        }
        model.addAttribute("res", myEmployee);
        return "my_final_search";


    }
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView showSearchForm() {
        return new ModelAndView("search_form", "searchForm", new Employee());
    }

}
