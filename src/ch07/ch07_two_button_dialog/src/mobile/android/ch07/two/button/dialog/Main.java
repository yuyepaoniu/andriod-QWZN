package mobile.android.ch07.two.button.dialog;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class Main extends Activity
{
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		new AlertDialog.Builder(this).setIcon(R.drawable.question).setTitle(
		"�Ƿ������ļ�").setPositiveButton("ȷ��",
		new DialogInterface.OnClickListener()
		{
			public void onClick(DialogInterface dialog, int whichButton)
			{
				new AlertDialog.Builder(Main.this).setMessage(
						"�ļ��Ѿ��ɹ�����.").create().show();
			}
		}).setNegativeButton("ȡ��",
		new DialogInterface.OnClickListener()
		{
			public void onClick(DialogInterface dialog, int whichButton)
			{

				new AlertDialog.Builder(Main.this).setMessage(
						"���Ѿ�ѡ����ȡ����ť�����ļ�δ������.").create().show();
			}
		}).show();
		
	}
}