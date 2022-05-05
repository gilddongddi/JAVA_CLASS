// 비디오 프레임과 자막을 단일 쓰레드로 출력
package sec01_theneedforthread.EX01_TheNeedForThread;

import groovy.console.ui.SystemOutputInterceptor;

public class TheNeedForThread {
    public static void main(String[] args){

        //Video Frame 1~5
        int[] intArray = {1,2,3,4,5};

        //subtitle number. one~five
        String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};

        //output video_freame
        for(int i = 0; i< intArray.length;i++){
            System.out.println("(비디오 프레임) " + intArray[i]);
            try{Thread.sleep(400);} catch(InterruptedException e){}
        }
        // output subtitle number.
        for(int i = 0; i< strArray.length;i++){
            System.out.println(" - (자막 번호) " + strArray[i]);
            try{Thread.sleep(400);} catch(InterruptedException e){}
        }
    }
}
