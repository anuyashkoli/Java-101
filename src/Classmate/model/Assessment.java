package Classmate.model;

public class Assessment {
    //Attributes
    private double internalAssessment1;
    private double internalAssessment2;
    private double endSemExam;
    private double termWork;
    private double practicalOral;

    // Constructor
    public Assessment(double IA1, double IA2, double ESE, double TW, double PO) {
        internalAssessment1 = IA1;
        internalAssessment2 = IA2;
        endSemExam = ESE;
        termWork = TW;
        practicalOral = PO;
    }

    // IA Average Calculator
    public double getInternalAssessmentAverage() {
        return (internalAssessment1 + internalAssessment2) / 2;
    }

    // Gross Marks (Intentionally Misspelt)
    public double getTheoryTotal() {
       return  (getInternalAssessmentAverage() + endSemExam);
    }

    public double getPracticalTotal() {
        return termWork + practicalOral;
    }

    // GETTERs

    public double getInternalAssessment1() {
        return internalAssessment1;
    }

    public double getInternalAssessment2() {
        return internalAssessment2;
    }

    public double getEndSemExam() {
        return endSemExam;
    }

    public double getTermWork() {
        return termWork;
    }

    public double getPracticalOral() {
        return practicalOral;
    }

    // Individual SETTERs for Assessment
    public void setInternalAssessment1(double IA1) {
        this.internalAssessment1 = IA1;
    }

    public void setInternalAssessment2(double IA2) {
        this.internalAssessment2 = IA2;
    }

    public void setEndSemExam(double ESE) {
        this.endSemExam = ESE;
    }

    public void setTermWork(double TW) {
        this.termWork = TW;
    }

    public void setPracticalOral(double PO) {
        this.practicalOral = PO;
    }
}
