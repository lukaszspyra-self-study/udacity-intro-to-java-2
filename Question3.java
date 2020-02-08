public class Question3 {

    public static void main(String[] args){

        boolean canSeePlayer;
        boolean playerPoweredUp;

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
