package Demo;
import java.util.Scanner;

public class TestDemo1 {
    private static  int mScores = 0;
    private static  int mTotalScore = 0;
    private static  boolean isFirst = true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputNum = scanner.next(); // next方法不识别空格
        for (int i = 0;i<inputNum.length();i++){
            if (!String.valueOf(inputNum.charAt(i)).equals(" ")){
                inputNum +=inputNum.charAt(i);
            }
        }
        System.out.print(" "+inputNum);
        for (int i=0;i<inputNum.length();i++){
            String n = inputNum.charAt(i)+"";
            int number = Integer.parseInt(n);
            int result = calculateNum(number);
            if (result == 0){
                break ;
            }else if(result == -1){
                System.out.print("输入有误");
                return;
            } else {
                mTotalScore = mTotalScore + result;
            }
            isFirst = false;
        }
        System.out.print("得分为："+mTotalScore);
    }

    private static int calculateNum(int number) {
        System.out.print("number:"+number+"isFirst:"+isFirst);
        if (number == 0){
            mScores = 0;
            return mScores;
        }else if (number == 1){
            mScores = 1;
            return mScores;
        }else if (number == 2 && isFirst){
            mScores = 2;
            return mScores;
        } else if (number == 2 && mScores>=2){
            mScores = mScores+2;
            return mScores;
        } else if (number == 2){
            mScores = 2;
            return mScores;
        }
        return  -1;
    }
}
