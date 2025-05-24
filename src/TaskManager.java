import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    List<Task> tasks = new ArrayList<>();

    private int nextId;

    public TaskManager() {

    }
    public void addTask (String descr){
        nextId++;
        Task newTask = new Task(nextId,descr,false);
        tasks.add(newTask);
        System.out.println("Successfully added");
    }
    public void removeTask(int id){
        Task taskToRemove = null;

        for (Task task : tasks){
            if (task.getId() == id){
                taskToRemove = task;
                break;
            }
        }
         if (taskToRemove != null){
             tasks.remove(taskToRemove);
             System.out.println("Task removed");
         }
         else {
             System.out.println("We cannot find your task");
         }
    }
    public void completeTask(int id ){
        boolean found = false;
        for (Task task : tasks){
            if (task.getId() == id && !task.isCompleted()){
                task.setCompleted(true);
                System.out.println("Your task successfully completed!");
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("We cannot find your task or your task already complete");
        }
    }
    public void listTasks(){
        if (tasks.isEmpty()){
            System.out.println("Your list is empty");
            return;
        }
        for (Task task : tasks){

            System.out.println("[" + (task.isCompleted() ? "complete" : "not complete") + "] " +  "Task id: " + task.getId()  + " "+ "Description: " + " " +  task.getDescription());
        }
    }
    public void clearCompletedTasks(){
        tasks.removeIf(Task::isCompleted);
        System.out.println("All tasks successfully removed");



    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "tasks=" + tasks +
                ", nextId=" + nextId +
                '}';
    }
}
