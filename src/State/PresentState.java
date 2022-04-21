package State;

public class PresentState implements state {

    public void doAction(Context context) {
       System.out.println("L'utilisateur est présent");
       context.setState(this);	
    }
 
    public String toString(){
       return "PresentState";
    }
 }