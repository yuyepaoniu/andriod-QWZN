package mobile.android.ch07.simple.list.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.bluetooth.BluetoothSocket;
import android.content.DialogInterface;
import android.os.Bundle;

public class Main extends Activity
{
	private String[] provinces = new String[]
	{ "����ʡ", "ɽ��ʡ", "�ӱ�ʡ", "����ʡ", "�㶫ʡ", "������ʡ" };

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		new AlertDialog.Builder(this).setTitle("ѡ��ʡ��")
				.setItems(provinces, new DialogInterface.OnClickListener()
				{
					public void onClick(DialogInterface dialog, int which)
					{
						final AlertDialog ad = new AlertDialog.Builder(
								Main.this).setMessage(
								"���Ѿ�ѡ����: " + which + ":" + provinces[which])
								.show();
						android.os.Handler hander = new android.os.Handler();
						// ���ö�ʱ����5������run����
						hander.postDelayed(new Runnable()
						{
							@Override
							public void run()
							{
								// ����AlertDialog���dismiss�����رնԻ���Ҳ���Ե���cancel����
								ad.dismiss();
							} 
						}, 5 * 1000);
					}
				}).show();

	}
}