package vehicles;

import documents.Inspection;
import documents.Insurance;

import java.util.Date;

/**
 * Created by aganezov on 10/7/15.
 * JetBrains GWU
 */
public class Automobile {
    private Integer odometer;
    private String owner;
    private Insurance insurance;
    private Inspection inspection;

    public Automobile(String owner, Insurance insurance, Inspection inspection) throws Exception {
        if (owner == null || insurance == null || inspection == null) {
            throw new Exception("Both \"owner\", \"insurance\" and \"inspection\" must be non-null");
        }
        if (!insurance.getOwners().contains(owner)) {
            throw new Exception("Vehicle owner must be on the insurance");
        }
        this.setOwner(owner);
        this.setInsurance(insurance);
        this.setInspection(inspection);
    }

    public Integer getOdometer() {
        return odometer;
    }

    public void setOwner(String newOwner){
        this.owner = newOwner;
    }

    public String getOwner() {
        return owner;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public Inspection getInspection() {
        return inspection;
    }

    public boolean hasValidInsuraceOnDate(Date date) {
        return this.insurance.getOwners().contains(owner) && this.insurance.isValidByDate(date);
    }

    public boolean hasValidInsuranceToday(){
        return this.hasValidInsuraceOnDate(new Date());
    }

    public void setInspection(Inspection inspection) {
        if (this.inspection != null) {
            this.inspection = inspection;
        }

    }

    public void incrementOdometer(int incrementSize){
        this.odometer += incrementSize;
    }

    public void incrementOdometerByOne(){
        this.incrementOdometer(1);
    }

    public void setInsurance(Insurance insurance) {
        if (insurance != null) {
            this.insurance = insurance;
        }
    }
}
