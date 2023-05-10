public class Recruitment {
    public double calculateFinalMarks(Students student) {
        double ugCgpa = student.getUgCgpa();
        double pgCgpa = student.getPgCgpa();

        int projectsDone = student.getProjectsDone();
        double interviewMarks = student.getInterviewMarks();

        double totalMarks = (ugCgpa * 0.3) + (pgCgpa * 0.3) + (projectsDone * 0.1) + (interviewMarks *
                0.1);

        return totalMarks;

    }

}
