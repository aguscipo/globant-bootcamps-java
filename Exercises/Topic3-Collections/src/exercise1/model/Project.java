package exercise1.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import exercise1.model.Project;

public class Project implements Comparable<Project>  {
	  public Set<Employee> members=new HashSet<Employee>();
	  public Employee projectLeader;
	  public Employee projectManager;
	  public int budget;
	  public int id;
	  
	public Project(Set<Employee> members, Employee projectLeader, Employee projectManager, int id) {
		super();
		this.members = members;
		this.projectLeader = projectLeader;
		this.projectManager = projectManager;
		this.id = id;
	}
	
	public Project(int id, int budget) {
		super();
		this.budget = budget;
		this.id = id;
	}
	

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public Set<Employee> getMembers() {
		return members;
	}
	public void setMembers(Set<Employee> members) {
		this.members = members;
	}
	public Employee getProjectLeader() {
		return projectLeader;
	}
	public void setProjectLeader(Employee projectLeader) {
		this.projectLeader = projectLeader;
	}
	public Employee getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(Employee projectManager) {
		this.projectManager = projectManager;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

    @Override
    public String toString() {
        return "Project{" +
                "id='" + id + '\'' +
                ", budget= $" + budget +
                '}';
    }
    
    public int compareTo(Project project) {
        if(this.getBudget() > project.getBudget()) {
            return 1;
        } else if (this.getBudget() < project.getBudget()) {
            return -1;
        } else {
            return 0;
        }
    }
	  
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Double.compare(project.budget,budget) == 0 &&
                Objects.equals(id, project.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, budget);
    }
	  
}
