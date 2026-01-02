package com.java2novice.stat.imp.pac2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class RateLimiterCheck {
	private static final int MAX_REQUESTS = 3;
	private static final long WINDOW_SIZE_MS = 10_000;

	private List<Long> requestTimes = new ArrayList<>();
	private Deque<Long> requestTimes1 = new ArrayDeque<>();

	public synchronized boolean allowRequest() {
		long now = System.currentTimeMillis();

		requestTimes.removeIf(time -> now - time > WINDOW_SIZE_MS);

//		Iterator<Long> iterator = requestTimes.iterator();
//		while (iterator.hasNext()) {
//		    Long time = iterator.next();
//		    if (now - time > WINDOW_SIZE_MS) {
//		        iterator.remove(); // safe removal
//		    }
//		}

		if (requestTimes.size() < MAX_REQUESTS) {
			requestTimes.add(now);
			return true;
		}
		return false;
	}

	public synchronized boolean allowRequest1() {
		long now = System.currentTimeMillis();

		// Remove old timestamps from front
		while (!requestTimes1.isEmpty() && now - requestTimes1.peekFirst() > WINDOW_SIZE_MS) {
			requestTimes1.pollFirst();
		}

		if (requestTimes.size() < MAX_REQUESTS) {
			requestTimes1.addLast(now);
			return true;
		}
		return false;
	}

	public static void main(String[] args) throws InterruptedException {
		RateLimiterCheck limiter = new RateLimiterCheck();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Request " + i + " allowed: " + limiter.allowRequest());
			Thread.sleep(2000);
		}
	}
}
