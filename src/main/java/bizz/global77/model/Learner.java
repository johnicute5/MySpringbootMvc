package bizz.global77.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Learner extends Employee {

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public List<LearnerCourse> getLearnerCourse() {
		return learnerCourse;
	}

	public void setLearnerCourse(List<LearnerCourse> learnerCourse) {
		this.learnerCourse = learnerCourse;
	}

	@ManyToOne
	private Manager manager;

	@OneToMany(mappedBy = "learner")
	private List<LearnerCourse> learnerCourse;

	@Override
	public String toString() {
		return "Learner Employee";
	}
}
