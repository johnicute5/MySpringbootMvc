package bizz.global77.controller;

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
public class LearnerController {
    @Autowired
    LearnerRepository learnerRepository;
    Util util = new Util();
    @Autowired
    ManagerRepository managerRepository;

    @Autowired
    EmployeeRepository empRepository;

    //employee Enrollment Form
    @RequestMapping(value = "/addLearner", method = RequestMethod.GET)
    public ModelAndView showForm(@Valid @ModelAttribute("ManagerForm") Manager manager, BindingResult result, ModelMap model) {
        List<Manager> managers = managerRepository.findAll();
        model.addAttribute("mylistManagers", managers);
        return new ModelAndView("add_learner", "empForm", new Learner());
    }

    //Result for enrollment
    @RequestMapping(value = "/addLearnerAction", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("empForm") Learner employee, BindingResult result, ModelMap model) {
        System.out.println(result);
        if (result.hasErrors()) {
            model.addAttribute("error", result);
            return "add_learner";
        }
        learnerRepository.save(employee);
        String message = "We Welcome you.. " + employee.getEmployeeNumber() + " " +
                employee.getFirstName() + " " +
                employee.getLastName() + " as " + employee.toString();
        model.addAttribute("message", message);
        return "learner_acknowledge";

    }

    //show Leaner Employee
    @RequestMapping(value = "/listLearner")
    public String listEmployee(@Valid @ModelAttribute("listLearner") Learner employee, BindingResult result,
                               ModelMap model) {
        List<Learner> myLisLearner = learnerRepository.findAll();
        model.addAttribute("myListLearner", myLisLearner);
        return "list_Learner";
    }

    //delete Learner
    @GetMapping("/delListLearner")
    public String delete(@RequestParam String learnerId) {
        empRepository.deleteById(learnerId);
        return "redirect:/listEmployee";
    }

    //update emp
    @RequestMapping(value = "/updateListLearner")
    public ModelAndView showSaveForm(@Valid @ModelAttribute("empForm") Learner employee, BindingResult result,
                                     String employeeId, ModelMap model) {
                 model =  new ModelMap("add_learner");
                 Learner learner = learnerRepository.findById(employeeId).get();
                 model.addAttribute("update",learner);


        return null;
    }

//    //    after Update
//    @RequestMapping(value = "/updateListLearnerAction")
//    public String submitUpdate() {
//        System.out.println(result);
//        String learnerId= employee.getEmployeeNumber();
//        Learner mylistUpdater = learnerRepository.findById(learnerId).get();
//        if (result.hasErrors()) {
//            model.addAttribute("error", result);
//            return "add_learner";
//        }
//        learnerRepository.save(employee);
//        model.addAttribute("myListLearnerUpdater", mylistUpdater);
//        return "redirect:/ListEmployee";
//
//    }


}