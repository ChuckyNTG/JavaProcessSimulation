import process.Process;
import memory.Memory;

public class Main
{
    public static void main(String args[])
    {
        Memory manager = new Memory(1024);
        Process p1 = new Process(manager);
        Process p2 = new Process(manager);
        Process p3 = new Process(manager);
        Process p4 = new Process(manager);
        Process p5 = new Process(manager);
        System.out.println("Process P1:" + p1.GetPid());
        System.out.println("Process P2:" + p2.GetPid());
    }    
}
