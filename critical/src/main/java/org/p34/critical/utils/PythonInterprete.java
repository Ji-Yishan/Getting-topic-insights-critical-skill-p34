package org.p34.critical.utils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Isabella
 * @create: 2023-06-03 21:34
 **/
public class PythonInterprete {
    public static void main(String[] args) throws IOException {
        PythonInterprete pythonInterprete=new PythonInterprete();
        pythonInterprete.userPython(35653205,1);
    }

    public Map userPython(int name,int numOfComment) throws IOException {
        Map map=new HashMap<>();
//        这边数量是评论的第几页
        numOfComment=numOfComment*20;
        int serial=0;
            try {
                // 创建ProcessBuilder对象

                ProcessBuilder pb = new ProcessBuilder("python", "C:\\Users\\86187\\IdeaProjects\\critical\\src\\main\\python\\getComments.py",
                        ""+name,""+numOfComment);
                pb.redirectErrorStream(true);

                // 启动新进程
                Process process = pb.start();

                // 读取Python脚本的输出
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("=====================");
                    map.put(serial+"",line);
//                    System.out.println(map.get(""+serial));
                    System.out.println(line);
                    serial=serial+1;
                }

                // 等待进程结束
                int exitCode = process.waitFor();
                System.out.println("Python脚本的退出码是：" + exitCode);
                System.out.println(map);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        return map;
    }


}
