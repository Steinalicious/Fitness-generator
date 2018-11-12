package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    
	private String userName;
	private String password;
	private int age;
	private String gender;
	private int weight;
	private int height;
	
	public User() {
	};
	
	//Get and Set functions for User
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
    public String toString() {
        return String.format(
                "User and password[userName=%s, password=%s]",
                userName,password);
    }
	

}