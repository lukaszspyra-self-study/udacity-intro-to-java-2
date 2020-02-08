public class Question8 {

    public static void main(String[] args){

        private int dayOfWeek = 4;
        private String schedule = "Searching for day plan";

        switch (dayOfWeek){
            case 1:
                schedule = "Gym in the morning";
                break;
            case 2:
                schedule = "Class after work.";
                break;
            case 3:
                schedule = "Meetings all day";
                break;
            case 4:
                schedule = "Work from home.";
                break;
            case 5:
                schedule = "Game night after work.";
                break;
            default:
                schedule = "Free!";
                break;
        }
    }
}