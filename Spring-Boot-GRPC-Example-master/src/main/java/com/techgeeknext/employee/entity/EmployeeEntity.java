package com.techgeeknext.employee.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor
public class EmployeeEntity {
    @Id
    private String emp_id;

    private String name;

    // Getters and Setters (or use Lombok annotations)

    // Constructors
}
