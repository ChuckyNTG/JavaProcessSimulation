package memory;

public class Memory
{
    private static int max_memory;
    private static int allocated_total;
    private static int free_total;

    public Memory(int max_mem)
    {
        max_memory = max_mem;
        allocated_total = 0;
        free_total = max_mem;
    } 

    private static void malloc(int size)
    {
        if(max_memory>size)
        {
            allocated_total += size;    
            free_total -= size;
        }
        else
            System.out.println("Not Enough Memory!Free: " + free_total);
    }
}
    
