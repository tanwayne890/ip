import java.util.ArrayList;

/**
 * TaskList stores an ArrayList of Task to be used by Duke.
 */
public class TaskList {

    protected ArrayList<Task> tasks;

    /**
     * TaskList constructor initializing empty ArrayList.
     */
    public TaskList() {
        tasks = new ArrayList<>();
    }

    /**
     * TaskList constructor specifying an ArrayList to be used.
     */
    public TaskList(ArrayList<Task> tasks) {
        this.tasks = new ArrayList<>(tasks);
    }

    /**
     * Return the number of Tasks saved in TaskList.
     *
     * @return int
     */
    public int size() {
        return tasks.size();
    }

    /**
     * Return a task which occupies in the position of TaskList.
     *
     * @param pos int
     * @return Task
     */
    public Task getTask(int pos) {
        return tasks.get(pos);
    }

    /**
     * Remove a task which occupies in the position of TaskList.
     *
     * @param pos int
     */
    public void removeTask(int pos) {
        tasks.remove(pos);
    }

    /**
     * Add a task into TaskList at the last position.
     *
     * @param task
     */
    public void addTask(Task task) {
        tasks.add(task);
    }
}
