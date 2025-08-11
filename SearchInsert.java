import java.util.*;
class SearchInsert{
  public static int search(int[] nums,int target){
    int l=0,r=nums.length-1;
    while(l<=r){
      int mid=l+(r-l)/2;
      if(nums[mid] == target)
        return mid;
      else if(nums[mid]<target)
        l=mid+1;
      else
        r=mid-1;
    }
    return l;
  }

  public static void main(String[] args){
    int[] nums={0,1,2,3,4,5,6,7,8,9,10,11,13,15};
    Scanner sc=new Scanner(System.in);
   
    System.out.print("Enter target val:");
     int target=sc.nextInt();
    System.out.println(search(nums,target));
  }
}
