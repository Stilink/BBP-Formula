# BBP Formula

## Part I - Introduction to Java Threads

Change the beginning with `start()` to `run()`. How does the output change? Why?

- The method start execute the code in the run method in CountThread at a new executable thread besides the main thread, in a concurrent way, furthermore it creates a new space in memory in which the new thread will be executed
-  The run call in the main thread only executes the method "run" declare in the CountThread class, just like an any other method 
```java
public  class  CountThread  implements  Runnable  {
	private  int  A,  B;
	
	public  CountThread(int  A,  int  B) {
		this.A = A;
		this.B = B;
	}

	@Override
	public  void  run() {
		for (int  i = A; i <= B; i++) {
			System.out.println(i);
		}
	}
}
```
## Part II - BBP Formula Exercise
