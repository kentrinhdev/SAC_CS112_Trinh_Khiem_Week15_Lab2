// Runnable Interface to throw dice 25 times in separate threads
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RunnableInterface implements Runnable 
{
  public boolean running = false;
  
  public RunnableInterface()
  {
    Thread thread = new Thread(this);
    thread.start();
  }
  
  public static void main (String[] args) throws InterruptedException
  {
    List<RunnableInterface> workers = new ArrayList<RunnableInterface>();
    
    System.out.println("This is currently running on the main thread: " +
    					"Throw No. 1 = " + Thread.currentThread().getId());

    Date start = new Date();

    // Add 25 calls to implement Runnable
    for (int i = 0; i < 25; i++)
    {
      workers.add(new RunnableInterface()); 
    }
    
    // Force the main thread to wait for all the threads
    //  to finish their work before checking to see how long it
    //  took to complete
    for (RunnableInterface worker : workers)
    {
      while (worker.running)
      {
        Thread.sleep(100);
      }
    }
    
    Date end = new Date();
    long difference = end.getTime() - start.getTime();
    
    System.out.println("This whole process took: " + difference/1000 + " seconds.");
  }
  
  @Override
  public void run() 
  {
    this.running = true;
    System.out.println("This is running on a separate Pool of Multi-Threads: " +
    					"Throw More Dice = " + Thread.currentThread().getId());
    
    try 
    {
      // this will pause this spawned thread for 5 seconds
      //  (5000 is the number of milliseconds to pause)
      // Also, the Thread.sleep() method throws an InterruptedException
      //  so we must "handle" this possible exception, that's why I've
      //  wrapped the sleep() method with a try/catch block
      Thread.sleep(5000);
    } 
    catch (InterruptedException e) 
    {
      // As user Bernd points out in the comments section below, you should
      //  never swallow an InterruptedException.
      Thread.currentThread().interrupt();
    }
    this.running = false;
  }

} // end RunnableInterface