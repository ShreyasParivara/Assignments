package com.te.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Multiplayer {
	
	static int temp;
	static Scanner sc = new Scanner(System.in);

	public void search(ArrayList arraylist, String song) {
		temp = 0;
		int count = 0;
		for (int i = 0; i < arraylist.size(); i++) {
			if (arraylist.get(i).equals(song)) {
				System.out.println("Song Present");
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Song not found");
			temp=1;
			
		}

	}

	public void Play(ArrayList arraylist, String song) {
		
		Multiplayer multiplayer = new Multiplayer();
		multiplayer.search(arraylist, song);
		if(temp==0){
		System.out.println(song + " Playing.....");
		System.out.println("type 'back' to go back or play to 'play' random song");
		String option = sc.next();
		switch (option) {
		case "back":
			break;
		case "play": {
			Random rand = new Random();
			int number = rand.nextInt(arraylist.size());
			randomSong(arraylist, number);
			break;
		}

		}}

	}

	public void randomSong(ArrayList arraylist, int number) {
		System.out.println(arraylist.get(number) + " Playing......");

	}

	public void addSong(HashSet songlist, String song) {
		songlist.add(song);
		System.out.println(song + " Added");
	}

	public void delete(HashSet songlist, String song) {
		songlist.remove(song);
		System.out.println(song + " Deleted");
	}

}
