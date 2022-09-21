package bizz.global77.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {

	@Id
	private String courseNumber;

	private String description;

	private Double minutesDuration;

	private Boolean withBond;

	private String category;

	@OneToMany(mappedBy = "course")
	private List<LearnerCourse> learnerCourse;

	public Course(String courseNumber, String description, Double minutesDuration, Boolean withBond, String category,
			List<LearnerCourse> learnerCourse) {
		super();
		this.courseNumber = courseNumber;
		this.description = description;
		this.minutesDuration = minutesDuration;
		this.withBond = withBond;
		this.category = category;
		this.learnerCourse = learnerCourse;
	}

	public Course() {

	}

	public Course withDuration(Double duration) {
		return this.minutesDuration == duration ? this
				: new Course(courseNumber, description, 
						duration, withBond, category, learnerCourse);
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getMinutesDuration() {
		return minutesDuration;
	}

	public void setMinutesDuration(Double minutesDuration) {
		this.minutesDuration = minutesDuration;
	}

	public Boolean getWithBond() {
		return withBond;
	}

	public void setWithBond(Boolean withBond) {
		this.withBond = withBond;
	}

	public List<LearnerCourse> getLearnerCourse() {
		return learnerCourse;
	}

	public void setLearnerCourse(List<LearnerCourse> learnerCourse) {
		this.learnerCourse = learnerCourse;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Course [courseNumber=" + courseNumber + ", description=" + description + ", minutesDuration="
				+ minutesDuration + ", withBond=" + withBond + ", category=" + category + ", learnerCourse="
				+ learnerCourse + "]";
	}

}
