package classwork.lesson10;

import java.util.concurrent.atomic.AtomicBoolean;

import classwork.strin.Box;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		AtomicBoolean flag = new AtomicBoolean(false);
		Storage<Box> storage = new Storage<>();
		Factory factory = new Factory(flag, storage);
		BoxSeller sellerOne = new BoxSeller(flag, storage);
		BoxSeller sellerTwo = new BoxSeller(flag, storage);
		
		Thread factoryThread = new Thread(factory::createBoxes);
		Thread sellerOneThread = new Thread(sellerOne::sellBox);
		Thread sellerTwoThread = new Thread(sellerTwo::sellBox);
		
		factoryThread.start();
		sellerOneThread.start();
		sellerTwoThread.start();
		
		factoryThread.join();
		sellerOneThread.join();
		sellerTwoThread.join();
		
	}

}
