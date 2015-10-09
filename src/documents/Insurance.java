package documents;

import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

/**
 * Created by aganezov on 10/7/15.
 * JetBrains GWU
 */
public class Insurance extends TimeRangedDocument {
    private ArrayList<String> owners = new ArrayList<>();
    private String VIN;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Insurance)) return false;

        Insurance insurance = (Insurance) o;

        return getOwners().equals(insurance.getOwners()) && getVIN().equals(insurance.getVIN());

    }
    public void addOwner(String owner) {
        if (owner != null) {
            this.owners.add(owner);
        }
    }

    public boolean removeOwner(String owner){
        if (owner != null && this.owners.contains(owner)){
            this.owners.remove(owner);
            return true;
        }
        return false;
    }



    @Override
    public int hashCode() {
        int result = getOwners().hashCode();
        result = 31 * result + getVIN().hashCode();
        return result;
    }

    public ArrayList<String> getOwners() {

        return owners;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public Insurance(String owner, String VIN, Date beginning, Date end) {
        super(beginning, end);
        this.owners.add(owner);
        this.VIN = VIN;
    }

    public Insurance(ArrayList<String> owners, String VIN, Date beginning, Date end) {
        super(beginning, end);
        this.owners.addAll(owners.stream().collect(Collectors.toList()));
        this.VIN = VIN;
    }

    public boolean isValidByToday() {
        return this.isValidByDate(new Date());
    }

    public boolean isValidByDate(Date date){
        return date.after(this.getBeginning()) && date.before(this.getEnd());
    }
}
