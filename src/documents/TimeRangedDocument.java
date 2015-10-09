package documents;

import java.util.Date;

/**
 * Created by aganezov on 10/7/15.
 * JetBrains GWU
 */
public class TimeRangedDocument {
    private Date beginning;
    private Date end;

    @Override
    public String toString() {
        return "TimeRangedDocument{" +
                "beginning=" + beginning +
                ", end=" + end +
                '}';
    }

    public Date getBeginning() {
        return beginning;
    }

    public void setBeginning(Date beginning) {
        this.beginning = beginning;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public TimeRangedDocument(Date beginning, Date end) {

        this.beginning = beginning;
        this.end = end;
    }

    public int index(){
        return 0;
    }
}
