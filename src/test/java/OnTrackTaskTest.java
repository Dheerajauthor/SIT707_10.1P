import org.example.OnTrackTaskFactory;
import org.example.OnTrackTaskModel;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class OnTrackTaskTest {
    @Test
    public void testCreateTask() {
        OnTrackTaskModel task = OnTrackTaskFactory.createTask("0012", "Task 1", "Description 1", "2021-01-01", "Not Started");
        assertEquals("0012", task.getStudentId());
        assertEquals("Task 1", task.getTaskName());
        assertEquals("Description 1", task.getTaskDescription());
        assertEquals("2021-01-01", task.getTaskDueDate());
        assertEquals("Not Started", task.getTaskStatus());
    }

    @Test
    public void testCreateTaskList() {
        List<OnTrackTaskModel> taskList = OnTrackTaskFactory.createTaskList();
        assertEquals(3, taskList.size());
    }

    @Test
    public void testGetTaskList() {
        List<OnTrackTaskModel> taskList = OnTrackTaskFactory.getTaskList();
        assertEquals(3, taskList.size());
    }

    @Test
    public void testGetStudentTasks() {
        List<OnTrackTaskModel> taskList = OnTrackTaskFactory.getTasks("0012");
        assertEquals(3, taskList.size());

        taskList = OnTrackTaskFactory.getTasks("0013");
        assertEquals(0, taskList.size());
    }
}
