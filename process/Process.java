package process;
import memory.Memory;

public class Process
{
    private int _pid;           //All processes have an id
    private int _addr_space;    //All processes have an address space
    private Memory mem_manager; //All processes have access to the memory manager
    private int _children;      //Processes can have children
    
    public Process (Memory m)
    {
        _pid = Pid.GetPid();
        mem_manager = m;
        if(mem_manager.malloc(256))
            _addr_space = 1;
        else
            _addr_space = 0;
    }     

    public int GetPid()
    {
        return _pid; 
    }

}
