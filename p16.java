class p16{
 public static void main(String[] args) {
     int day=7;
     if(day==0){
        System.out.println(day+ "days remaining");
     }else{
        while(day>=1){
        System.out.println(day+"days Assignment is overdue");
        day--;
     }if(day==0){
        System.out.println(day+"days Assignment is overdue");
     }
 }   
}
}