public class Job implements Runnable { 
   private int jobNumber;
   Job(int jobNumber) {
      this.jobNumber = jobNumber;
   }
   
   public void run () {
   // Undertake the required work, here we will emulate it by sleeping for a period
   System.out.println("Job: " + jobNumber + " is ending in thread : "
      + Thread.currentThread(). getName());
   }
}
