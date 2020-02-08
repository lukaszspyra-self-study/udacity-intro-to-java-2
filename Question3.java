public class Question3 {

    public static void main(String[] args){

        private boolean canSeePlayer = true;
        private boolean playerPoweredUp = false;

        if (canSeePlayer) {
            if (!playerPoweredUp) {
                System.out.println("Attack!");
            } else {
                System.out.println("Run away!");
            }
        } else {
            System.out.println("Wander.");
        }
    }
}
