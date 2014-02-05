package tarea.tareasemana1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class InfoTiendasAcitivity extends Activity {
	private int posicion=0;
	public static final String POSICION = "position" ;
	String phone="";
	Intent callIntent = null;
	Button llamar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info_tiendas);
		
		Intent intent = getIntent();
		posicion = intent.getIntExtra(POSICION,0);
		
		String name = MainActivity.newTienda.get(posicion).getName();
		TextView nombre = (TextView) findViewById(R.id.textView1);
		nombre.setText(name);
		
		String address = MainActivity.newTienda.get(posicion).getAdrress();
		TextView direccion = (TextView) findViewById(R.id.textView2);
		direccion.setText(address);
		Linkify.addLinks(direccion, Linkify.ALL);
		
		phone = MainActivity.newTienda.get(posicion).getPhone();
		TextView numeroTel = (TextView) findViewById(R.id.textView3);
		numeroTel.setText(phone);
		Linkify.addLinks(numeroTel, Linkify.ALL);
		
		String hoursOfOperation = MainActivity.newTienda.get(posicion).getHoursOfOperation();
		TextView horario = (TextView) findViewById(R.id.textView4);
		horario.setText(hoursOfOperation);
		
		String url = MainActivity.newTienda.get(posicion).getUrl();
		TextView web = (TextView) findViewById(R.id.textView5);
		web.setText(url);
		Linkify.addLinks(web, Linkify.ALL);
		
		String email = MainActivity.newTienda.get(posicion).getEmail();
		TextView correo = (TextView) findViewById(R.id.textView6);
		correo.setText(email);
		Linkify.addLinks(correo, Linkify.ALL);
		
		llamar = (Button) findViewById(R.id.button1);
		ButtonListener listener = new ButtonListener();
		llamar.setOnClickListener(listener);
	}
	
	class ButtonListener implements OnClickListener
	{
		@Override
		public void onClick(View v)
		{
			if(v.getId() == llamar.getId())
			{
				callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+ phone));
				startActivity(callIntent);
			}
		}
	}
}
