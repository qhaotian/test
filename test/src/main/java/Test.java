public class Test {
    public static void main(String[] args) {
//        int num =1;
////        int count =0;
////        for(int i = 101; i < 200; i++)
////        {
////            boolean b = false;
////            for(int j = 2; j <= i-1; j++)
////            {
////
////                if( i % j == 0 )
////                {
////                    b = false;
////                    break;
////                }
////                else
////                {
////                    b = true;
////                }
////            }
////            if(b == true)
////            {
////                System.out.println(i);
////                count+=num;
////                System.out.println("个数"+count);
////            }
////        }
//        int sum =0;
//        int a =1;
//        for (int i =1;i<11;i++){
//            a*=i;
//            sum+=a;
//        }
//        System.out.println(sum);
        for(int a = 0; a<9;a++){             //第一个for循环控制循环次数（显示几行）
            for(int d = 9-a-1;d>0;d--){
                System.out.print("  ");  //这里的第二个for循环是让数字居中显示
            }
            for(int b = a+1;b>0;b--){        //第三个for循环从大到小
                System.out.print(b+" ");
                if(b==1){
                    for(int c = b+1;c<a+2;c++){    //这里的循环数字从小到大
                        System.out.print(c+" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
