package bizz.global77.controller;

import bizz.global77.model.Course;
import bizz.global77.repository.CourseRepository;
import bizz.global77.repository.LearnerCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;
import java.util.List;


@Controller
public class LearnerCourseController {
    @Autowired
    LearnerCourseRepository learnerCourseRepository;
    @Autowired
    CourseRepository courseRepository;



    @RequestMapping(value = "/addcourse", method = RequestMethod.GET)
    public ModelAndView showCourseForm() {
        return new ModelAndView("add_course", "courseForm", new Course());
    }
    @RequestMapping(value = "/courseAction", method = RequestMethod.POST)
    public String submitCourse(@Valid @ModelAttribute("courseForm") Course course, BindingResult result, ModelMap model) {
        System.out.println(result);

        if (result.hasErrors()) {
            model.addAttribute("error", result);
            return "add_course";
        }
       courseRepository.save(course);
        String message = "Successfully Added.. " + course.toString();
        // add message to model
        model.addAttribute("message", message);
        return "course_acknowledge";

    }

    @RequestMapping(value = "/listlearnercourse")
    public String listEmployee(@Valid @ModelAttribute("listlearnercourse") Course Course, BindingResult result,
                               ModelMap model) {
        List<Course> learnerCourse = courseRepository.findAll();
        model.addAttribute("mylistCourse", learnerCourse);
        return "list_course";
    }

    @GetMapping("/dellistlearnercourse")

    public String delete(@RequestParam String learnerCourseid) {
         courseRepository.deleteById(learnerCourseid);
        return "redirect:/listlearnercourse";
    }


}
