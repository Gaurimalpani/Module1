public class IfSample {
    public static void main(String[] args){
        int time;
        int crossing=0;
        int x_at=0;
        int y_at=100;
        int x_lap;
        int y_lap;

        // Loop Example
        for(time=0;time<100;time=time+1)
        {
            x_at = x_at + 2;
            y_at = y_at - 1;
            System.out.println("X="+x_at+" "+"Y="+y_at);
            if(x_at<y_at)
                crossing = crossing = 1 ;
        }
    }
}
