package Hotelmanagement2;
import java.util.*;
public class Task {
	private Map<String, List<String>> tasksByCategory = new HashMap<>();

    public void assignTask(String category, String task) throws InvalidTaskAssignmentException {
    	category = category.toLowerCase();
        
        if (tasksByCategory.containsKey(category)) {
            tasksByCategory.get(category).add(task);
        } else {
            throw new InvalidTaskAssignmentException("Invalid employee category.");
        }
    }
    public List<String> getTasksByCategory(String category) {
        return tasksByCategory.getOrDefault(category.toLowerCase(), new ArrayList<>());
    }

}
