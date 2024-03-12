class p17 {
    public static void main(String[] args) 
    {
        int a=94211123;
        int rev=0;
        int temp=94211123;
        int rem=0;
        while(temp !=0){
            rem= temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }System.out.println(a+"After Reverse:="+rev);
    }
}
    
