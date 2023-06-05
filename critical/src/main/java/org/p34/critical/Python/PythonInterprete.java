package org.p34.critical.Python;
import org.python.core.Py;
import org.python.core.PyFunction;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Isabella
 * @create: 2023-06-03 21:34
 **/
public class PythonInterprete {
    public static void main(String[] args) throws IOException {
        PythonInterprete pythonInterprete=new PythonInterprete();
        pythonInterprete.userPython();
    }

    public Map userPython() throws IOException {
        Map map=new HashMap<>();
        int name=35622479;
            try {
                // 创建ProcessBuilder对象

                ProcessBuilder pb = new ProcessBuilder("python", "C:\\Users\\86187\\IdeaProjects\\critical\\src\\main\\python\\getComments.py",
                        ""+name);
                pb.redirectErrorStream(true);

                // 启动新进程
                Process process = pb.start();

                // 读取Python脚本的输出
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
                String line;
                while ((line = reader.readLine()) != null) {
                    map.put("评论",line);
                    System.out.println(line);
                }

                // 等待进程结束
                int exitCode = process.waitFor();
                System.out.println("Python脚本的退出码是：" + exitCode);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        return map;
    }


}
