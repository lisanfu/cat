package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Animation rotate=AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_rotate);//获取旋转动画资源
		final Animation translate=AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim_translate);//获取平移动画资源
		final Animation scale=AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_scale);//获取缩放动画资源
		final Animation alpha=AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_alpha);//获取透明度变化动画资源
		final ImageView iv=(ImageView)findViewById(R.id.imageView1);//获取应用动画效果的资源
		Button button1=(Button)findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				iv.startAnimation(rotate);
			}
			
		});
		Button button2=(Button)findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				iv.startAnimation(translate);
			}
			
		});
		Button button3=(Button)findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				iv.startAnimation(scale);
			}
			
		});
		Button button4=(Button)findViewById(R.id.button4);
		button4.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				iv.startAnimation(alpha);
			}
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
