package test;

import code.ViDu;

public class TestViDu {
	public static void main(String[] args) {
		ViDu vd = new ViDu(2, 6);
		System.out.println(vd.getA());
		
//		ở đây bắc buộc mình dùng tên package.ViDu
//		chứ ko import được code2.ViDu được nó sẽ
//		lỗi bởi vì khi sử dụng nó trùng class
		code2.ViDu vd2 = new code2.ViDu(33, 22, 33);
		System.out.println(vd2.getC());
	}
}
