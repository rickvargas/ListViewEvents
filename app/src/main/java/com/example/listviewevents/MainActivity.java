package com.example.listviewevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {
	
	ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		listView = findViewById(R.id.listView);
		ArrayList<Evento> array =  new ArrayList<Evento>();
		
		EventoController eventoController = new EventoController();
		
		EventoAdapter eventoAdapter = new EventoAdapter(
				getApplicationContext(),
				R.layout.list_item_evento,
				eventoController.evento
		);

		listView.setAdapter(eventoAdapter);
	}
}
