
	import java.io.IOException;

import javax.swing.JOptionPane;

	public class StephenHawking {

	    // 1. make a main method and put steps 2, 3 & 4 inside it
		public static void main(String[]args) {
		
			String sentence = JOptionPane.showInputDialog("gimme ye sentence");
			speak (sentence);
			String sentence1 = JOptionPane.showInputDialog("gimme ye sentence");
			speak (sentence1);
			String sentence2 = JOptionPane.showInputDialog("gimme ye sentence");
			speak (sentence2);
			String sentence3 = JOptionPane.showInputDialog("gimme ye sentence");
			speak (sentence3);
			String sentence4 = JOptionPane.showInputDialog("gimme ye sentence");
			speak (sentence4);
			String sentence5 = JOptionPane.showInputDialog("gimme ye sentence");
			speak (sentence5);
			String sentence6 = JOptionPane.showInputDialog("gimme ye sentence");
			speak (sentence6);
			String sentence7 = JOptionPane.showInputDialog("gimme ye sentence");
			speak (sentence7);
	    // 2. ask the user for a sentence
	    // 3. call the speak method below and send it the sentence
	    // 4. repeat steps 2 and 3 a lot of times
		}
	/* Don’t change this…. */
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	 }
	  }

	}

	// Copyright Wintriss Technical Schools 2014








