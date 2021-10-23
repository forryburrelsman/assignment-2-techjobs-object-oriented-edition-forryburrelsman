package org.launchcode.techjobs.oo.test;

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
        assertNotEquals("Ids should not be equal", job1.getId(), job2.getId());
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

        assertNotEquals(job3, job4);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job5 = new Job("Stay at Home Dad", new Employer("Cats"), new Location("Home"),
                new PositionType("Remote"), new CoreCompetency("Extra Skilled"));
        assertEquals(0, job5.toString().indexOf("\n"));
        assertEquals(job5.toString().lastIndexOf("\n"), job5.toString().length()-1);

    }
}
