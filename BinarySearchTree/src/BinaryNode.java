@SuppressWarnings("unchecked")
public class BinaryNode{ 
    
private BinaryNode left; 

private BinaryNode right; 

private String myVal; 

public BinaryNode(String val){ 
    
myVal=val; 

left=null;

 right=null;
 
 }
 public void setRight(BinaryNode ri){ 
     
right=ri; 

}
 public void setLeft(BinaryNode le){ 
     
left=le; 

} 

public BinaryNode left(){
    
 return left;
 } 
public BinaryNode right(){
    
 return right; 
 
} 

public String value(){ 
    
return myVal;

 }
 
 public void setValue(String str){
     
 myVal=str; 
 
} 

}



/*public String toString() {
		return "Value: "+ myVal+ ", Left: "+(left == null?null:left.myVal)+ ", Right:"+ (right == null? null: right.myVal);
		//return "Value: "+ myVal+ ", Left: "+(left == null?null:left.myVal)+ ", Right:"+ (right == null? null: right.myVal);
	}*/
