package bizz.global77.model;

import javax.persistence.Entity;

@Entity
public class Manager extends Employee {

    @Override
    public String toString() {
        return "Manager";
    }

}
