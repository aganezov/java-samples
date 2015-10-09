package documents;

import java.util.Date;

/**
 * Created by aganezov on 10/7/15.
 * JetBrains GWU
 */
public class Inspection extends TimeRangedDocument {
    private String VIN;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Inspection)) return false;

        Inspection that = (Inspection) o;

        return getVIN().equals(that.getVIN());

    }

    @Override
    public int hashCode() {
        return getVIN().hashCode();
    }

    public String getVIN() {

        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public Inspection(Date beginning, Date end, String VIN) {
        super(beginning, end);
        this.VIN = VIN;
    }
}
