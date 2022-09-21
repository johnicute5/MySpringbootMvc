package bizz.global77.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LearnerCourse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate approvalDate;
	
	private LocalDate completionDate;
	
	private String status;
	
	@ManyToOne
	private Learner learner;
	
	@ManyToOne
	private Course course;
	
	@ManyToOne
	private Manager approverManager;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(LocalDate approvalDate) {
		this.approvalDate = approvalDate;
	}

	public LocalDate getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(LocalDate completionDate) {
		this.completionDate = completionDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Learner getLearner() {
		return learner;
	}

	public void setLearner(Learner learner) {
		this.learner = learner;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Manager getApproverManager() {
		return approverManager;
	}

	public void setApproverManager(Manager approverManager) {
		this.approverManager = approverManager;
	}

	@Override
	public String toString() {
		return "LearnerCourse [id=" + id + ", approvalDate=" + approvalDate + ", completionDate=" + completionDate
				+ ", status=" + status + ", learner=" + learner + ", course=" + course + ", approverManager="
				+ approverManager + "]";
	}
	
}
