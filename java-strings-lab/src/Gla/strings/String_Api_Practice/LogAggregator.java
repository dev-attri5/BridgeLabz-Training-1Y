package Gla.strings.String_Api_Practice;

public class LogAggregator{
    static StringBuffer log = new StringBuffer();
    static class Service extends Thread{
        String name;
        Service(String n){name=n;}
        public void run(){
            for(int i=1;i<=5;i++){
                log.append("[").append(System.currentTimeMillis()).append("] ")
                   .append(name).append(" log ").append(i).append("\n");
            }
        }
    }
    public static void main(String[] args)throws Exception{
        new Service("Web").start();
        new Service("DB").start();
        new Service("Cache").start();
    }
}
