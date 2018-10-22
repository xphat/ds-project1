
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import com.sun.speech.freetts.Voice; 
import com.sun.speech.freetts.VoiceManager; 
import java.util.concurrent.*;

class Reader  {
    //UNCOMMENT APPROPRIATE LINE    
    //static DictionSeq dict;
    static DictionBin dict;
    private boolean initComplete = false;

    public Reader(UI u) throws Exception
    {
        //UNCOMMENT APPROPRIATE LINE    
        //dict = new DictionSeq();
          dict = new DictionBin();
        System.setProperty("mbrola.base", ".\\mbrola");
        listAllVoices();
        initComplete = true;
        u.btnTranslate.setEnabled(true);
        u.btnSelectData.setEnabled(true);
        //you can remove the lines below after completing the  ADT
       System.out.println("You need to complete the ADT before doing translations");
        say("You need to complete the A.D.T.before doing translations");
   
    }

    public void translateFile() throws Exception {
        long startTime, endTime;
             JFileChooser datafile = new JFileChooser();
            File workingDirectory = new File(System.getProperty("user.dir"));
            datafile.setCurrentDirectory(workingDirectory);

            FileNameExtensionFilter filter = new FileNameExtensionFilter("Input Files","txt","txt");
            datafile.setFileFilter(filter);

            int  selopt = datafile.showOpenDialog(null);

            if (selopt == JFileChooser.APPROVE_OPTION) {
                File datfile = datafile.getSelectedFile();
                Scanner fileScan = new Scanner(datfile);
                String eng,span;

                startTime =System.currentTimeMillis();

                while(fileScan.hasNext())
                {
                    eng = fileScan.next();
                    span =dict.translate(eng);                                                                                                                          
                    System.out.println(eng + "::::"+ span);
                    say(span);
                }

                endTime = System.currentTimeMillis();
                System.out.println("Duration : " + (endTime - startTime)+ " milliseconds ");

            }
        }
    

    public void translateText(String sentence) throws Exception {
        long startTime, endTime;


            Scanner txtScan = new Scanner(sentence);
            String eng,span;

            startTime =System.currentTimeMillis();

            while(txtScan.hasNext())
            {
                eng = txtScan.next();
                span =dict.translate(eng);                                                                                                                          
                System.out.println(eng + "::::"+ span);
                say(span);
            }

            endTime = System.currentTimeMillis();
            System.out.println("Duration : " + (endTime - startTime)+ " milliseconds ");

        }
    

    private static void say(String announcementMessage) {
        VoiceManager voiceManager = VoiceManager.getInstance();
        Voice helloVoice = voiceManager.getVoice("mbrola_us1");
        helloVoice.allocate();
        helloVoice.speak(announcementMessage);
        helloVoice.deallocate();
    }

    private static void listAllVoices() {
        System.out.println();
        System.out.println("All voices available:");
        VoiceManager voiceManager = VoiceManager.getInstance();
        Voice[] voices = voiceManager.getVoices();
        for (int i = 0; i < voices.length; i++) {
            System.out.println("    " + voices[i].getName()
                + " (" + voices[i].getDomain() + " domain)");
        }
    }
}
