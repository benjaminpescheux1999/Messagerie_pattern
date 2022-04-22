package Observer;

public class MessageObserver extends Observer{

   public MessageObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println(Integer.toBinaryString(subject.getState())); 
   }
}