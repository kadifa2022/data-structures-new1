package co.cydeo.lab09_class_object_encapsulation.scrumTask;

import java.util.ArrayList;


public class ScrumTeam {

    private String PO;
    private String BA;
    private String SM;
    private ArrayList<Tester> testers = new ArrayList<>();// ScrumTeam HAS Tester and Developers
    private ArrayList<Developer> developers = new ArrayList<>();
    private int daysOfSprint;


    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {
        terminate(PO,"Invalid PO name: " + PO);

        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        terminate(BA, "Invalid BA name: " + BA);
        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        terminate(SM, "Invalid SM name: " + SM);
        this.SM = SM;
    }

    public int getDaysOfSprint() {
        return daysOfSprint;
    }

    public void setDaysOfSprint(int daysOfSprint) {
        if(daysOfSprint <= 0 ){
            System.err.println("Invalid days of Spring: " + daysOfSprint);
            System.exit(1);
        }
        this.daysOfSprint = daysOfSprint;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }


    private static void terminate(String arg, String err){
        if(arg== null || arg.trim().isEmpty()){
            System.err.println(err);
            System.exit(1);
        }
    }
}
