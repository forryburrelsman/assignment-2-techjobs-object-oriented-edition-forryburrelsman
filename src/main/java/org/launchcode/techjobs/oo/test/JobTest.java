package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertFalse(job1.getId() == job2.getId());
        //assertNotEquals("Ids should not be equal", job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job.getName() instanceof String);
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job.getName(), "Product tester");
        assertEquals(job.getEmployer().getValue(), "ACME");
        assertEquals(job.getLocation().getValue(), "Desert");
        assertEquals(job.getPositionType().getValue(), "Quality control");
        assertEquals(job.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job job3 = new Job("Stay at Home Dad", new Employer("Cats"), new Location("Home"),
                new PositionType("Remote"), new CoreCompetency("Extra Skilled"));
        Job job4 = new Job("Stay at Home Dad", new Employer("Cats"), new Location("Home"),
                new PositionType("Remote"), new CoreCompetency("Extra Skilled"));
        assertFalse(job3.equals(job4));
        //assertNotEquals(job3, job4);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job5 = new Job("Stay at Home Dad", new Employer("Cats"), new Location("Home"),
                new PositionType("Remote"), new CoreCompetency("Extra Skilled"));
        assertEquals('\n', job5.toString().charAt(0));
        assertEquals('\n', job5.toString().charAt(job5.toString().length()-1));
        //assertEquals(0, job5.toString().indexOf("\n"));
//        assertEquals(job5.toString().lastIndexOf("\n"), job5.toString().length()-1);

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job6 = new Job("Sales", new Employer("Knife Co."), new Location("Travel"),
                new PositionType("Entry"), new CoreCompetency("People Person"));
        assertEquals( "\nID: 4\n" +
                "Name: Sales\n" +
                "Employer: Knife Co.\n" +
                "Location: Travel\n" +
                "Position Type: Entry\n" +
                "Core Competency: People Person\n", job6.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job job8 = new Job("", new Employer("Hot Topic"), new Location("The Mall"),
                new PositionType("Full Time"), new CoreCompetency("Service Experience"));
        assertEquals("\nID: 3\n" +
                "Name: Data not available\n" +
                "Employer: Hot Topic\n" +
                "Location: The Mall\n" +
                "Position Type: Full Time\n" +
                "Core Competency: Service Experience\n", job8.toString());
    }


}
