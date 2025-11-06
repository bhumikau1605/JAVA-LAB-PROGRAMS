package SEE;
import CIE.Personal;
public class Externals extends Personal{
    public int seeMarks[] = new int[5];
    public Externals(String usn,String name,int sem, int marks[]){
        super(usn,name,sem);
        for(int i=0;i<5;i++){
            this.seeMarks[i]=marks[i];
        }
    }
}
