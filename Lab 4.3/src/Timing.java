import java.util.TimerTask;

import com.sun.glass.ui.Timer;

public class Timing {

private int secs;

public Timing(int secs)
{
	this.secs = secs;
}
public int getSeconds()
{
	return this.secs;
}
public void doSomething() throws InterruptedException
{
	 Thread thread = new Thread();
	for(int i = this.secs;i>=0;i--)
	{
		thread.sleep(1000);
		System.out.println(i);
	}
}
	
}
