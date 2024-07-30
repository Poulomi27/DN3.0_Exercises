public class TaskMS{
    private static class Node {
        int taskId;
        String taskName;
        String status;
        Node next;

        public Node(int taskId, String taskName, String status) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.status = status;
            this.next = null;
        }
    }
    private Node head;

    public void addTask(int taskId, String taskName, String status) {
        Node newNode = new Node(taskId, taskName, status);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void searchTask(int taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.taskId == taskId) {
                System.out.println("Task ID: " + temp.taskId);
                System.out.println("Task Name: " + temp.taskName);
                System.out.println("Status: " + temp.status);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task not found");
    }

    public void traverseTasks() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Task ID: " + temp.taskId);
            System.out.println("Task Name: " + temp.taskName);
            System.out.println("Status: " + temp.status);
            System.out.println();
            temp = temp.next;
        }
    }

    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.taskId == taskId) {
            head = head.next;
            System.out.println("Task Deleted");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.taskId == taskId) {
                temp.next = temp.next.next;
                System.out.println("Task Deleted");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task not found");
    }

    public static void main(String[] args) {
        TaskMS taskLinkedList = new TaskMS();

        taskLinkedList.addTask(1, "Task 1", "In Progress");
        taskLinkedList.addTask(2, "Task 2", "Completed");
        taskLinkedList.addTask(3, "Task 3", "Pending");

        System.out.println("Traversing tasks:");
        taskLinkedList.traverseTasks();

        System.out.println("Searching for task 2:");
        taskLinkedList.searchTask(2);
        System.out.println();

        System.out.println("Deleting task 2");
        taskLinkedList.deleteTask(2);
        System.out.println();

        System.out.println("Traversing tasks after deletion:");
        taskLinkedList.traverseTasks();
    }
}