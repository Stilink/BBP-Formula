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
## Part III - Performance Evaluation
-   Single thread
![](https://raw.githubusercontent.com/Stilink/BBP-Formula/master/img/test-1-thread.PNG)
-   As many threads as processing cores
![](https://raw.githubusercontent.com/Stilink/BBP-Formula/master/img/test-4-threads.PNG)
-   So many threads as double processing cores.
![](https://raw.githubusercontent.com/Stilink/BBP-Formula/master/img/test-8-threads.PNG)
-   200 threads.
![](https://raw.githubusercontent.com/Stilink/BBP-Formula/master/img/test-200-threads.PNG)
-   500 threads
In this one the computer crashed
-   According to [Amdahls law](https://www.pugetsystems.com/labs/articles/Estimating-CPU-Performance-using-Amdahls-Law-619/#WhatisAmdahlsLaw?), where S (n) is the theoretical performance improvement, P the parallel fraction of the algorithm, and n the number of threads, the greater n, the greater the improvement should be. Why is the best performance not achieved with the 500 threads? How does this performance compare when 200 are used?.
rta:/ It's not achieved due to the cpu's schedule that have to assign to each thread one particular time then this converts in a fight for that schedule among threads
-   How does the solution behave using as many processing threads as cores compared to the result of using twice as much?
 rta:/In theory it could be more efficient using twice becasu doesn't overload the cpu as much as the 200 or 500 ones but there are a problem with our records thar doesn't make sense, but in terms of speed it behave correctly tho
-   According to the above, if for this problem instead of 500 threads on a single CPU, 1 wire could be used on each of 500 hypothetical machines, would Amdahls's law be better applied? If, instead, c threads were used in 500 / c distributed machines (where c is the number of cores of said machines), would it be improved? Explain your answer.
rta:/ Of course it would be improved thats because there is no schedule that interrupts the proccess and each machine will be making their part 
