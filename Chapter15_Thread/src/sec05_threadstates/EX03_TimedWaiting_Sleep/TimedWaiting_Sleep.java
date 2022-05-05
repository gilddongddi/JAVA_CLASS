// Thread.sleep() 메서드를 이용한 TIMED_WAITING과 interrupt()
package sec05_threadstates.EX03_TimedWaiting_Sleep;

class MyThread extends Thread{
    @Override
    public void run(){
        try{
            Thread.sleep(3000);     // 시작과 동시에 3초 정지
        } catch(InterruptedException e){
            System.out.println(" -- sleep() 진행 중 interrupt() 발생");
            for(long i = 0; i< 1000000000L; i++){}  // 시간 지연
        }
    }
}
public class TimedWaiting_Sleep {
    public static void main(String[] args){

        MyThread myThread = new MyThread();     // MyThread 객체생성
        myThread.start();           // MyThread 실행

        // 실행한지 0.1초 후에 쓰레드 상태 출력 - 쓰레드가 시작할 준비시간을 주는 것
        try {Thread.sleep(100);} catch(InterruptedException e){}
        System.out.println("MyThread State = " + myThread.getState());

        //TIMED_WAITING
        myThread.interrupt();       // interrupt() 매서드 호출함

        // interrupt() 매서드 호출하고 0.1초 후에 상태 출력 - 매서드 실행할 준비시간을 주는 것
        try{Thread.sleep(100);} catch (InterruptedException e){}
        System.out.println("MyThread State = " + myThread.getState());
    }
}
