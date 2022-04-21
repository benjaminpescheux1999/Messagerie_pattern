package State;

public class AbsentState implements state {

    public void doAction(Context context) {
       System.out.println("L'utilisateur est absent");
       context.setState(this);	
    }
 
    public String toString(){
       return "AbsentState";
    }
 }