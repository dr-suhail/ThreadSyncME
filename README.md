# ThreadSyncME
Process synchronization for mutual exclusion using Runnable interface and synchronized method in Java.

To ensure that only one thread accesses stdout at a time.

Create two threads, thread1 and thread2 of the class Syn1DisplayThread.
This class contains the display() method which has been declared as synchronized.
The thread1 calls display(“Hello World\n”) inside the run() method of
the class Syn1DisplayThread. Similarly, thread2 calls display(“Bonjour monde\n”)
inside the run method. Declaring the display() method as synchronized ensures
its mutually exclusive access.

Number of Processes/Threads and their Functions
The “syn1.java” creates a two threads. The thread1 and thread2.
The thread1 displays the message “Hello World” and
thread2 displays the message “Bonjour monde”.
