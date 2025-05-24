public class Task {

    private int id;
    private String description;

    private boolean isCompleted = false;

    public Task(int id, String description, boolean isCompleted) {
        setId(id);
        setDescription(description);
        this.isCompleted = isCompleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        if ( newId > 0 ){
            this.id = newId;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        if (newDescription == null || newDescription.trim().isEmpty()){
            System.out.println("Cannot be empty!");
            return;
        }
        this.description = newDescription;

    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
