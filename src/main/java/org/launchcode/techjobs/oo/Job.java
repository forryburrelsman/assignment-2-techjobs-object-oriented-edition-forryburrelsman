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
        if (this.getEmployer().equals("") || this.getEmployer() == null){
            employer = new Employer("Data not available");
        }
        if (this.getLocation().equals("")|| this.getLocation()==null){
            //this.setPositionType(new PositionType("Data not available!"));
            location = new Location("Data not available");
        }
        if (this.getPositionType().equals("")||this.getPositionType()==null){
            //positionType = new PositionType("Data not available!");
            positionType = new PositionType("Data not available");
        }
        if (this.getCoreCompetency().equals("") || this.getCoreCompetency()==null){
            //this.setCoreCompetency(new CoreCompetency("Data not available!"));
            coreCompetency = new CoreCompetency("Data not available");
        }
        return "\n"  + "ID: "+ this.getId()+"\n" +
                        "Name: "+ this.getName()+"\n"+
                        "Employer: "+ this.getEmployer()+"\n"+
                        "Location: "+ this.getLocation()+ "\n"+
                        "Position Type: " +this.getPositionType()+ "\n"+
                        "Core Competency: " + this.getCoreCompetency() + "\n";
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
