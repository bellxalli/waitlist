import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.TreeSet;


public class WaitlistTest {
  
  // TODO: Implement tests for removeStudents

  @Test
  public void removeStudentsWorking() 
  {
  // Arrange
    String[] studentIds = {"a", "b", "c", "d", "e", "f", "g"};
    Waitlist sIds = new Waitlist(studentIds, 7);

  // Act
    TreeSet<String> remove = new TreeSet<>();
    remove.add("b");
    remove.add("d");
    remove.add("e");
    sIds.removeStudents(remove);

  // Assert
    String[] result = sIds.getWaitlist();
    String[] actual = {"a", "c", "f", "g", "", "", ""};
    Arrays.equals(result, actual);
  }


  @Test
  public void removeStudentsNoMatch() 
  {
  // Arrange
    String[] studentIds = {"a", "b", "c", "d", "e", "f", "g"};
    Waitlist sIds = new Waitlist(studentIds, 7);

  // Act
    TreeSet<String> remove = new TreeSet<>();
    remove.add("b");
    remove.add("d");
    remove.add("z");
    remove.add("e");
    remove.add("x");
    sIds.removeStudents(remove);

  // Assert
    String[] result = sIds.getWaitlist();
    String[] actual = {"a", "c", "f", "g", "", "", ""};
    Arrays.equals(result, actual);
  }

  
  @Test
  public void removeStudentsAll() 
  {
  // Arrange
    String[] studentIds = {"a", "b", "c", "d", "e"};
    Waitlist sIds = new Waitlist(studentIds, 5);

  // Act
    TreeSet<String> remove = new TreeSet<>();
    remove.add("a");
    remove.add("b");
    remove.add("c");
    remove.add("d");
    remove.add("e");
    sIds.removeStudents(remove);

  // Assert
    String[] result = sIds.getWaitlist();
    String[] actual = {"", "", "", "", ""};
    Arrays.equals(result, actual);
  }

  @Test
  public void removeStudentsNone() 
  {
  // Arrange
    String[] studentIds = {"a", "b", "c", "d", "e"};
    Waitlist sIds = new Waitlist(studentIds, 5);

  // Act
    TreeSet<String> remove = new TreeSet<>();
    sIds.removeStudents(remove);

  // Assert
    String[] result = sIds.getWaitlist();
    String[] actual = {"a", "b", "c", "d", "e"};
    Arrays.equals(result, actual);
  }  

  // Hints:
  // - removeStudents is an instance method, so your arrange will need to create an instance of Waitlist
  // - When comparing arrays you should use Arrays.equals instead of the equals instance method or ==
  //     java.util.Arrays is imported for you at the top of this file. 
}