
public class LinearInString{
    public static int linearSearch(String strings[],String key){
     for(int i=0;i<strings.length;i++){
        if(strings[i]==key){
            return i;
        }
     }
     return -1;
    }
    public static void main(String args[]){
        String strings[]={"anjali","amit","anand","kaju","naukal"};
        String key="kajuii";
        int ind=linearSearch(strings,key);
        if(ind==-1){
            System.out.println("key not found");
        }else{
            System.out.println("key found at index: "+ind);
        }
    }
}