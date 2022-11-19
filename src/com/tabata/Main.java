package com.tabata;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File_Managment file = new File_Managment("text.txt");
	    BubbleSort bubbleSort = new BubbleSort();
	    int j = 5;
		int n = (int) Math.pow(2, j);
		while(n <= Math.pow(2,15)){
			file.openWriter();
			long totalTime = 0;
			long totalComp = 0;
			int k;
			for(k = 0; k <= 50; k++){
				ArrayList<Integer> list = bubbleSort.generate(n);
				bubbleSort.run(list, n);
				totalTime += bubbleSort.getTime();
				totalComp += bubbleSort.getComp();
			}
			totalTime = (totalTime / k);
			totalComp = (totalComp / k);
			String line = n + " " + totalTime + " " + totalComp;
			file.write(line);
			n = (int) Math.pow(2,++j);
		}
	    file.closeWriter();
    }
}
