public class Main {
    public static void main(String[] args) {
        TaskManagement manager = new TaskManagement();
        manager.addTask(new Task(101, "Complete Assignment", "Pending"));
        manager.addTask(new Task(102, "Study Java", "In Progress"));
        manager.addTask(new Task(103, "Practice DSA", "Pending"));
        manager.addTask(new Task(104, "Submit Project", "Completed"));
        manager.displayTasks();
        System.out.println("Searching Task with ID 103");
        Task task=manager.searchTask(103);
        if (task!=null) {
            task.display();
        } else {
            System.out.println("Task Not Found.");
        }
        System.out.println();
        manager.deleteTask(102);
        manager.displayTasks();
    }
}
