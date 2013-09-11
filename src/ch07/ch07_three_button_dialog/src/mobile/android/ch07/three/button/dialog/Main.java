package mobile.android.ch07.three.button.dialog;

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
        "�Ƿ񸲸��ļ���").setPositiveButton("����",
        new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int whichButton)
            {
                new AlertDialog.Builder(Main.this)
                        .setMessage("�ļ��Ѿ�����.").create().show();
            }
        }).setNeutralButton("����", new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int whichButton)
            {
                new AlertDialog.Builder(Main.this).setMessage("�����˸����ļ��Ĳ���.")
                    .create().show();
            }
        }).setNegativeButton("ȡ��", new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int whichButton)
            {
                new AlertDialog.Builder(Main.this).setMessage("���Ѿ�ȡ�������еĲ���.").
                    create().show();
            }
        }).show();

		
	}
}