import java.util.Arrays;
import java.util.Set;

public class Waitlist {
  private String[] studentIds;

  /**
   * Creates a waitlist with the given student IDs and capacity.
   * 
   * The `capacity` determines the maximum number of students that can be on the waitlist.
   * If `capacity` is larger than the number of given student IDs, the additional slots 
   * in the waitlist will be initialized as `null`.
   * 
   * @param studentIds the initial student IDs to include on the waitlist
   * @param capacity the total capacity of the waitlist
   * @throws IllegalArgumentException if `capacity` is smaller than the number of given student IDs
   */
  public Waitlist(String[] studentIds, int capacity) {
    if (capacity < studentIds.length) {
      throw new IllegalArgumentException(
          "Capacity (" + capacity + ") cannot be smaller than the number of student IDs given (" + studentIds.length + ")."
      );
    }
    this.studentIds = Arrays.copyOf(studentIds, capacity);
  }

  /**
   * Removes students with the given studentIds from the waitlist.
   * 
   * If a studentId in the toRemove Set is not present in the waitlist,
   * that student is ignored. The remaining students on the waitlist
   * have their order preserved.
   * 
   * @param toRemove studentIds of the students to remove
   */
  public void removeStudents(Set<String> toRemove) {
    // TODO: Implement this!
    // The remaining students should be slid down to the front of the array, not
    // leaving any gaps. All the nulls should be at the end.
    // Example:
    // studentIds: ["x", "r", "q", "m", "v", null, null]
    // toRemove: {"r", "m"}
    //
    // expected studentIds after running: ["x", "q", "v", null, null, null, null] 


    // Required complexity:
    // Time: O(n)
    // Space: O(1)
    // Where n is studentIds.length

    // Don't forget to write tests too!

    /* possible solution like time and space complexity practice
    
    if(nums.length == 0)
      return -1;

    int count = 0;
    int possibleNum = 0;

    //finding the num that shows up most (tiebreaker built in)  
    for(int i = nums.length-1; i >= 0; i--)
    {
      if(count == 0) //starting number and finding recurring num
        possibleNum = nums[i];
      if(nums[i] == possibleNum) //checking if num[i] value has already appeared, ++
        count ++;
      if(nums[i] != possibleNum) //if it hasn't appeared then --
        count--;
    }
     */
  }

  /**
   * Returns a copy of the waitlist.
   * 
   * Null values represent open spaces on the waitlist.
   * 
   * @return a copy of the current waitlist array, including `null` values for open slots
   */
  public String[] getWaitlist() {
    return Arrays.copyOf(studentIds, studentIds.length);
  }

  @Override
  public String toString() {
    return Arrays.toString(studentIds);
  }
}
