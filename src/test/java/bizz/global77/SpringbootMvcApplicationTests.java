//package bizz.global77;
//
//import bizz.global77.model.Course;
//import bizz.global77.repository.CourseRepository;
//import bizz.global77.repository.EmployeeRepository;
//import bizz.global77.repository.LearnerCourseRepository;
//import bizz.global77.util.Util;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.*;
//
//@SpringBootTest
//class SpringbootMvcApplicationTests {
//
////
//
//    @Autowired
//    LearnerCourseRepository learnerCourse;
//    CourseRepository courseRepository;
//    @Autowired
//    EmployeeRepository employeeRepository;
//    Util util ;
//
//    @Test
//    void courseCategoryAndDuration() {
/////    List<LearnerCourse> learnerCourse = new ArrayList<LearnerCourse>();
//        Course[] arrayOfCourses = {
//                new Course("23344", "Java 101", 25.3, true, "Programming Language"),
//                new Course("24123", "Mandarin 101", 13.3, true, "Language"),
//                new Course("23333", "Baybayin", 13.00, true, "Variable"),
//                new Course("24333", "sql 101", 29.45, true, "Database")
//        };
//        List<Course> courseList = Arrays.asList(arrayOfCourses);
//        courseList.stream()
//                .filter(e -> e.getCategory().equals("Variable"))
//
//                .mapToDouble(e -> e.getMinutesDuration() / 2)
//                .forEach(System.out::println);
//
//
//    }
//
//    @Test
//    public void learnerCourseDesign() {
//        List<LearnerCourse> resultLatest = learnerCourse.findAll();
//        List<Course> resultLatest1 = courseRepository.findAll();
//        double course = resultLatest1.stream()
//                .mapToDouble(Course::getMinutesDuration).sum();
//        System.out.println(resultLatest.stream()
//                .filter(e -> e.getStatus().equals("Completed")).
//                mapToDouble(e -> course).sum());
//
//
//    }
//    @Test
//    public Employee findLearnerAndExceptionIfNotFound(String employeeId) {
//        Employee employee = new Employee() ;
//
//        System.out.println(util.findLearnerAndExceptionIfNotFound(employee.getEmployeeNumber()));
//
//        Optional<Employee> mySearchEmployee = employeeRepository.findById(employeeId);
//        if (mySearchEmployee.isPresent()) {
//            employee = mySearchEmployee.get();
//        } else {
//            throw new NullPointerException("Learner Not Found");
//        }
//        return employee;
//
//    }
//
//
//    @Test
//    public List<LearnerCourse>  myLearnerCoursesLog() {
//            List<LearnerCourse> result = learnerCourse.findAll();
//            result.stream()
//                    .filter(e->e.getStatus().equals("Completed"))
//                    .filter(e->e.getCompletionDate()
//                            .equals(LocalDate.of(2022,Month.APRIL,15)))
//                    .forEach(System.out::println);
//            return result;
//    }
////        List<Course> result2 = courseRepository.findAll();
////        double resultAve = result2.stream()
////                .mapToDouble(Course::getMinutesDuration).summaryStatistics().getAverage();
////        result.stream()
////                .filter(e -> e.getStatus().equals("Completed"))
////                .filter(e -> e.getCompletionDate()
////                        .equals(LocalDate.of(2022, Month.MAY, 10)))
////                .mapToDouble(e->resultAve).
////                forEach(System.out::println);
//
//    }
//
//
////    @Test
////    public void learnerCourseDesign2() {
//
////    List<LearnerCourse> result = 	learnerCourse.findAll();
////        result.stream().filter(e -> e.getLearner().equals(“22-1212”))
////            .filter(e -> e.getStatus().equals(“Completed”))
////            .map(e -> Duration.between(LocalDate.of(2022, Month.MARCH,15),
////            LocalDate.of(2022, Month.JUNE,15)))
////            .collect(Collectors.toList());
////
////    }
//
