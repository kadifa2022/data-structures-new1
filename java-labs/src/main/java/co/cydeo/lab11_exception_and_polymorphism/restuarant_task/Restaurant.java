package co.cydeo.lab11_exception_and_polymorphism.restuarant_task;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    private String ownerName;
    private String location;
    private double numberOfStars;
    private final ArrayList<Server> servers;
    private final ArrayList<Chef> chefs;

    public Restaurant(String ownerName, String location, double numberOfStars) {
        setOwnerName(ownerName);
        setLocation(location);
        setNumberOfStars(numberOfStars);
        servers = new ArrayList<>();//final and assigned separately  in constructor
        chefs = new ArrayList<>();// that's mean when constructor execute that servers and chef list are created
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(double numberOfStars) {

        if(numberOfStars< 0 || numberOfStars> 5){
            throw  new IllegalArgumentException("Number of stars must be between 0 and 5 ");
        }
        this.numberOfStars = numberOfStars;
    }

    public ArrayList<Server> getServers() {
        return servers;
    }

    public ArrayList<Chef> getChefs() {
        return chefs;
    }

    public void hireServer(Server server){
        if(server ==null){
            // return
            throw new NullPointerException("Server object can not be null");
        }
        servers.add(server);
    }

    public void hireServer(Server [] servers) {// adding all servers object
        for (Server each: servers) {
            if(each ==null){
                throw new NullPointerException("Server object can not be null");
            }
        }
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef){
        if(chef ==null) {
            throw new NullPointerException("Chef can not be null") ;
            }
        chefs.add(chef);

    }

    public void hireChef(Chef [] chefs){
        for (Chef each: chefs) {
            if(each==null){
                throw new NullPointerException("Chef can not be null");
            }

        }
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateServer(String  id){
        servers.removeIf(p-> p.getId().equalsIgnoreCase(id));
    }
    public void terminateChef(String id){
        chefs.removeIf(p->p.getId().equalsIgnoreCase(id));
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "ownerName='" + ownerName + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of servers=" + servers.size() +
                ", number of chefs=" + chefs.size() +
                '}';
    }
}
