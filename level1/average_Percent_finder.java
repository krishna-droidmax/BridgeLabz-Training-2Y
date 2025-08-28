public class average_Percent_finder {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        int totalSubjects = 3;
        int totalMarks = 100 * totalSubjects;

        int obtainedMarks = maths + physics + chemistry;
        double percentage = (double) obtainedMarks / totalMarks * 100;

        System.out.println("Average percent mark in PCM: " + percentage + "%");
    }
}
