class p18 {
    public static void main(String[] args) {
        int sum=0;
        int mul=1;
        int i=1;
        while(i<=10){
            if(i%2==0){
                sum=sum+i;
            }else{
                mul=mul*i;
            }
            i++;
        }System.out.println("sum of even number between 1 to 10="+sum);
        System.out.println("mul of odd number between 0 to 10="+mul);
    }
    
}
