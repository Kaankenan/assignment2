
public class StudentClass {
	private static long start;
    private static long end;
    private static boolean started;
 
  
    // Controls timer if stop
     
    private static boolean isStopped() {
        return !started;
    }
 
    //Controls timer if stop
    
    private static boolean isStarted() {
        return started;
    }

    //start timer if it started before it will give a RunTimeException error
    public static void start() {
        if (isStopped()) {
            startTimer();
        } else {
            throw new RuntimeException("Hata: Kronometre (Timer) zaten baþlatýlmýþ durumda!!!\n");
        }
    }
 
    private static void startTimer() {
        start = System.nanoTime();
        started = true;
    }
 
    
    //stop timer if it stopped before it will give a RunTimeException error
    public static void stop() {
        if (isStarted()) {
            stopTimer();
        } else {
            throw new RuntimeException("Hata: Kronometre (Timer) baþlatýlmadý!!!\n");
        }
    }
 
    private static void stopTimer() {
        end = System.nanoTime();
        started = false;
    }

    
    //it calculates to time for nanosecond between start and stop method
    public static long getElapsedTime() {
        if (isStopped()) {
            return end - start;
        } else {
            throw new RuntimeException("Hata: Kronometre (Timer) durdurulmadý!!!\n");
        }
 
    }

    //it calculates to time for millisecond between start and stop method
    public static double getElapsedMilliseconds() {
        double seconds = (double) getElapsedTime() / 1000000.0;
        return seconds;
    }

    //it calculates to time for s between start and stop method
    public static double getElapsedSeconds() {
        double seconds = (double) getElapsedTime() / 1000000000.0;
        return seconds;
    }
	
	private int GPA;
	public void setGpa(int a,int b, int c,int d,int e) //I use set method to take info from main class
	{
	this.GPA=(a+b+c+d+e)/5;
	}
	public int getGPA()//I use get method to send gpa from main class
	{
		return this.GPA;
	}
	
}
