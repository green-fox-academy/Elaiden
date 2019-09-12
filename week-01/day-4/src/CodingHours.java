public class CodingHours {

    public static void main(String[] args) {

        int avgCodingHours = 6;
        int semesterWeeks = 17;
        int workdaysPerWeek = 5;
        int codingPerSemester = semesterWeeks * workdaysPerWeek * avgCodingHours;

        System.out.println("An average Green Fox attendee spends " + codingPerSemester + " hours with coding during a " + semesterWeeks + " week(s) long semester.");

        int avgWorkingHours = 52;
        int totalWorkingHours = semesterWeeks * avgWorkingHours;
        int codingHoursPercent = (int)(((float)codingPerSemester / (float)totalWorkingHours) * 100);

        System.out.println("The ratio of coding hours is: " + codingHoursPercent + "%");

    }
}
