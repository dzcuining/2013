package com.example.testDemo;

import com.example.testDemo.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
    Button bttimer;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bttimer=(Button)findViewById(R.id.button1);
		bttimer.setOnClickListener(this);
	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.button1)
		{
			Intent intent=new Intent();
			intent.setAction(AlarmClock.ACTION_SET_TIMER);
			intent.putExtra(AlarmClock.EXTRA_MESSAGE, "µπº∆ ±");
			intent.putExtra(AlarmClock.EXTRA_LENGTH, 30);
			if(intent.resolveActivity(getPackageManager())!=null)
			{
				startActivity(Intent.createChooser(intent, "«Î—°‘Ò"));
			}
		}
	}
  
}
