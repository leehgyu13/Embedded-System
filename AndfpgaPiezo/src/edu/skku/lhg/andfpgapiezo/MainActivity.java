package edu.skku.lhg.andfpgapiezo;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

import edu.skku.lhg.andfpgapiezo_jnidriver.fpgaPiezo_JNIDriver;

public class MainActivity extends Activity {
	
	private fpgaPiezo_JNIDriver fpgaPiezo_JNIDriver = new fpgaPiezo_JNIDriver();
	private ImageButton [] whiteBars = new ImageButton[21];
	private ImageButton [] blackBars = new ImageButton[15];
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.setResource();
	}
	
	@Override
	protected void onResume() {
		fpgaPiezo_JNIDriver.open();
		super.onResume();
	}

	@Override
	protected void onPause() {
		fpgaPiezo_JNIDriver.close();
		super.onPause();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void setResource() {
        whiteBars[0] = (ImageButton)findViewById(R.id.white1);
        whiteBars[0].setTag(new int[]{1, R.drawable.whiteback1, R.drawable.white1});
        whiteBars[1] = (ImageButton)findViewById(R.id.white2);
        whiteBars[1].setTag(new int[]{2, R.drawable.whiteback2, R.drawable.white2});
        whiteBars[2] = (ImageButton)findViewById(R.id.white3);
        whiteBars[2].setTag(new int[]{3, R.drawable.whiteback3, R.drawable.white3});
        whiteBars[3] = (ImageButton)findViewById(R.id.white4);
        whiteBars[3].setTag(new int[]{4, R.drawable.whiteback4, R.drawable.white4});
        whiteBars[4] = (ImageButton)findViewById(R.id.white5);
        whiteBars[4].setTag(new int[]{5, R.drawable.whiteback5, R.drawable.white5});
        whiteBars[5] = (ImageButton)findViewById(R.id.white6);
        whiteBars[5].setTag(new int[]{6, R.drawable.whiteback6, R.drawable.white6});
        whiteBars[6] = (ImageButton)findViewById(R.id.white7);
        whiteBars[6].setTag(new int[]{7, R.drawable.whiteback7, R.drawable.white7});
        whiteBars[7] = (ImageButton)findViewById(R.id.white8);
        whiteBars[7].setTag(new int[]{17, R.drawable.whiteback1, R.drawable.white1});
        whiteBars[8] = (ImageButton)findViewById(R.id.white9);
        whiteBars[8].setTag(new int[]{18, R.drawable.whiteback2, R.drawable.white2});
        whiteBars[9] = (ImageButton)findViewById(R.id.white10);
        whiteBars[9].setTag(new int[]{19, R.drawable.whiteback3, R.drawable.white3});
        whiteBars[10] = (ImageButton)findViewById(R.id.white11);
        whiteBars[10].setTag(new int[]{20, R.drawable.whiteback4, R.drawable.white4});
        whiteBars[11] = (ImageButton)findViewById(R.id.white12);
        whiteBars[11].setTag(new int[]{21, R.drawable.whiteback5, R.drawable.white5});
        whiteBars[12] = (ImageButton)findViewById(R.id.white13);
        whiteBars[12].setTag(new int[]{22, R.drawable.whiteback6, R.drawable.white6});
        whiteBars[13] = (ImageButton)findViewById(R.id.white14);
        whiteBars[13].setTag(new int[]{23, R.drawable.whiteback7, R.drawable.white7});
        whiteBars[14] = (ImageButton)findViewById(R.id.white15);
        whiteBars[14].setTag(new int[]{33, R.drawable.whiteback1, R.drawable.white1});
        whiteBars[15] = (ImageButton)findViewById(R.id.white16);
        whiteBars[15].setTag(new int[]{34, R.drawable.whiteback2, R.drawable.white2});
        whiteBars[16] = (ImageButton)findViewById(R.id.white17);
        whiteBars[16].setTag(new int[]{35, R.drawable.whiteback3, R.drawable.white3});
        whiteBars[17] = (ImageButton)findViewById(R.id.white18);
        whiteBars[17].setTag(new int[]{36, R.drawable.whiteback4, R.drawable.white4});
        whiteBars[18] = (ImageButton)findViewById(R.id.white19);
        whiteBars[18].setTag(new int[]{37, R.drawable.whiteback5, R.drawable.white5});
        whiteBars[19] = (ImageButton)findViewById(R.id.white20);
        whiteBars[19].setTag(new int[]{38, R.drawable.whiteback6, R.drawable.white6});
        whiteBars[20] = (ImageButton)findViewById(R.id.white21);
        whiteBars[20].setTag(new int[]{39, R.drawable.whiteback7, R.drawable.white7});
       
        blackBars[0] = (ImageButton)findViewById(R.id.black1);
        blackBars[0].setTag(new int[]{49, R.drawable.blackback1,R.drawable.black1});
        blackBars[1] = (ImageButton)findViewById(R.id.black2);
        blackBars[1].setTag(new int[]{50, R.drawable.blackback2,R.drawable.black2});
        blackBars[2] = (ImageButton)findViewById(R.id.black3);
        blackBars[2].setTag(new int[]{51, R.drawable.blackback3,R.drawable.black3});
        blackBars[3] = (ImageButton)findViewById(R.id.black4);
        blackBars[3].setTag(new int[]{52, R.drawable.blackback4,R.drawable.black4});
        blackBars[4] = (ImageButton)findViewById(R.id.black5);
        blackBars[4].setTag(new int[]{53, R.drawable.blackback5,R.drawable.black5});
        blackBars[5] = (ImageButton)findViewById(R.id.black6);
        blackBars[5].setTag(new int[]{65, R.drawable.blackback1,R.drawable.black1});
        blackBars[6] = (ImageButton)findViewById(R.id.black7);
        blackBars[6].setTag(new int[]{66, R.drawable.blackback2,R.drawable.black2});
        blackBars[7] = (ImageButton)findViewById(R.id.black8);
        blackBars[7].setTag(new int[]{67, R.drawable.blackback3,R.drawable.black3});
        blackBars[8] = (ImageButton)findViewById(R.id.black9);
        blackBars[8].setTag(new int[]{68, R.drawable.blackback4,R.drawable.black4});
        blackBars[9] = (ImageButton)findViewById(R.id.black10);
        blackBars[9].setTag(new int[]{69, R.drawable.blackback5,R.drawable.black5});
        blackBars[10] = (ImageButton)findViewById(R.id.black11);
        blackBars[10].setTag(new int[]{81, R.drawable.blackback1,R.drawable.black1});
        blackBars[11] = (ImageButton)findViewById(R.id.black12);
        blackBars[11].setTag(new int[]{82, R.drawable.blackback2,R.drawable.black2});
        blackBars[12] = (ImageButton)findViewById(R.id.black13);
        blackBars[12].setTag(new int[]{83, R.drawable.blackback3,R.drawable.black3});
        blackBars[13] = (ImageButton)findViewById(R.id.black14);
        blackBars[13].setTag(new int[]{84, R.drawable.blackback4,R.drawable.black4});
        blackBars[14] = (ImageButton)findViewById(R.id.black15);
        blackBars[14].setTag(new int[]{85, R.drawable.blackback5,R.drawable.black5});
        
        TouchListener touchListener = new TouchListener();
        
        for (int i = 0; i < 21; ++i)
        	whiteBars[i].setOnTouchListener(touchListener);
        
        for (int i = 0; i < 15; ++i)
        	blackBars[i].setOnTouchListener(touchListener);		
	}
	
	public class TouchListener implements ImageButton.OnTouchListener {

		@Override
		public boolean onTouch(View view, MotionEvent motionEvent) {
			ImageButton imageButton = (ImageButton) view;
			int [] tags = (int [])imageButton.getTag();
			
			switch (motionEvent.getAction()) {
			case MotionEvent.ACTION_DOWN:
				imageButton.setImageResource(tags[1]);  
				fpgaPiezo_JNIDriver.write( (char)tags[0]);
				break;
			
			case MotionEvent.ACTION_UP:
			case MotionEvent.ACTION_MOVE:
				imageButton.setImageResource(tags[2]);
				fpgaPiezo_JNIDriver.write( (char)0);
				break;			
			}
			
	        return true;
		}
		
	}	
}