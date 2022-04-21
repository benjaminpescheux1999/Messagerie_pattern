package state;

public class StatePatternDemo {
    public static void main(String[] args) {
       Context context = new Context();
 
       PresentState presentState = new PresentState();
       presentState.doAction(context);
 
       System.out.println(context.getState().toString());
 
       AbsentState absentState = new AbsentState();
       absentState.doAction(context);
 
       System.out.println(context.getState().toString());
    }
 }