package BinarySearch;

public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'e','e','e','e','e','e','f','f','f','f','f'};
        char target ='f';;
        if(target<letters[0] || target>=letters[letters.length-1]){
            System.out.println(letters[0]);
            return;
        }
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>=letters[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(letters[start]);
    }
}
