package oop;

public class ExceptionHandling {
	void agevalid(int age) throws ArithmeticException{;
	if(age>18) {
		System.out.println("voter eligible");

	}
	else {
		throw new ArithmeticException("Age not valid");
	}
	}
	
	void findkey(int[] arr , int key) throws ItemNotFound {
		int i;
		boolean foundIt=false;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				foundIt=true;
				break;  // Unlabeled Break
			}// if
		} //for
		if(foundIt) {
			System.out.println(key+" Found at array index "+i);
		}else { 
			throw new ItemNotFound("Not-Found in array");
			//System.out.println(key+" Not-Found in array");}
		}}

	public static void main(String[] args)  {
		ExceptionHandling obj=new ExceptionHandling();
try {obj.agevalid(55);}
catch(Exception e) {e.printStackTrace();}
	
int[] arr={55,27,38,45};
try {
	obj.findkey(arr,257);
} catch (ItemNotFound e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}//main end
	
}//class end


class ItemNotFound extends Exception {
	public ItemNotFound(String msg) {
		super();
	}
	
}//ItemNotFound
