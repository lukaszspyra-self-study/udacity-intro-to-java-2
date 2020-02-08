public class Question4 {

    public static void main(String[] args) {

        private boolean isSnowing = false;
        private boolean isRaining = true;
        private double temperature = 49.0;

        if (isSnowing || isRaining || temperature < 50){
            System.out.println("Let's stay home");
        } else {
            System.out.println("Let's go out");
        }
    }
}