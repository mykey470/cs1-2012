package lecture03;

public class IncrementBenchmark {
	private void run() {
		long start_ms = System.currentTimeMillis();
		{
			long sum = 0L;
			for (long i = 0L; i < Integer.MAX_VALUE; i++) sum += i;
			long end_ms = System.currentTimeMillis();
			System.out.printf("%d (%dms)\n", sum, end_ms - start_ms);
			start_ms = end_ms;
		}
		
		{
			Long sum = 0L;
			for (Long i = 0L; i < Integer.MAX_VALUE; i++) sum += i;
			long end_ms = System.currentTimeMillis();
			System.out.printf("%d (%dms)\n", sum, end_ms - start_ms);
			start_ms = end_ms;
		}
	}
	
	public static void main(String _ []) {
		new IncrementBenchmark().run();
	}
}


