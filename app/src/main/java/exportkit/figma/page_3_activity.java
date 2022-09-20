
	 
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
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class page_3_activity extends Activity {

	
	private View _bg__page_3_ek2;
	private View rectangle_1;
	private View rectangle_3;
	private View rectangle_4;
	private ImageView __img___page3img1;
	private TextView __teethtimer;
	private TextView __tip;
	private TextView __brushtimer;
	private ImageView __img___page3img2;
	private TextView tip;
	private String[] tips = {"See your dentist at least twice a year","Drink more water","Eat crunchy fruits and vegetables","Don’t let flossing difficulties stop you"};

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_3);

		
		_bg__page_3_ek2 = findViewById(R.id._bg__page_3_ek2);
		rectangle_1 = findViewById(R.id.rectangle_1);
		rectangle_3 = findViewById(R.id.rectangle_3);
		rectangle_4 = findViewById(R.id.rectangle_4);
		__img___page3img1 = findViewById(R.id.__img___page3img1);
		__teethtimer = findViewById(R.id.__teethtimer);
		__tip = findViewById(R.id.__tip);
		__brushtimer = findViewById(R.id.__brushtimer);
		__img___page3img2 = findViewById(R.id.__img___page3img2);
		tip = findViewById(R.id.tipOfDay);
		
		//custom code goes here
		//start of random pick of tip
		Random r = new Random();
		int index = r.nextInt(tips.length);
		tip.setText(tips[index]);
		//end of random pick of tip
	
	}

	public void onBtnClick(View view){
		startActivity(new Intent(this, page_2_activity.class));
		finish();
	}
}
	
	