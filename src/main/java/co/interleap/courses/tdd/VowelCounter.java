package co.interleap.courses.tdd;

public class VowelCounter {
    public int count(String string) {
        int ans=0;
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u' ){
                ans++;
            }
        }
        return ans;
    }
}
