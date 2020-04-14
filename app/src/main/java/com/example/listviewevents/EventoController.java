package com.example.listviewevents;

import java.util.HashMap;

public class EventoController {
	public Evento[] evento = {Event100, Event101, Event102, Event103, Event104, Event105,
			Event138, Event139,
			Event150, Event151, Event152, Event153,
			Event200, Event201, Event202, Event203, Event204};
	
	public HashMap<String, Evento> evento_map = new HashMap<>();
	
	public EventoController(){
		for (Evento EVENTO: evento){
			evento_map.put(String.valueOf(EVENTO.getId()), EVENTO);
		}
	}
	
	public static final Evento Event100 = new Evento("100", R.drawable.warning, "Warning", "System Shutting Down", "System");
	public static final Evento Event101 = new Evento("101", R.drawable.warning, "Warning", "System Rebooting", "System");
	public static final Evento Event102 = new Evento("102", R.drawable.notification, "Notification", "System Started", "System");
	public static final Evento Event103 = new Evento("103", R.drawable.warning, "Warning", "System Upgrade Started", "System");
	public static final Evento Event104 = new Evento("104", R.drawable.notification, "Notification", "System Upgrade Completed", "System");
	public static final Evento Event105 = new Evento("105", R.drawable.critical, "Critical", "System Upgrade Failure", "System");
	public static final Evento Event138 = new Evento("138", R.drawable.notification, "Notification", "System SMS Sent", "SMS");
	public static final Evento Event139 = new Evento("139", R.drawable.warning, "Warning", "System SMS Failure", "SMS");
	public static final Evento Event150 = new Evento("150", R.drawable.critical, "Critical", "Device SSD Failure", "Hardware");
	public static final Evento Event151 = new Evento("151", R.drawable.critical, "Critical", "Device HDD Failure", "Hardware");
	public static final Evento Event152 = new Evento("152", R.drawable.critical, "Critical", "Device Fan Failure", "Hardware");
	public static final Evento Event153 = new Evento("153", R.drawable.critical, "Critical", "Device Power Supply Failure", "Hardware");
	public static final Evento Event200 = new Evento("200", R.drawable.notification, "Notification", "System Auth Logged In", "Auth");
	public static final Evento Event201 = new Evento("201", R.drawable.notification, "Notification", "System Auth Logged Out", "Auth");
	public static final Evento Event202 = new Evento("202", R.drawable.warning, "Warning", "System Auth Failure", "Auth");
	public static final Evento Event203 = new Evento("203", R.drawable.warning, "Warning", "System Auth Terminated", "Auth");
	public static final Evento Event204 = new Evento("204", R.drawable.critical, "Critical", "System Auth Blocked", "Auth");
}