package FB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	Integer[] a = {1,2,3,0,5,0,6,0,7};
	Arrays.sort(a, Collections.reverseOrder());
	System.out.println(Arrays.toString(a));
	
	
	
//	int a[]={1,2,3,4};
//	int b[]={2,3,4,5};
//	int c[]={3,4,5,6,7,8};
//	int x=0, y=0, z=0;
//	while(x<a.length && y<b.length && z<c.length){
//		if(a[x]==b[y] && b[y]==c[z]){
//		list.add(a[x]);
//		x++;
//		y++;
//		z++;
//		}
//		else if(a[x]<b[y]){
//			x++;
//		}
//		else if(b[y]<c[z]){
//			y++;
//		}
//		else{
//			z++;
//		}
//	}
//	System.out.println(list);
}
}
