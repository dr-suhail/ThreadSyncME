 
 class Syn1DisplayThread implements Runnable {

	
	public synchronized void display(String str) {
	
		int strlen=str.length();
		
		for (int i=0; i< strlen; i++) {
			
			System.out.print(str.charAt(i));
			
			try{
				Thread.sleep(100);	
			}
			catch(InterruptedException e){
				System.out.println("");	
			}
	
		}
	}
	
	/* this function will execute separate code for each thread */
	public void run(){
		
		String str = Thread.currentThread().getName();	
		
		if( str.compareTo("thread1")==0 ){
			for(int i=0;i<10;i++)
				display("Hello World\n");
		}
		else{
			for(int i=0;i<10;i++)
				display("Bonjour monde\n");
		}
	}
}


public class Syn1 {
    
	public static void main(String[] args) {

		/* 	create object that will execute the two threads */
		Syn1DisplayThread dt = new Syn1DisplayThread();
		
		/* create two threads */
		Thread thread1 = new Thread(dt, "thread1");
		Thread thread2 = new Thread(dt, "thread2");
		
		/* start the threads */
		thread1.start();
		thread2.start();
		
		/* main thread will wait for thread1 and thread2 to complete */
		try{
		
			thread1.join();
			thread2.join();
		}	
		catch(InterruptedException ie){
		
			System.out.println("Thread1 join interrupted");	
			
		}	
	}
}
