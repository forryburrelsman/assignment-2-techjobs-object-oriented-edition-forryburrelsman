package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer anEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency){
        this();
        this.name = aName;
        this.employer = anEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    @Override
    public String toString() {
        if (this.getName() == ""){
            name = "Data not available";
        }
        if (employer.getValue().equals("") || employer.getValue() == null){
            employer.setValue("Data not available");
        }
        if (location.getValue().equals("")|| location.getValue()==null){
            //this.setPositionType(new PositionType("Data not available!"));
            location.setValue("Data not available");
        }
        if (positionType.getValue().equals("")||positionType.getValue()==null){
            //positionType = new PositionType("Data not available!");
            positionType.setValue("Data not available");
        }
        if (coreCompetency.getValue().equals("") || coreCompetency.getValue()==null){
            //this.setCoreCompetency(new CoreCompetency("Data not available!"));
            coreCompetency.setValue("Data not available");
        }
        return "\n"  + "ID: "+ this.getId()+"\n" +
                        "Name: "+ name +"\n"+
                        "Employer: "+ employer +"\n"+
                        "Location: "+ location + "\n"+
                        "Position Type: " + positionType + "\n"+
                        "Core Competency: " + coreCompetency + "\n";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
