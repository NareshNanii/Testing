package FB;

import java.util.ArrayList;

public class Exp {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
	
	int a[] = {1,2,3,4,5,8};
	int b[] = {5,6,7,8,9,1};
	//int c[] = {0,5,4,1,8,2,1};
	
	

int x=0, y=0 ;

while (x<a.length && y<b.length){
	if (a[x]==b[y]){
		list.add(a[x]);
		x++;
		y++;
		
	}
	else if(a[x]<b[y]) {
		
		x++;
	}
	else  {
		y++;
	}
//	else{
//		z++;
//	}
//	
}
System.out.println(list);
}
}

