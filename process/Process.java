package process;

public class Process
{
    private int _pid;
    private int _addr_space;
    private int _children;
    
    public Process ()
    {
        _pid = Pid.GetPid();
    }     

    public int GetPid()
    {
        return _pid; 
    };
}
