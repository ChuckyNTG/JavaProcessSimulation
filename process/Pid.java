package process;

public class Pid
{
    private static int _pid = -1;

    public static int GetPid()
    {
        _pid++; 
        return _pid;
    }
}
