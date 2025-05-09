public class NearestInt {
    public void NearestInt(int num,int m) {
        int q=num/m;
        int lb=q*m;
        int un=(q+1)*m;
        int lbDiff=Math.abs(num-lb);
        int unDiff=Math.abs(num-un);
        if(lbDiff>unDiff){
            System.out.println(un);
        }
        else if(lbDiff<unDiff){
            System.out.println(lb);
        }
        else{
            System.out.println("Both are equal");
        }
    }

    public static void main(String[] args) {
        NearestInt obj=new NearestInt();
        obj.NearestInt(10,3);
        obj.NearestInt(10,4);
        obj.NearestInt(10,5);
        obj.NearestInt(10,6);
    }
}
