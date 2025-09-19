class stringBuilderExample{  
public static void main(String args[]){  
// StringBuilder sb=new StringBuilder("Hello ");  
// sb.append("Java");  

StringBuilder sb=new StringBuilder("");
for(char ch='a';ch<='z';ch++){
    sb.append(ch);
}//TimeCom=O(26), but in string TimeCom=O(26*n^2)
System.out.println(sb);  


}  
}  