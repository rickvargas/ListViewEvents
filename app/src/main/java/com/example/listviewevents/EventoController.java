package com.example.listviewevents;

import java.util.HashMap;

public class EventoController {
	public Evento[] evento = {Event100, Event101, Event102, Event103, Event104, Event138, Event139, Event200, Event201, Event202, Event203};
	
	public HashMap<String, Evento> evento_map = new HashMap<>();
	
	public EventoController(){
		for (Evento EVENTO: evento){
			evento_map.put(String.valueOf(EVENTO.getId()), EVENTO);
		}
	}
	
	public static final Evento Event100 = new Evento("100", R.drawable.warning, "Warning", "System Rebooting", "System Event");
	public static final Evento Event101 = new Evento("101", R.drawable.notification, "Notification", "System Started", "System Event");
	public static final Evento Event102 = new Evento("102", R.drawable.warning, "Warning", "System Upgrade Started", "System Event");
	public static final Evento Event103 = new Evento("103", R.drawable.notification, "Notification", "System Upgrade Completed", "System Event");
	public static final Evento Event104 = new Evento("104", R.drawable.critical, "Critical", "System Upgrade Failed", "System Event");
	public static final Evento Event138 = new Evento("138", R.drawable.notification, "Notification", "System SMS Executed", "SMS Event");
	public static final Evento Event139 = new Evento("139", R.drawable.warning, "Warning", "System SMS Invalid", "SMS Event");
	public static final Evento Event200 = new Evento("200", R.drawable.notification, "Notification", "System Auth Logged In", "Auth Event");
	public static final Evento Event201 = new Evento("201",R.drawable.notification, "Notification", "System Auth Logged Out", "Auth Event");
	public static final Evento Event202 = new Evento("202", R.drawable.warning, "Warning", "System Auth Failure", "Auth Event");
	public static final Evento Event203 = new Evento("203", R.drawable.critical, "Critical", "System Auth Blocked", "Auth Event");
}