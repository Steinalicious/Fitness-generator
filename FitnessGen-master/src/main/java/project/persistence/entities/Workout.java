package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "workout")
public class Workout{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    
	private String name;
	private String description;
	private int MET;
	private int reps;
	private int sets;
	private String Type;
	private String difficulty;

	
	public Workout() {
	};
	
	//Get and Set functions for Workout
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMET() {
		return MET;
	}

	public void setMET(int mET) {
		MET = mET;
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public int getSets() {
		return sets;
	}

	public void setSets(int sets) {
		this.sets = sets;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

}