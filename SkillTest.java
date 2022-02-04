import static org.junit.Assert.*;
import org.junit.*;

public class SkillTest{
    @Test 
    public void multiply(){
        assertEquals(6, Skill.multiply(2, 3));
    }
}