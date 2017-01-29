package multidevicedownloader.arjunsuresh.com.multidevicedownloader;

/**
 * Created by arjun on 29/1/17.
 */


import java.net.MalformedURLException;
import java.net.URL;

public class Download_Task {

    public enum states {

CHECKING_RESUME_SUPPORT,
        READYTOSTART,
        RUNNING,
        PAUSED,
        STOPPED,
        COMPLETED


    }
    String url="";
    String name="";
    double progress=0.0;
    int start=-1,end=-1;

    int state=0;

    Download_Task(String url,int start,int end,String fname)
    {
        URL url1=null;
        try {
             url1 = new URL(url);
        }
        catch(MalformedURLException ex)
        {
            ex.printStackTrace();

        }





    }
    public boolean isresumesupported()
    {
//send head request check for range header if exists then true;
    }

public void startdownload()

{
new Thread(new Runnable() {
    @Override
    public void run() {



    }
});



}
    public void pausedownload()
    {



    }
    public void resumedownload()
    {







    }
    public void stopdownload()
    {

    }



}
