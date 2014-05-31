package com.whitaker.textalyzer.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.whitaker.textalyzer.ContactHolder;

import android.app.Application;

public class TextalyzerApplication extends Application
{
	private Map<String, ContactHolder> contacts = new HashMap<String, ContactHolder>();
	
	public void putContact(String address, ContactHolder holder)
	{
		contacts.put(address, holder);
	}
	
	public ContactHolder getContact(String address)
	{
		return contacts.get(address);
	}
	
	public Set<String> getKeySet()
	{
		return contacts.keySet();
	}
	
	public int getSize()
	{
		return contacts.size();
	}
}