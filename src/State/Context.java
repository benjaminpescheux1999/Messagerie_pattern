package State;

public class Context {
    private state state;
 
    public Context(){
       state = null;
    }
 
    public void setState(state state){
       this.state = state;		
    }
 
    public state getState(){
       return state;
    }
 }