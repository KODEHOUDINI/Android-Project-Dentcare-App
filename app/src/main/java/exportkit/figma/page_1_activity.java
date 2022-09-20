
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		page_3
	 *	@date 		Thursday 04th of August 2022 06:30:04 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;



import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class page_1_activity extends Activity {

	
	private View _bg__page_1_ek2;
	private ImageView __img___page1img;
	private TextView __slogan;
	private TextView __apptitle;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_1);
//edit
		SharedPreferences pref = getSharedPreferences("myPref",MODE_PRIVATE);
//edit end
		new Handler().postDelayed( new Runnable() {
			@Override
			public void run() {

//				startActivity(new Intent(page_1_activity.this,page_2_activity.class));
//
//				//edit
				if(pref.getBoolean("opened",false)){
					startActivity(new Intent(page_1_activity.this, page_3_activity.class));
				}else{
					SharedPreferences.Editor edit = pref.edit();
					edit.putBoolean("opened", true);
					edit.apply();
					startActivity(new Intent(page_1_activity.this, page_2_activity.class));
				}

//				//edit end
				finish();
			}
		}, 6000);

		
		_bg__page_1_ek2 = (View) findViewById(R.id._bg__page_1_ek2);
		__img___page1img = (ImageView) findViewById(R.id.__img___page1img);
		__slogan = (TextView) findViewById(R.id.__slogan);
		__apptitle = (TextView) findViewById(R.id.__apptitle);
	
		

	
	}
}
	
	