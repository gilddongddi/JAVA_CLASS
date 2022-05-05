// 방법 1 : 2개의 쓰레드 활용(main, SMIFileThread)

package sec02_createandstartthread.EX01_CreateAndStartThread_M1C1;

// Thread 클래스를 상속해 클래스를 생성한 후 쓰레드 2개 생성하겠다.

class SMIFileThread extends Thread{
    @Override
    public void run(){
        // 자막 번호 하나~다섯
        String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
        try{Thread.sleep(10);} catch(InterruptedException e){}
        // 자막 번호 출력
        for(int i = 0; i<strArray.length;i++){
            System.out.println(" - (자막 번호) " + strArray[i]);
            try{Thread.sleep(200);} catch(InterruptedException e){}
        }
    }
}

public class CreateAndStartThread_M1C1 {
    public static void main(String[] args){

        // main 매서드 안에서 SMIFileThread 객체 생성 및 시작한다
        Thread smiFileThread = new SMIFileThread();
        smiFileThread.start();

        // 비디오 프레임 번호 1~5 배열 생성
        int[] intArray = {1,2,3,4,5};

        // 비디오 프레임 번호 출력
        for(int i = 0; i< intArray.length; i++){
            System.out.print("(비디오 프레임) " + intArray[i]);
            try{Thread.sleep(200);} catch (InterruptedException e){}
        }
    }
}
