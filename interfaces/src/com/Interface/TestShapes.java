package com.Interface;

interface Shape1 {
	void shapemethod();
}
interface Shape3d extends Shape1{
	void threeDShapeMethod();
}

public class TestShapes implements Shape3d{
	@Override
	public void shapemethod() {
		// TODO Auto-generated method stub
		System.out.println("This is Shape Method from Interface 1");
		
	}@Override
	public void threeDShapeMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is 3D Shape Method from Interface 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape3d obj=new TestShapes();
		obj.shapemethod();
		obj.threeDShapeMethod();

	}

}
