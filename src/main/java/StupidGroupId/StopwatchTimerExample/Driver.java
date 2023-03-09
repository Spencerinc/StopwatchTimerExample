package StupidGroupId.StopwatchTimerExample;

import org.apache.commons.lang3.time.StopWatch;

/**
 * Stopwatch Timer Example
 * We are learning how to add jars and libraries to code
 */
public class Driver 
{
    public static void main( String[] args )
    {
        System.out.println("------------------------------------\n  Start Run\n");
        
        StopWatch myStopWatch = new StopWatch();

        myStopWatch.start();

        performLengthyProcess();

        myStopWatch.stop();

        System.out.println("  Time is: " + myStopWatch.getTime() + " millisectons");
        
        System.out.println("\n  Finished\n------------------------------------\n");
    }
    
    private static void performLengthyProcess() {
    	try {
    		Thread.sleep(3000); // 3 secondds
    	}
    	catch (InterruptedException e) {
    		e.printStackTrace();
    	}
    }
}
