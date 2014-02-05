package tarea.tareasemana1;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity implements OnItemClickListener {
	public static List<Store> newTienda = new ArrayList<Store>();
	public static List<String> nombresTienda = new ArrayList<String>();
	ArrayAdapter<String> adapter;
	ListView lista;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		nombresTienda.add("Honda");
		nombresTienda.add("Yamaha");
		nombresTienda.add("Suzuki");
		
		newTienda.add(new Store("Honda","9na. calla", "56301809", "Lun - Dom 6am-5pm", "honda.com", "honda@honda.com" ));
		newTienda.add(new Store("Yamaha","10ma. calla", "56301892", "Lun - Dom 6am-5pm", "yamaha.com", "yamaha@yamaha.com" ));
		newTienda.add(new Store("Suzuki","9na. calla", "56301854", "Lun - Dom 6am-5pm", "suzuki.com", "suzuki@suzuki.com" ));
		
		
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombresTienda);
		
		lista = (ListView) findViewById(R.id.listView1);
		lista.setAdapter(adapter);
		lista.setOnItemClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> adapterView, View view, int position, long arg3) {
		Intent intentInfoTiendasActivity = new Intent(this, InfoTiendasAcitivity.class);
		intentInfoTiendasActivity.putExtra(InfoTiendasAcitivity.POSICION, position);
		startActivity(intentInfoTiendasActivity);
		
	}

}
