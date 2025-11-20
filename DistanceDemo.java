class Distance{
    private int kms,mts;
    Distance(){}
    Distance(int kms,int mts){
        this.kms=kms;                                                                                                                                                                                                                                                                   
        this.mts=mts;
    }
    public void set(int nkms,int nmts){
        kms=nkms;
        mts=nmts;
    }
    public void cmp(Distance obj){
        if(this.kms>obj.kms)
            System.out.println("Highest distance is "+this.kms+" "+this.mts);
        else if(this.kms<obj.kms)
            System.out.println("Highest distance is "+obj.kms+" "+obj.mts);
        else if(this.mts>obj.mts)
            System.out.println("Highest distance is "+this.kms+" "+this.mts);
        else if(this.mts<obj.mts)
            System.out.println("Highest distance is "+obj.kms+" "+obj.mts);
    }
    public void display(){
        System.out.println("ADDED DISTANCES ARE: "+kms+" "+mts);
    }
    Distance add(Distance obj2){
        int mts=this.mts+obj2.mts;
        int kms=this.kms+obj2.kms+(mts/1000);
        mts=mts%1000;
        return new Distance(kms,mts);
    }
}
public class DistanceDemo{
    public static void main(String [] args){
        Distance ob1=new Distance();
        Distance ob2=new Distance();
        ob1.set(3,7);
        ob2.set(3,5);
        Distance ob3=new Distance();
        ob3=ob1.add(ob2);
        ob1.cmp(ob2);
        ob3.display();
    }
}