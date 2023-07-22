public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    static int []solve10(){
    int x=0,y=0,xfactorial=1,yfactorial=1,tenfactorial=0;
    boolean factorialfound=false;
    int []solve1=new int[2];
    for (int i=1;i<=10;i++){
        tenfactorial*=i;
    }
    for (x=0;x<10;x++){
        if (x>0){
        for (int i=1;i<=x;i++){
            xfactorial*=i;
            for (y=0;y<10;y++){
                if (y>0){
                for (int j=1;j<=y;j++){
                    yfactorial*=j;

                }
                }
                if (yfactorial+xfactorial==tenfactorial){
                    factorialfound=true;
                    break;

                }

            }
        }
        }
        if (factorialfound){
            break;
        }
    }
    if (x==10 && y==10){
        x=0;
        y=0;

    }
        solve1[0]=x;
        solve1[1]=y;
    return solve1;
    }
}