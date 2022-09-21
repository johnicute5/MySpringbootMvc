package bizz.global77.controller;


import bizz.global77.model.Learner;
import bizz.global77.model.Manager;
import bizz.global77.repository.ManagerRepository;
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
public class ManagerController {
    @Autowired
    ManagerRepository managerRepository;

    @RequestMapping(value = "/addManager", method = RequestMethod.GET)
    public ModelAndView showForm(@Valid @ModelAttribute("ManagerForm") Manager Learner, BindingResult result, ModelMap model) {
        return new ModelAndView("add_manager", "managerForm", new Manager());
    }

    @RequestMapping(value = "/addManagerAction", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("ManagerForm") Manager manager, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            model.addAttribute("error", result);
            return "add_manager";
        }
        managerRepository.save(manager);
        String message = "We Welcome you.. " + "Employee Number: " + manager.getEmployeeNumber() + "\n"
                + "Fullname: " + manager.getFirstName() +" "+    manager.getLastName() + " as "
                + manager.toString();
        model.addAttribute("message", message);
        return "manager_acknowledge";

    }

    @RequestMapping(value = "/listManager")
    public String listEmployee(@Valid @ModelAttribute("listManager") Manager manager, BindingResult result,
                               ModelMap model) {
        List<Manager> managers = managerRepository.findAll();
        model.addAttribute("mylistManagers", managers);
        return "list_manager";
    }

//    @GetMapping("/delListManager")
//    public String delete(@RequestParam String managerId) {
//        managerRepository.deleteById(managerId);
//        return "redirect:/listManager";
//    }

    //update emp
    @RequestMapping(value = "/updateManager", method = RequestMethod.GET)
    public ModelAndView showSaveForm() {
        return new ModelAndView("update_manager_form",
                "updateManagerForm", new Manager());
    }

    //    after Update
    @RequestMapping(value = "/updateManagerAction", method = RequestMethod.POST)
    public String submitUpdate(@Valid @ModelAttribute("updateManagerForm") Manager manager, BindingResult result, ModelMap model, String id) {
        System.out.println(result);

        Optional<Manager> myManagerUpdater = managerRepository.findById(id);
        if (result.hasErrors()) {
            model.addAttribute("error", result);
            return "update_Learner_form";
        }
        managerRepository.save(manager);
        model.addAttribute("myManagerUpdater", myManagerUpdater);
        return "redirect:/ListEmployee";

    }

}
