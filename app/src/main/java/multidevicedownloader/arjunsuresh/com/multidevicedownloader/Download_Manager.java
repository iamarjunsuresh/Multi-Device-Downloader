package multidevicedownloader.arjunsuresh.com.multidevicedownloader;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by arjun on 29/1/17.
 */
public class Download_Manager {
ArrayList<Download_Task> downloads;
public void add(Download_Task d)
{



}
public ArrayList<Download_Task> getDownloadtask()
{
    return  downloads;
}
public void remove(Download_Task d)
{



}
    public void startall()
    {
for(int i=0;i<downloads.size();i++)
{
    downloads.get(i).startdownload();

}
    }
    public void  resumeall()
    {
        for(int i=0;i<downloads.size();i++)
        {
            downloads.get(i).resumedownload();

        }
    }
public void stop()
{
    for(int i=0;i<downloads.size();i++)
    {
        downloads.get(i).stopdownload();

    }


}
}
