package state;

public class PresentState implements state {

    public void doAction(Context context) {
       context.setState(this);	
    }
 
    public String toString(){
       return "L'utilisateur est présent";
    }
 }