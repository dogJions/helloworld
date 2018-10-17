package test01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
		public static void main(String[] args) {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy_MM_dd");
			
			System.out.println(sdf.format(new Date()));
		}
}
