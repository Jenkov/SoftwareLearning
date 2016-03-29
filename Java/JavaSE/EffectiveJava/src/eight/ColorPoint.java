package eight;

import java.awt.Color;

public class ColorPoint extends Point {
	private Color color;
	public ColorPoint(int x,int y,Color color){
		super(x, y);
		this.color = color;
	}
	public boolean equals(Object o){
		//����Point��
		if(!(o instanceof Point))
			return false;
		//������ɫ��Point��
		if(!(o instanceof ColorPoint))
			return o.equals(this);
		//��ɫPoint��
		return super.equals(o)&&((ColorPoint)o).color==color;
	}
	
	public static void main(String[] args){
		ColorPoint p1 = new ColorPoint(1,2,Color.RED);
		Point p2 = new Point(1,2);
		ColorPoint p3 = new ColorPoint(1,2,Color.BLUE);
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p1.equals(p3));
	}
}
