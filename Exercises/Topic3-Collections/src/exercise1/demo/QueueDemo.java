package exercise1.demo;

import java.util.PriorityQueue;
import exercise1.model.*;

/*
 * Suppose we have a collection with all the projects and in a moment
 * of crisis Globant decides to prioritize projects according to their budget.
 * So the next project to be assigned will be the one with lowest budget.
 * To represent the collection of projects I use a Priority Queue. Therefore when
 * the manager select the next project to be treated, this will be the one with the
 * lowest budget.
 */
public class QueueDemo {

	public static void main(String[] args) {
		// Create a PriorityQueue
		PriorityQueue<Project> projectsPriorityQueue = new PriorityQueue<>();

		// Add projects to the Priority Queue
		projectsPriorityQueue.add(new Project(1, 100000));
		projectsPriorityQueue.add(new Project(2, 80000));
		projectsPriorityQueue.add(new Project(3, 200000));
		projectsPriorityQueue.add(new Project(4, 450000));
		projectsPriorityQueue.add(new Project(5, 125000));

		/*
		 * The compareTo() method implemented in the Project class is used to determine
		 * in what order the objects should be dequeued (in this case the lowest budget
		 * project will be removed first)
		 */
		System.out.println("List of Projects order by budget:");

		while (!projectsPriorityQueue.isEmpty()) {
			System.out.println(projectsPriorityQueue.remove());
		}
	}

}
