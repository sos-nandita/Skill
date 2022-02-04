import static org.junit.Assert.*;
import org.junit.*;

public class SkillTest{
    @Test 
    public void multiply(){
        assertEquals(3, Skill.multiply(2*3));
    }
}