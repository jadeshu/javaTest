import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class OperatingSystem1 {
    private int[] imgContent = new int[]{
    	  0xE9, 0x00, 0x00, 0xB8, 0x00, 0x00, 0x8E, 0xD0, 0x8E,
    	  0xD8, 0x8E, 0xC0, 0xBE, 0x24, 0x7C, 0x8A, 0x04, 0x81, 
    	  0xC6, 0x01, 0x00, 0x3C, 0x00, 0x74, 0x07, 0xB4, 0x0E,
    	  0xCD, 0x10, 0xE9, 0xEF, 0xFF, 0xF4, 0xE9, 0xFC, 0xFF,
    	  0x0A, 0x0A 
    };

    private ArrayList<Integer> imgByteToWrite = new ArrayList<Integer>();

    public OperatingSystem1(String s) {
    	// 将二进制汇编指令存入imgByteToWrite内
        for (int i = 0; i < imgContent.length; i++) {
            imgByteToWrite.add(imgContent[i]);
        }
        
        // 添加换行
        imgByteToWrite.add(0x0a);
        
        for (int j = 0; j < s.length(); j++) {
            imgByteToWrite.add((int)s.charAt(j));
        }
        
        // 添加换行
        imgByteToWrite.add(0x0a);

        int len = 0x1fe;
        int curSize = imgByteToWrite.size();
        // 从前面字符有效位(curSize)一直到0x1fe位填充0数值
        for (int k = 0; k < len - curSize; k++) {
            imgByteToWrite.add(0);
        }

        // MBR引导区结束标志0xaa55
        //0x1fe:  0x55
        //0x1ff:  0xaa
        imgByteToWrite.add(0x55);
        imgByteToWrite.add(0xaa);
    }

    public void makeFllopy()   {
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream("system.img"));
            for (int i = 0; i < imgByteToWrite.size(); i++) {
                out.writeByte(imgByteToWrite.get(i).byteValue());
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        OperatingSystem1 op = new OperatingSystem1("hello,jadeshu!");
        op.makeFllopy();
    }
}