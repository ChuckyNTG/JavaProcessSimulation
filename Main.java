import process.Process;

public class Main
{
    public static void main(String args[])
    {
        Process p1 = new Process();
        Process p2 = new Process();
        System.out.println("Process P1:" + p1.GetPid());
        System.out.println("Process P2:" + p2.GetPid());
    }    
}
