
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

public class ExerciseManagementTest {

    @Before
    public void initialize(){
        ExerciseManagement management = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmptyAtBeginning(){
        ExerciseManagement management = new ExerciseManagement();
        assertEquals(0,management.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowListByOne(){
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseisInList(){
        ExerciseManagement management = new ExerciseManagement();
        
        management.add("Weite a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompeted(){
        ExerciseManagement management = new ExerciseManagement();
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("Some exercise"));
    }
}
