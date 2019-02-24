// run on java 1.8.0_162

import java.io.*;
import java.util.*;

public class Main {

	static class FastScanner {
		private BufferedReader br;
		private StringTokenizer st;

		FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new IllegalStateException(e);
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

	public static void main(String args[]) {
		FastScanner cin = new FastScanner();
		PrintWriter cout = new PrintWriter(System.out);

		int n = cin.nextInt();
		String s = cin.next();
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = cin.nextInt();
			y[i] = cin.nextInt();
		}
		
		// solve here

		cout.println(n);
		cout.println(s);
		cout.println(x[0]);
		cout.println(y[n - 1]);

		cout.flush();
	}

	private static int solve(int n) {
	  return 0;
	}

}