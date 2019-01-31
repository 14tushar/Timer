import java.awt.*;
import java.awt.event.*;
class july122 extends Frame
{
	TextField t1,t2,t3;
	Label l1,l2,l3,l4,l5;
	Panel p1,p2;
	july122()
	{
		p1=new Panel();
		p2=new Panel();
		l1=new Label("HH");
		l2=new Label("MM");
		l3=new Label("SS");
		t1=new TextField(4);
		l4=new Label(":");
		t2=new TextField(4);
		l5=new Label(":");
		t3=new TextField(4);
		add(p1);
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.setLayout(new GridLayout(1,3));
		add(p2);
		p2.add(t3);
		p2.add(l4);
		p2.add(t2);
		p2.add(l5);
		p2.add(t1);
		p2.setLayout(new GridLayout(1,5));
		setLayout(new GridLayout(2,1));
	}

}
class july122t1 extends Thread
{
	july122 o1=new july122();
	july122t1()
	{
		o1.setSize(200,200);
		o1.setVisible(true);
		start();
	}
	public void run()
	{
		try
		{
			int h=0,m=0;
			for(int i=0;i>=0;i++)
			{
				if(i==60)
				{
					i=0;
					m++;
					if(m==60)
					{
						m=0;
						h++;
						if(h==24)
						{
							h=0;
						}
						o1.t3.setText(""+h);
					}
					o1.t2.setText(""+m);
				}
				o1.t1.setText(""+i);
				Thread.sleep(1000);
			}
		}catch(Exception e)
			{
				System.out.println(e);
			}
	}
}
class july122m
{
	public static void main(String args[])
	{
		july122t1 o2=new july122t1();
	}
}