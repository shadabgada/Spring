package com.shadab.LRU;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCache {

	//Reference: https://medium.com/@krishankantsinghal/my-first-blog-on-medium-583159139237
	
	//HashMap provide O(1) insertion and lookup. 
	//but HashMap does not has mechanism of tracking which entry has been queried recently and which not.
	
	int cacheSize;
	LinkedList <Integer>dList;
	Set <Integer> hSet;
	
	public LRUCache(int cacheSize) {
		super();
		this.cacheSize = cacheSize;
		dList = new LinkedList<Integer>();
		hSet = new HashSet<Integer>();
	}
	
	public void addOrReadElement(int element){
		if(dList.size()==cacheSize) {
			dList.removeLast();
		}
		
		if(hSet.contains(element)) {
			dList.removeFirstOccurrence(element);
		}

		dList.addFirst(element);
		hSet.add(element);
	}
	
	public int  getLruElement() {
		return dList.getLast();
	}
	
	public void displayElements()	{
		System.out.print("Elements:");
		for(int i=0;i<dList.size();i++) {
			System.out.print(dList.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		LRUCache lruCache = new LRUCache(4);
		
		lruCache.addOrReadElement(4);
		lruCache.displayElements();
		
		lruCache.addOrReadElement(5);
		lruCache.displayElements();
		
		lruCache.addOrReadElement(6);
		lruCache.displayElements();
		
		System.out.println("Least Recently Used: "+lruCache.getLruElement());
		
		lruCache.addOrReadElement(4);
		lruCache.displayElements();
		
		lruCache.addOrReadElement(3);
		lruCache.displayElements();
		
		lruCache.addOrReadElement(8);
		lruCache.displayElements();
		
		System.out.println("Least Recently Used: "+lruCache.getLruElement());
	}
}
