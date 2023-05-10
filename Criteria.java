public class Criteria {
    public static boolean isDateOfBirthEligible(Students student) {
        String dob = student.getDOB();
        String[] parts = dob.split("/");
        String year = parts[2];
        if (Integer.parseInt(year) >= 1999)
            return true;
        else
            return false;
    }

    public static boolean isPcmPcbAverageEligible(Students student) {
        Integer physicsMarks = student.getHscMarks().get("Physics");
        Integer chemistryMarks = student.getHscMarks().get("Chemistry");
        Integer mathsMarks = student.getHscMarks().get("Maths");

        if (physicsMarks == null || chemistryMarks == null || mathsMarks == null) {
            return false;
        }
        int pcmTotal = physicsMarks + chemistryMarks + mathsMarks;
        double pcmAverage = pcmTotal / 3.0;
        return pcmAverage >= 60.0;
    }

    public static boolean isUgCgpaEligible(Students student) {
        return student.getUgCgpa() >= 7.0;
    }

    public static boolean isPgCgpaEligible(Students student) {
        if (student.getPgCgpa() != 0.0) {
            return student.getPgCgpa() >= 7.0;
        }
        return true;
    }

    public static boolean isFullTimeEligible(Students student) {
        if (student.getUgCgpa() >= 8.0 && student.getProjectsDone() >= 2) {
            return true;
        }
        if (student.getUgCgpa() >= 8.0 && student.getInterviewMarks() >= 35) {
            return true;
        }
        return false;
    }

    public static boolean isCitizenEligible(Students candidate) {
        if (candidate.isCitizen().equalsIgnoreCase("Indian"))
            return true;
        else
            return false;
    }

}
