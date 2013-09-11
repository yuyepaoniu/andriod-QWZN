package mobile.android.ch07.transparency.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Main extends Activity
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void onClick_TransparencyDialog(View view)
	{
		// ��ʾ͸���ĶԻ���
		
		AlertDialog alertDialog = new AlertDialog.Builder(this)
				.setMessage("͸���Ի���").setPositiveButton("ȷ��", null).create();
		Window window = alertDialog.getWindow();
		WindowManager.LayoutParams lp = window.getAttributes();
		//  ����͸����Ϊ0.7
		lp.alpha = 0.7f;
		window.setAttributes(lp);
		alertDialog.show();
 
		// ��ʾ��͸���ĶԻ���
		alertDialog = new AlertDialog.Builder(this).setMessage("�ڵ׶���ʾ�Ի���")
				.setPositiveButton("ȷ��", null).create();
		window = alertDialog.getWindow(); 
		
		window.setGravity(Gravity.BOTTOM);
		alertDialog.show();
	}
}