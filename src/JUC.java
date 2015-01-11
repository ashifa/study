import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class JUC {
	static Lock lock = new ReentrantLock();
	static ReentrantReadWriteLock lk = new ReentrantReadWriteLock();
	static ReadLock rlock = lk.readLock();
	static WriteLock wlock = lk.writeLock();
	static long startTime = System.nanoTime();
	static ScheduledExecutorService es = Executors.newScheduledThreadPool(11);
	static Random rd = new Random();

	public static void main(String[] args) throws Exception {

		es.scheduleAtFixedRate(ClassP.Stu, 0, 100, TimeUnit.NANOSECONDS);
		es.scheduleAtFixedRate(ClassP.Tea, 0, 500, TimeUnit.MILLISECONDS);

		System.out.println("done");
		// es.shutdown();
	}

}

enum ClassP implements Runnable {
	Stu("Stu"), Tea("Tea");
	private String name;
	private PrintStream ps;

	ClassP(String name) {
		this.name = name;
		ps = name == "Stu" ? System.out : System.err;
	}

	@Override
	public void run() {

		JUC.rlock.lock();

		ps.println(this.name);
		JUC.rlock.unlock();

	}

}
