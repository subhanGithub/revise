package revise;

public class Mainthread {

	
		public static void main(String[] args) throws InterruptedException {
			
//			myThread.mt=Thread.currentThread();
//			myThread t=new myThread("subhan");//this is one thread 
//			myThread t2=new myThread("SAMEER");// this is second thread
//			t2.setPriority(6);
//			
//			t.start();
//		t2.start();
//		
//			for(int i=0;i<10;i++)
//			{
//				 System.out.println("MAIN THREAD");
//			}
			 
			System.out.println(Thread.currentThread().isDaemon());
			System.out.println(Thread.currentThread().isDaemon());
			myThread t=new myThread();
			t.setDaemon(true);
			t.start();
		    System.out.println(t.isDaemon());
		}
	}
