package bizz.global77.repository;

import bizz.global77.model.LearnerCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearnerCourseRepository extends JpaRepository<LearnerCourse,Long> {
}
