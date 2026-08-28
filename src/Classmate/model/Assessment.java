package Classmate.model;

public class Assessment {
    //Attributes
    double internalAssessment1;
    double internalAssessment2;
    double endSemExam;
    double termWork;
    double practicalOral;

    // IA Average Calculator
    public double getInternalAssessmentAverage() {
        return (internalAssessment1 + internalAssessment2) / 2;
    }

    // Gross Marks (Intentionally Misspelt)
    public double getTheoryTotal() {
       return  (getInternalAssessmentAverage() + endSemExam);
    }

    public double getPracticalOral() {
        return termWork + practicalOral;
    }
}
