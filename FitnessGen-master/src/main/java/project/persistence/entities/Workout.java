package project.persistence.entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Workout")
public class Workout{
    @Id
    //@ColumnName(name = "exerciseId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    private Long exerciseID;
	private String name;
	

	public Workout() {
	}

	//Get and Set functions for Exercise
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getExerciseID() {
		return exerciseID;
	}


	public void setExerciseID(Long exerciseID) {
		this.exerciseID = exerciseID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	

}