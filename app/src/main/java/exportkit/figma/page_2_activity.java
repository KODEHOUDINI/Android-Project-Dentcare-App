
	 
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
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Build;
import android.app.*;


import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

	public class page_2_activity extends Activity {

	
	private View _bg__page_2_ek2;
	private View rectangle_3_ek1;
	private View rectangle_4_ek1;
	private TextView __wakeup;
	private TextView __slptime;
	private ImageView __img___page2img1;
	private ImageView __img___page2img2;
	private NumberPicker wakeH, wakeM, wakeAm_Pm, sleepH, sleepM, sleepAm_Pm;
	String[] ampm;
	private Calendar calendar;
	private AlarmManager alarmManager;
	private PendingIntent pendingIntent;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_2);
		createNotificationChannel();

		
		_bg__page_2_ek2 = (View) findViewById(R.id._bg__page_2_ek2);
		rectangle_3_ek1 = (View) findViewById(R.id.rectangle_3_ek1);
		rectangle_4_ek1 = (View) findViewById(R.id.rectangle_4_ek1);
		__wakeup = (TextView) findViewById(R.id.__wakeup);
		__slptime = (TextView) findViewById(R.id.__slptime);
		__img___page2img1 = (ImageView) findViewById(R.id.__img___page2img1);
		__img___page2img2 = (ImageView) findViewById(R.id.__img___page2img2);


	}
	public void onBtnClick(View view){

		//getting time values
		TimePicker picker = findViewById(R.id.fragment_createalarm_timePicker2);
		TimePicker picker2 = findViewById(R.id.fragment_createalarm_timePicker);
		calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY,picker.getHour());
		calendar.set(Calendar.MINUTE,picker.getMinute());
		calendar.set(Calendar.SECOND,0);
		calendar.set(Calendar.MILLISECOND,0);
		setAlarm();
		calendar.set(Calendar.HOUR_OF_DAY,picker2.getHour());
		calendar.set(Calendar.MINUTE,picker2.getMinute());
		calendar.set(Calendar.SECOND,0);
		calendar.set(Calendar.MILLISECOND,0);
		setAlarm();
		startActivity(new Intent(page_2_activity.this, page_3_activity.class));
		finish();
	}

		private void createNotificationChannel() {
				CharSequence name = "DentCare";
				String description = "We Care";
				int importance = NotificationManager.IMPORTANCE_HIGH;
				NotificationChannel channel = new NotificationChannel("DentCare",name,importance);
				channel.setDescription(description);

				NotificationManager notificationManager = getSystemService(NotificationManager.class);
				notificationManager.createNotificationChannel(channel);



		}

		private void setAlarm() {

			alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

			Intent intent = new Intent(this,AlarmActivity.class);

			pendingIntent = PendingIntent.getBroadcast(this,0,intent,0);

			alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),
					AlarmManager.INTERVAL_DAY,pendingIntent);

			Toast.makeText(this, "Time set successfully", Toast.LENGTH_SHORT).show();



		}
		private void cancelAlarm() {

			Intent intent = new Intent(this,AlarmActivity.class);

			pendingIntent = PendingIntent.getBroadcast(this,0,intent,0);

			if (alarmManager == null){

				alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

			}

			alarmManager.cancel(pendingIntent);
			Toast.makeText(this, "Alarm Cancelled", Toast.LENGTH_SHORT).show();
		}


	}
