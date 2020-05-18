package enums;

public class Enums {

    enum State{
        ACTIVE,
        INACTIVE,
        PAUSED,
        EXIT
    }

    public static void main(String[] args) {

        State state = State.PAUSED;

        switch (state){
            case EXIT:
                System.out.println("exit");
                break;
            case ACTIVE:
                System.out.println("active");
                break;
            case PAUSED:
                System.out.println("paused");
                break;
            case INACTIVE:
                System.out.println("inactive");
                break;
            default:
                System.out.println("impossible");
        }
    }




}
