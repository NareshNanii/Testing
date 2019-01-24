package FB;

import java.util.ArrayList;

public class Exp {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
	
	int a[] = {1,2,3,4,5};
	int b[] = {5,6,7,8,9};
	int c[] = {0,5,4,1,8,2,1};
	
	

int x=0, y=0 , z=0;

while (x<a.length && y<b.length && z<c.length){
	if (a[x]==b[y] && b[y]==c[z]){
		list.add(a[x]);
		x++;
		y++;
		z++;
	}
	else if(a[x]<b[y]) {
		
		x++;
	}
	else if (b[y]<c[z]){
		y++;
	}
	else{
		z++;
	}
	
}
System.out.println(list);
}
}

