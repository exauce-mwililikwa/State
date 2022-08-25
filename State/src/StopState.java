public class StopState implements State {

    public String toString(){
        return "Stop state";
    }

    @Override
    public void doAction(Context context) {
System.out.println("Player is in stop state");
context.setState(this);
    }
}
