public class TaskManagement {
    private Node head;
    public TaskManagement(){
        head=null;
    }
    public void addTask(Task task){
        Node new_node=new Node(task);
        if(head==null){
            head=new_node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;
        }
        System.out.println("Task Added Successfully.");
    }
    public Task searchTask(int taskId){
        Node temp=head;
        while(temp!=null){
            if(temp.task.getTaskId()==taskId){
                return temp.task;
            }
            temp=temp.next;
        }
        return null;
    }
    public void displayTasks(){
        if(head==null){
            System.out.println("No Tasks Available.");
            return;
        }
        Node temp=head;
        System.out.println("Task List");
        System.out.println("ID\tTask Name\tStatus");
        while(temp!=null){
            temp.task.display();
            temp=temp.next;
        }
    }
    public void deleteTask(int taskId){
        if(head==null){
            System.out.println("Task List is Empty.");
            return;
        }
        if(head.task.getTaskId()==taskId){
            head=head.next;
            System.out.println("Task Deleted Successfully.");
            return;
        }
        Node curr=head;
        Node previous=null;
        while(curr!=null && curr.task.getTaskId()!=taskId){
            previous=curr;
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("Task Not Found.");
            return;
        }
        previous.next=curr.next;
        System.out.println("Task Deleted Successfully.");
    }
    
}
