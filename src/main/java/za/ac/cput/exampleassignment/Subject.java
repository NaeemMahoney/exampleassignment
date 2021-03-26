package za.ac.cput.exampleassignment;

/**
 * Na'eem Mahoney - 218190751
 *
 */
public class Subject {

    private String subjectId, subjectName, subjectYear;

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectYear() {
        return subjectYear;
    }

    public void setSubjectYear(String subjectYear) {
        this.subjectYear = subjectYear;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName=" + subjectName +
                ", subjectYear=" + subjectYear +
                '}';
    }
}
